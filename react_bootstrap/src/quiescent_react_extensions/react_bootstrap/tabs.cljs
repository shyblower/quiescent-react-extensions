(ns quiescent-react-extensions.react-bootstrap.tabs
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Tabs
  ControlledComponent)
