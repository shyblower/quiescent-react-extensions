(ns quiescent-react-extensions.react-bootstrap-datetimepicker
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap-datetimepicker]))

(def DateTimeField (f/factory js/ReactBootstrapDatetimepicker))
