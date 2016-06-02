(ns quiescent-react-extensions.react-bootstrap.breadcrumb
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Breadcrumb
  Item)
