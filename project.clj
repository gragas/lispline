(defproject lispline "0.1.0"
  :description "A pipeline framework with Lisp-like pipeline definitions."
  :url "https://github.com/gragas/lispline"
  :license {:name "GPL v3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot lispline.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
