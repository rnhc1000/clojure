(ns project-with-clojure.StructMAps
  (:import (clojure.lang PersistentHashMap$ArrayNode)))

(defn Pets
  []

  (defstruct pet :PetType :PetName)
  (def myPet (struct pet "dog" "Fido"))
  (println myPet)
  (def myOtherPet (struct-map pet :PetName "Fifi" :PetType "cat"))
  (println myOtherPet)
  (println (:PetName myPet))
  (def myNewPet (assoc myPet :PetName "Max"))
  (println myNewPet)
  (def myOtherNewPet (assoc myOtherPet :PetAge 10))
  (println myOtherNewPet)
  )
(Pets)