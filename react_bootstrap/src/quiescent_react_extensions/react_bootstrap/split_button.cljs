(ns quiescent-react-extensions.react-bootstrap.split-button
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.SplitButton
  Toggle)
