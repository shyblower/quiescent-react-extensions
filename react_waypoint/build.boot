(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]
                  [quiescent "0.3.2-shyblower" :scope "provided"]
                  [cljsjs/react-waypoint "2.0.2-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "2.0.2-0-0")
(bootlaces! +version+)

(task-options!
  pom  {:project     'quiescent-react-extensions/react-waypoint
        :version     +version+
        :description "react-waypoint for quiescent"
        :url         "https://github.com/shyblower/quiescent-react-extensions/tree/master/react_waypoint"
        :scm         {:url "https://github.com/shyblower/quiescent-react-extensions.git"}
        :license     {"EPL" "https://raw.githubusercontent.com/shyblower/quiescent-react-extensions/master/LICENSE"}}
  target {:dir ["target"]})
