(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]
                  [quiescent "0.3.1"]
                  [cljsjs/react-bootstrap-table "1.6.0-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +lib-version+ "1.6.0-0")
(def +version+ (str +lib-version+ "-0"))

(bootlaces! +version+)

(task-options!
  pom  {:project     'quiescent-react-extensions/react-bootstrap-table
        :version     +version+
        :description "react-bootstrap-table for Quiescent"
        :url         "https://github.com/shyblower/quiescent-react-extensions/tree/master/react_bootstrap-table"
        :scm         {:url "https://github.com/shyblower/quiescent-react-extensions.git"}
        :license     {"EPL" "https://raw.githubusercontent.com/shyblower/quiescent-react-extensions/master/LICENSE"}}
  target {:dir ["target"]})
