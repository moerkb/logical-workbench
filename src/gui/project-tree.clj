(ns gui.main)

; A hand made project tree example
;(def test-tree
;  (Node. "Projects"
;         nil
;         (list
;           (Node. "Project_1"
;                  "This is a test project."
;                  (list
;                    (Node. "Formel_1" "a & b")
;                    (Node. "Formel_2" "a -> b")))
;           (Node. "Project_2"
;                  ""
;                  (list
;                    (Node. "Formel_3" "a <-> b")
;                    (Node. "Formel_4" "a !| b"))))))

(defn file2node
  [f]
  (std-catch
	  (let [get-data (fn [f] (let [file-type (last (str/split f #"\."))
	                               data (slurp f)]
	                           (case file-type
                               "mpf" (read-string (tools/mpf2lwf data))
                               (alert "Wrong file type."))))
	        
	        data (get-data f)]
	    
	    (Node. (apply str (drop-last 4 (last (str/split f #"/"))))
	           (first data)
	           f
	           (vec (map
                   #(Node.
                      (:name %)
                      (:proposition %))
                   (rest data)))))
   (catch java.io.FileNotFoundException e
     (alert (str "Can not find file " f ".")))))

(defn node2lwf-structure
  "Only for project nodes!!!"
  [n]
  (when (.path n)
    (apply vector (.content n)
           (for [e (.children n)]
             {:name (.name e)
              :proposition (.content e)}))))

(defn- projects
  [file-vector]
  (let [get-project-list (fn [f] (vec (remove nil? (map file2node f))))]
    
    (Node. "Projects"
           nil
           "true"
         (if (first file-vector)
             (get-project-list file-vector)
             nil))))

(def tree-of-projects
  (projects (:project-tree (get-settings))))

(def tree-model
  (let [children #(.children %)
        branch? #(.path %)
        tree tree-of-projects]
    (set-setting
          :project-tree
          (vec (map #(.path %) (.children tree))))
    (simple-tree-model
		  branch?
		  children
		  tree)))

(defn change-settings
  []
  (set-setting
    :project-tree
    (vec (map #(.path %) (.children tree-of-projects)))))

(defn change-project-list
  [new-project-list]
  (set! (.children tree-of-projects) new-project-list)
  (node-structure-changed tree-model (list tree-of-projects))
  (change-settings))

(defn change-node-name ;(node-changed tree-model node-path)
  [node-path new-name]
  (!set (.name (last node-path)) new-name)
  (node-changed tree-model node-path)
  (change-settings))

(defn change-node-content ;(node-changed tree-model node-path)
  [node-path new-content]
  )

(defn change-node-position ;(node-changed tree-model node-path)
  [node-path up?]
  )

(defn add-node
  [parent-path new-node]
  (set! (.children (last parent-path)) (vec (conj (.children (last parent-path)) new-node)))
  (node-inserted tree-model (conj (vec parent-path) new-node))
  (change-settings))

(defn rm-node
  [removed-node-path]
  (let [parent-path (apply list(butlast removed-node-path))
        rm-node (last removed-node-path)
        index (.indexOf (.children (last parent-path)) rm-node)]
    (node-removed tree-model parent-path index rm-node)
    (set! (.children (last parent-path)) (vec (remove nil? (assoc (.children (last parent-path)) index nil))))
    (change-settings)))

(defn file-is-open?
  [file]
  (let [open-files (set (map #(.path %) (.children tree-of-projects)))
        f (tools/path-conformer file)]
    (contains? open-files f)))

(defn save-project
  "Saves a project to a disc file."
  [project-node]
  (let [path (.path project-node)
        path-length (count path)
        file-ending (subs path (- path-length 3) path-length)
        node-content (node2lwf-structure project-node)
        new-content (if (= "mpf" file-ending)
                      (tools/lwf2mpf (str node-content))
                      node-content)
        ]
    (spit path new-content)))
