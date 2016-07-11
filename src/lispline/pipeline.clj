(ns lispline.pipeline
  (:use [tom.hashmap]))

(defn new-pipeline
  "Returns a new pipeline."
  []
  {:funcs-filename        nil
   :pipeline-filename     nil
   :graph              (list)})

(defn load-graph
  "Constructs and returns a graph given a pipeline filename."
  [pipeline-filename]
  (let [contents                     (slurp pipeline-filename)
        transformed-contents  (str "(use 'lispline.pipeline) "
                                   "(use 'lispline.node) "
                                   contents)]
    (load-string transformed-contents)))

(defn load-pipeline
  "Constructs and returns a pipeline given a path."
  [pipeline-path]
  (let [funcs-filename        (str pipeline-path "funcs.clj")
        pipeline-filename  (str pipeline-path "pipeline.clj")
        pipeline                               (new-pipeline)]
    (>>replace pipeline
               [:funcs-filename]     funcs-filename
               [:pipeline-filename]  pipeline-filename
               [:graph]              (load-graph pipeline-filename))))

(defn run-pipeline
  "Runs the given pipeline."
  [pipeline]
  (do nil))
