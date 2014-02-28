(ns gui.main)

(defn current-editor 
  "Returns the currently selected editor (due to tabs)."
  []
  (first (select (:content (selection editor-tabs)) [:<org.fife.ui.rsyntaxtextarea.RSyntaxTextArea!>])))

(defn parse-editor []
  "Parses the text of the editor and returns the clojure formula."
  (logic/parse (.getText (current-editor))))

(defn set-result! [result-widget]
  "Clears the result area and sets the new widget."
  (let [old (select results [:#res :*])]
    (apply remove! results old)
    (add! results (scrollable 
                    result-widget
                    :preferred-size [690 :by 200]))))

(defn set-table-result! [table-model & {:keys [auto-resize]
                                        :or {auto-resize :off}}]
  "Takes a TableModel and sets it with a JTable in result area."
  (set-result! (table
                 :auto-resize auto-resize
                 :model table-model)))

(defn set-text-result! [result-text]
  "Takes a string and displays it in the result area."
   (set-result! (text 
                  :multi-line? true
                  :editable? false
                  :wrap-lines? true
                  :text result-text)))

(def icon-folder "resources/icons/")

(defn icon-path
  "Takes a file name and gives the file object with the relative path to the correct icon folder, e.g.
  (icon-file \"save.gif\") does the same as (File. resources\\icons\\save.gif)."
  [file-name]
  (File. (str icon-folder file-name)))

(defn tab-count
  "Returns the number of tabs in the editor pane."
  []
  (.getTabCount editor-tabs))
  

(defn add-editor
  "Creates a new editor widget and adds it to the tabs for the editors."
  [title content node]
  (let [new-editor (scrollable (syntax/text-area :text content)
                               :preferred-size [690 :by 400])]
    (config! editor-tabs :tabs [{:title title :content new-editor}])
    (swap! *node-tabs* #(assoc % node (dec (tab-count))))
    (selection! editor-tabs (dec (tab-count)))))