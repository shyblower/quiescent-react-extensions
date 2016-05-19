(ns quiescent-react-extensions.react-bootstrap.dropdown
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Dropdown
  Toggle
  Menu)
