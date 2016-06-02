(ns quiescent-react-extensions.react-bootstrap.media
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Media
  Body
  Heading
  Left
  List
  ListItem
  Right)
