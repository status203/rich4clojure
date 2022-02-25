(ns rich4clojure.medium.problem-055
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Count Occurrences =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs core-functions]
;; 
;; Write a function which returns a map containing the
;; number of occurrences of each distinct item in a
;; sequence.

(def restricted [frequencies])

(defn freqs
  [s]
  (reduce (fn [acc v] (if (contains? acc v)
                         (update acc v inc)
                         (assoc acc v 1)))
          {}
          s))

(def __ freqs)

(comment
  (def fninc (fnil inc 0))
  (fninc nil)
  (fninc 1)
  )

(tests
  (__ [1 1 2 3 2 1 1]) := {1 4, 2 2, 3 1}
  (__ [:b :a :b :a :b]) := {:a 2, :b 3}
  (__ '([1 2] [1 3] [1 3])) := {[1 2] 1, [1 3] 2})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/b1a32d924734a9c4b6e562363ec8b635