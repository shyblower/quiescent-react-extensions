(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]
                  [quiescent "0.3.1"]
                  [cljsjs/react-bootstrap-datetimepicker "0.0.22-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +lib-version+ "0.0.22-0")
(def +version+ (str +lib-version+ "-0"))

(bootlaces! +version+)

(task-options!
  pom  {:project     'quiescent-react-extensions/react-bootstrap-datetimepicker
        :version     +version+
        :description "react-bootstrap-datetimepicker for Quiescent"
        :url         "https://github.com/shyblower/quiescent-react-extensions/tree/master/react_bootstrap-datetimepicker"
        :scm         {:url "https://github.com/shyblower/quiescent-react-extensions.git"}
        :license     {"EPL" "https://raw.githubusercontent.com/shyblower/quiescent-react-extensions/master/LICENSE"}}
  target {:dir ["target"]})
