(ns project-with-clojure.atoms)

(defn Atoms
  []
  (def amount (atom 100))
  (println @amount)

  (swap! amount inc)
  (println @amount)
  (reset! amount 110)
  (println amount)
  (compare-and-set! amount 110 120)
  (println @amount)
  (compare-and-set! amount 120 150)
  (println @amount)
  )
(Atoms)