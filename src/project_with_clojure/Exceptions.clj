(ns project-with-clojure.Exceptions)

(defn ExHandling
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Exception Caught" (.getMessage e)))
    (catch Exception ex (println "Generic Exception Caught"))
    (finally  (println "Cleanup and move on"))
    )

  )
(ExHandling "hello")
