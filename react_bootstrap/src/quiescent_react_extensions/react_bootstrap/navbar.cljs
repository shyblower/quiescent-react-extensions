(ns quiescent-react-extensions.react-bootstrap.navbar
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Navbar
  Brand
  Collapse
  ControlledComponent
  Header
  Toggle
  Form
  Link
  Text)
