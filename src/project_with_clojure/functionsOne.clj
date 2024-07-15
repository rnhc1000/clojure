(ns project-with-clojure.functionsOne
  (:gen-class))
(def increment (fn [x] (+ x 1)))
(defn increment_set
  [x]
  (map increment [x])
  )

(#(println "Ricardo Ferreira again..."))
(defn -main
  "More functions"
  []
  (println "Ricardo Ferreira")
  (println "Perpetua Costa")
  (println (+ 2 5))
  )

(defn DataTypes []
  (def a 57)
  (def b 7.57)

  (println a)
  (println b)
  )
(DataTypes)
(increment_set [1 2 3])



