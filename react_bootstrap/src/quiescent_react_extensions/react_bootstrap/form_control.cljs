(ns quiescent-react-extensions.react-bootstrap.form-control
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.FormControl
  Feedback
  Static)
