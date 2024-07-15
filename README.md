## Clojure Challenge - @Ricardo Ferreira
Lisp, a fully parenthesized prefix notation language, has changed since its early days, and many dialects have existed over its history. 
Today, the best-known general-purpose Lisp dialects are Common Lisp, Scheme, Racket, and Clojure.
https://en.wikipedia.org/wiki/Lisp_(programming_language)

Clojure (/ˈkloʊʒər/, like closure) is a dynamic and functional dialect of the Lisp programming language on the Java platform.

Let's dive into it!
## _Tools_
- Clojure
- Leiningen
- IntelliJ Community Edition

## _Table of contents_
- [Clojure Challenge - @Ricardo Ferreira](#clojure challenge --- ricardo ferreira)
- [_Tools_](#tools)
- [_Table of contents_](#table-of-contents)
- [_Screenshot_](#screenshot)
- [_Links_](#links)
- [_Built with_](#built-with)
- [_What I practiced_](#what-i-practiced)
- [_Continued development_](#continued-development)
  - [_Useful resources_](#useful-resources)
- [_Author_](#author)
- [Acknowledgments](#acknowledgments)


## _Screenshot_
[![](./clojure.png)]()
## _Links_
- Live Site URL: [https://github.com/rnhc1000/clojure/] 
## _Built with_
[![My Skills](https://skillicons.dev/icons?i=clojure,java,git,idea,redhat)](https://skillicons.dev)


 ## _What I practiced_
``` clojure
(ns project-with-clojure.BankAccount)

(def buyerAccount (ref 100))
(def merchantAccount (ref 0))
(def prices {'pen 1, 'notebook 5, 'backpack 10})
(def items (ref []))

(defn printInfo
  []
  (println "\nPrintInfo")
  (println "buyerAccount:" @buyerAccount)
  (println "merchantAccount:" @merchantAccount)
  (println "Items:" @items)
   )

(defn buy
  [item]
  (def itemPrice (get prices item))
  (println itemPrice)
  (if (<= itemPrice @buyerAccount)
    (dosync
      (ref-set merchantAccount (+ @merchantAccount itemPrice))
      (ref-set buyerAccount (- @buyerAccount itemPrice))
      (def newItems (cons item @items))
      (ref-set items newItems)
      )
    (println "Insufficient funds ")
    )
  (printInfo)
  )

(buy 'pen)
(buy 'notebook)
``` 

## _Continued development_
- Next step: Java Concurrenty with Clojure.
- 
### _Useful resources_
- [https://clojure.org/index] Always trust and read the official documentation!
- [https://4clojure.oxal.org/]  A must stop by to tackle challenges.
- [https://clojure.camp/] Clojure is for everyone...
## _Author_
- Website - [https://www.ferreiras.dev.br]  
## Acknowledgments
