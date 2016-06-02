(ns quiescent-react-extensions.react-bootstrap.input-group
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.InputGroup
  Addon
  Button)
