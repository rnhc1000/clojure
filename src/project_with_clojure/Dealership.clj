(ns project-with-clojure.Dealership)

(defn isCouponValid
  [code]
  (defstruct coupon :Name :Discount)
  (def validCoupon (struct coupon "20Off" 0.8))
  (if (= (:Name validCoupon) code)
    true
    false
    )
  )
(defn getCarPrices
  [budget code]
  (def cars {"bmw" 60000, "ferrari" 10000, "fiat" 20000})

  (if (isCouponValid code)
    (do
      (println "The code is OK!")
      (def discount (:Discount validCoupon))
      (doseq [car cars]
        (println car)
        (def carType (first car))
        (def price (last car))
        (def priceDiscount (* price discount))
        (if (<= priceDiscount budget)
          (println "The" carType "costs" priceDiscount))

        )
      )
    (do
      (println "The code is NOT OK!")
      (doseq [car cars]
        (def carType (first car))
        (def price (last car)))
      (if (<= price budget)
        (println "The" carType "costs" price)
        )

      )
    )
  )

(getCarPrices 50000 "2Off")