(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]
                  [quiescent "0.3.1.1-shyblower"]
                  [cljsjs/react-date-picker "4.0.10-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "4.0.10-0-0")
(bootlaces! +version+)

(task-options!
  pom  {:project     'quiescent-react-extensions/react-date-picker
        :version     +version+
        :description "react-date-picker for Quiescent"
        :url         "https://github.com/shyblower/quiescent-react-extensions/tree/master/react-date-picker"
        :scm         {:url "https://github.com/shyblower/quiescent-react-extensions.git"}
        :license     {"EPL" "https://raw.githubusercontent.com/shyblower/quiescent-react-extensions/master/LICENSE"}}
  target {:dir ["target"]})
