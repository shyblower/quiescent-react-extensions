(ns quiescent-react-extensions.react-bootstrap.tab-container
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.TabContainer
  ControlledComponent)
