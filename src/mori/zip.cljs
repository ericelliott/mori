(ns mori.zip
  (:refer-clojure :exclude [replace next remove])
  (:require [clojure.zip :as zip]))

;; Zippers
(def ^:export zipper zip/zipper)
(def ^:export seq-zip zip/seq-zip)
(def ^:export vector-zip zip/vector-zip)
(def ^:export node zip/node)
(def ^:export is-branch zip/branch?)
(def ^:export children zip/children)
(def ^:export make-node zip/make-node)
(def ^:export path zip/path)
(def ^:export lefts zip/lefts)
(def ^:export rights zip/rights)
(def ^:export down zip/down)
(def ^:export up zip/up)
(def ^:export root zip/root)
(def ^:export right zip/right)
(def ^:export rightmost zip/rightmost)
(def ^:export left zip/left)
(def ^:export leftmost zip/leftmost)
(def ^:export insert-left zip/insert-left)
(def ^:export insert-right zip/insert-right)
(def ^:export replace zip/replace)
(def ^:export edit zip/edit)
(def ^:export insert-child zip/insert-child)
(def ^:export append-child zip/append-child)
(def ^:export next zip/next)
(def ^:export prev zip/prev)
(def ^:export is-end zip/end?)
(def ^:export remove zip/remove)
