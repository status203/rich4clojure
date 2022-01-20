(ns rich4clojure.easy.problem-028
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Flatten a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which flattens a sequence.

(def restricted [flatten])

(defn my-flatten
  [s]
  (reduce (fn [acc val]
            (if (sequential? val)
              (concat acc (my-flatten val))
              (concat acc (list val))))
          '()
          s))

(def __ my-flatten)

(comment
  
  )

(tests
  (__ '((1 2) 3 [4 [5 6]])) := '(1 2 3 4 5 6)
  (__ ["a" ["b"] "c"]) := '("a" "b" "c")
  (__ '((((:a))))) := '(:a))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/0c6e3c48cac7434882ca4b2c71ebfce1