(ns gui.main)

(defn handler-sat
  "Handler function for action 'sat solve'."
  [e]
  (let [raw-res (logic/sat-solve-formula (.getText editor))
        proc-res (map #(if (coll? %)
                         [(second %) false]
                         [% true]) raw-res)]
    (if (zero? (count proc-res))
      (set-table-result! [:columns [{:key :message :text "Message"}]
                          :rows [["not satisfiable"]]])
      (set-table-result! [:columns [{:key :symbol :text "Variable"} 
                                    {:key :value :text "Value"}]
                          :rows proc-res]))))

(defn handler-tt
  "Handler function for action 'truth table'."
  [e]
  (let [parsed (logic/parse (.getText editor))
        tt (logic/generate-truth-table parsed)
        vars (butlast (:symbols tt))
        var-keys (conj 
                   (vec (map 
                          (fn [key text]
                            {:key key :text (str text)}) 
                          (map keyword vars) 
                          vars))
                   {:key :result :text "\u03D5"})]
    
    (set-table-result! [:columns var-keys
                        :rows (:table tt)])))

(defn handler-cnf
  "Handler function for action 'cnf'."
  [e]
  (let [parsed (logic/parse (.getText editor))
        cnf (logic/transform-cnf parsed)]
    (set-text-result! (str (apply list cnf)))))

(defn handler-tseitin
 "Handler function for action 'tseitin cnf'."
 [e]
 (let [parsed (logic/parse (.getText editor))
       tcnf (:tseitin-formula (logic/transform-tseitin parsed))]
   (set-text-result! (str (apply list tcnf)))))