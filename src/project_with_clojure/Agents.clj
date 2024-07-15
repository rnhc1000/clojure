(ns project-with-clojure.Agents)

(defn Agents
  []
  (def amount (agent 100))
  (println @amount)
  (send amount inc)
  (println @amount)
  (println @amount)
  (send amount inc)
  (await-for 1000 amount)
  (println "Some time passed")
  (println @amount)
  (println (agent-error amount))
  )

(Agents)
