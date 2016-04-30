(ns quiescent-react-extensions.react-bootstrap.modal
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Modal
  Dialog
  Header
  Title
  Body
  Footer)
