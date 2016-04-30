(ns quiescent-react-extensions.react-bootstrap.uncontrolled
  (:require [quiescent.factory :refer [factory]]
            [quiescent.dom.uncontrolled :refer [uncontrolled-component]]
            [cljsjs.react-bootstrap]))

(def Input (factory (uncontrolled-component "Input" js/ReactBootstrap.Input)))
