(ns quiescent-react-extensions.react-bootstrap.tab
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Tab
  Container
  Content
  Pane)
