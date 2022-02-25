(ns rich4clojure.medium.problem-054
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Partition a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs core-functions]
;; 
;; Write a function which returns a sequence of lists of x
;; items each. Lists of less than x items should not be
;; returned.

(def restricted [partition partition-all])

(defn my-partition
  [n s]
  (lazy-seq
   (when (>= (count s) n)
     (let [[run rst] (split-at n s)]
       (cons run (my-partition n rst))))))

(def __ my-partition)

(comment
  
  )

(tests
  (__ 3 (range 9)) := '((0 1 2) (3 4 5) (6 7 8))
  (__ 2 (range 8)) := '((0 1) (2 3) (4 5) (6 7))
  (__ 3 (range 8)) := '((0 1 2) (3 4 5)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/1da137c7927d083dfbb4db1686a3e3cf