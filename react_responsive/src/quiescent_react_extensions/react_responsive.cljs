(ns quiescent-react-extensions.react-responsive
  (:require [quiescent.factory :as f]
            [cljsjs.react-responsive]))

(def MediaQuery (f/factory js/reactResponsive))
