(ns project-with-clojure.loops
  (:import (jdk.dynalink.linker.support Lookup)))

(defn Loop
  []
  (println "\nLoop")

  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x))
      )
    )
  )
(Loop)