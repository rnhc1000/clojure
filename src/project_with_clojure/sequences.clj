(ns project-with-clojure.sequences)
(defn Sequence
  []
  (def colors (seq ["red" "green" "blue"]))

  (println colors)

  (println (cons "yellow" colors))

  (println (cons colors "yellow"))

  (println (conj colors "yellow"))

  (println (concat colors ( seq ["black" "white"] )))

  (println (reverse colors))

  (println (first colors))

  (println (last colors))

  (println (sort colors))
  )
(Sequence)
