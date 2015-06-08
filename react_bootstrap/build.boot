(set-env!
 :source-paths #{"react-bootstrap/src"}
 :dependencies '[[adzerk/bootlaces "0.1.11" :scope "test"]
                 [tscheibl/quiescent-toolbox "1.0.0"]
                 [cljsjs/react-bootstrap "0.21.2-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.21.2-0-0")
(bootlaces! +version+)

(task-options!
 pom  {:project     'quiescent-react-extensions/react-bootstrap
       :version     +version+
       :description "react-bootstrap for Quiescent"
       :url         "https://github.com/tscheibl/quiescent-react-extensions/tree/master/react_bootstrap"
       :scm         {:url "https://github.com/tscheibl/quiescent-react-extensions.git"}
       :license     {"EPL" "https://raw.githubusercontent.com/tscheibl/quiescent-react-extensions/master/LICENSE"}})
