(ns quiescent-react-extensions.react-bootstrap.navbar
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Navbar
  Brand
  Header
  Toggle
  Collapse
  Form
  Text
  Link)
