(set-env!
 :source-paths #{"src/quiescent-react-extensions"}
 :dependencies '[[adzerk/bootlaces "0.1.11" :scope "test"]
                 [cljsjs/react-bootstrap "0.21.2-0"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.21.2-0")
(bootlaces! +version+)

(task-options!
 pom  {:project     'tscheibl/quiescent-react-bootstrap
       :version     +version+
       :description "Quiescent tags for react-bootstrap"
       :url         "https://github.com/tscheibl/quiescent-react-extensions/"
       :scm         {:url "https://github.com/tscheibl/quiescent-react-extensions.git"}
       :license     {"EPL" "https://github.com/tscheibl/quiescent-react-extensions/blob/master/LICENSE"}})
