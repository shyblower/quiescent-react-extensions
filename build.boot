(set-env!
 :source-paths #{"src/quiescent-react-extensions"}
 :dependencies '[[adzerk/bootlaces "0.1.11" :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "1.0.0")
(bootlaces! +version+)

(task-options!
 pom  {:project     'tscheibl/quiescent-react-extensions
       :version     +version+
       :description "A core.async based, action triggered state loop for clojurescript"
       :url         "https://github.com/tscheibl/clonut"
       :scm         {:url "https://github.com/tscheibl/clonut.git"}
       :license     {"EPL" "https://github.com/tscheibl/clonut/blob/master/LICENSE"}})
