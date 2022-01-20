(ns rich4clojure.easy.problem-029
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Get the Caps =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [strings]
;; 
;; Write a function which takes a string and returns a new
;; string containing only the capital letters.

(def capital-letter? #(<= (int \A) (int %) (int \Z)))

(def __ #(apply str (filter capital-letter? %)))

(comment
  
  )

(tests
  (__ "HeLlO, WoRlD!") := "HLOWRD"
  (__ "nothing") := ""
  (__ "$#A(*&987Zf") := "AZ")

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/bdbcf005bcae10b15531ebe3a7d0be9c