(ns lispline.core
  (:use [lispline.pipeline])
  (:gen-class))

(defn -main
  "Loads a runs a pipeline."
  [pipeline-path]
  (let [pipeline (load-pipeline pipeline-path)]
      (run-pipeline pipeline)))
