(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]
                  [quiescent "0.3.1.1-shyblower"]
                  [cljsjs/react-bootstrap "0.29.4-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.29.4-0-1")
(bootlaces! +version+)

(task-options!
  pom  {:project     'quiescent-react-extensions/react-bootstrap
        :version     +version+
        :description "react-bootstrap for Quiescent"
        :url         "https://github.com/shyblower/quiescent-react-extensions/tree/master/react_bootstrap"
        :scm         {:url "https://github.com/shyblower/quiescent-react-extensions.git"}
        :license     {"EPL" "https://raw.githubusercontent.com/shyblower/quiescent-react-extensions/master/LICENSE"}}
  target {:dir ["target"]})
