(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]
                  [quiescent "0.3.1-1"]
                  [cljsjs/react-responsive "1.1.13-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "1.1.13-0-0")
(bootlaces! +version+)

(task-options!
  pom  {:project     'quiescent-react-extensions/react-responsive
        :version     +version+
        :description "react-responsive for Quiescent"
        :url         "https://github.com/shyblower/quiescent-react-extensions/tree/master/react_responsive"
        :scm         {:url "https://github.com/shyblower/quiescent-react-extensions.git"}
        :license     {"EPL" "https://raw.githubusercontent.com/shyblower/quiescent-react-extensions/master/LICENSE"}}
  target {:dir ["target"]})
