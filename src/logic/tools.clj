(ns logic.util)

(def reserved-symbols 
  #{'and 'nand 'or 'nor 'impl 'nimpl 'cimpl 'ncimpl 'equiv 'xor 'true 'false 'not})

(def n-ary-symbols
  #{'and 'or})

(defn boolean?
  "True if the parameter is of the type Boolean, false otherwise"
  [x]
  (= (class x) java.lang.Boolean))

(defn n-ary?
  [x]
  (contains? n-ary-symbols x))

(defn literal?
  "True if x is a constant (true/false) or an atom"
  [x]
  (or 
    (boolean? x) 
    (and (symbol? x) (not (contains? reserved-symbols x)))))

(def reconvert-map
  {'not "!"
   'or  "|"
   'and "&"})

(defn clj-to-fml 
  "Takes a formula in clojure code and produces the human formula of it (only 'and', 'or' and 'not')."
  [fml]
  (if (seq? fml)
    (let [op (first fml)
          arg1 (second fml)]
      (if (= op 'not)
        (str "!" (clj-to-fml arg1))
        (str "(" (clj-to-fml arg1) (apply str (map #(str (reconvert-map op) (clj-to-fml %)) (rest (rest fml)))) ")"))) 
    fml))

(defn- count-rec [f [cnt-op cnt-var]]
  (cond 
    (not (seq? f)) [cnt-op (inc cnt-var)]
    (= (first f) 'not) (count-rec (second f) [(inc cnt-op) cnt-var])
    :else (count-rec (nth f 2) (count-rec (second f) [(inc cnt-op) cnt-var]))
    ))

(comment
  (defn count-vars-ops [fml]
    (let [p-fml (parse fml)
          [cnt-op cnt-var] (count-rec p-fml [0 0])]
    
      (println "Number of characters:" (count fml))
      (println "Number of operators:" cnt-op)
      (println "Number of variables:" cnt-var))))

(comment
	(require '[parser_measures.formulas :as forms])
	
	(count-vars-ops forms/formula-usa)
	(count-vars-ops forms/formula-4-queens)
	(count-vars-ops forms/formula-8-queens)
	(count-vars-ops forms/formula-quarter-sudoku)
	(count-vars-ops forms/formula-half-sudoku)
	(count-vars-ops forms/formula-sudoku)
)