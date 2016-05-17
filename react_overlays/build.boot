(set-env!
  :source-paths #{"react-overlays/src"}
  :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]
                  [quiescent "0.3.1.1-shyblower"]
                  [cljsjs/react-overlays "0.6.3-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.6.3-0-0")
(bootlaces! +version+)

(task-options!
  pom  {:project     'quiescent-react-extensions/react-overlays
        :version     +version+
        :description "react-overlays for Quiescent"
        :url         "https://github.com/shyblower/quiescent-react-extensions/tree/master/react_overlays"
        :scm         {:url "https://github.com/shyblower/quiescent-react-extensions.git"}
        :license     {"EPL" "https://raw.githubusercontent.com/shyblower/quiescent-react-extensions/master/LICENSE"}}
  target {:dir ["target"]})
