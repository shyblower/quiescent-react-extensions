(set-env!
  :source-paths #{"react-day-picker/src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]
                  [quiescent "0.3.1.1-shyblower" :scope "provided"]
                  [cljsjs/react-day-picker "2.0.1-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "2.0.1-0-0")
(bootlaces! +version+)

(task-options!
  pom  {:project     'quiescent-react-extensions/react-day-picker
        :version     +version+
        :description "react-day-picker for Quiescent"
        :url         "https://github.com/shyblower/quiescent-react-extensions/tree/master/react_day_picker"
        :scm         {:url "https://github.com/shyblower/quiescent-react-extensions.git"}
        :license     {"EPL" "https://raw.githubusercontent.com/shyblower/quiescent-react-extensions/master/LICENSE"}}
  target {:dir ["target"]})
