(ns project-with-clojure.petstore)

(defn ageToPet
  "This is to show pet age"
  [x]
  (def petsAge {'dog 7, 'cat 8, 'goldfish 9})
  (get petsAge x))

(defn age
  "This function returns the age of a cat"
  [petName petType petsAge]
  (def ratio (ageToPet petType))
  (println petName "is" (* ratio petsAge) "years old"))

(age "Fido" 'dog 4)
(age "Fifi" 'cat 2)
(age "Fox" 'goldfish 5)

