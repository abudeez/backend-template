(ns com.iraqidata.tasks.day-one
 (:require [clj-time.core :as time]
           [clj-time.local :as local]))


;; 1. Write a function that takes one argument as input and prints that
;; argument.
(defn print-Arg [argument]
  (println argument))
;; example
(print-Arg "hello friend")


;; 2. Write a function that adds `1` to a number only if the input is odd,
(defn ureEven [v]
  (if (odd? v)
  (+ v 1)
  ))
;;example
(ureEven 3)


;; 3. Write a function that takes 3 arguments, `name`, `year-of-birth`, and
;; `current-year`. and returns a map with the following keys: `name`, `age`.
(defn infoo [name yearOB current-year]
  (def age (- current-year yearOB))
  {:name name :age age}
  )
;;example
(infoo "Abdullah Muslim" 2000 2024)


;; 4. Write a function that takes the output of the above function and returns
;; `true` if the person is allowed to vote (assume the voting age is 18).
(defn Ability-to-vote [{:keys [name age]}]
  (if (>= age 18)
   (def message "can vote")
    (def message  "can not vote")    
    )
  (println name message)
  )
;;example 
(Ability-to-vote (infoo "Abdullah Muslim" 2006 2024))


;; OPTIONAL FOR BONUS POINTS

;; 5. Modify the function from number 3 to not need the `current-year`.

;; this requires a function that brings the current year automatically
;; so i googled it up and i found that i have to include 
;; clj-time.core namespace in the dependencies in the file project.clj
;; and run 'lein deps' in sh
;; and include it in the header of the current file
;; finally defining a variable to store the current year out of the whole date

(defn mod-infoo [name yearOB]
  (def current-year (time/year (local/local-now)))
  (def age (- current-year yearOB)  )   
  {:name name :age age}) 
;;example
(mod-infoo "abdullah" 2000)

