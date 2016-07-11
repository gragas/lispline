(ns lispline.pipeline-test
  (:require [clojure.test :refer :all]
            [lispline.pipeline :refer :all]))

(deftest new-pipeline-test1
  (let [expected {:funcs-filename        nil
                  :pipeline-filename     nil
                  :graph              (list)}]
    (testing "Test new-pipeline."
      (is (= (new-pipeline) expected)))))

