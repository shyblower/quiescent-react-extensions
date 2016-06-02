(ns quiescent-react-extensions.react-bootstrap.carousel
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap]))

(f/def-factories js/ReactBootstrap.Carousel
  Caption
  Item)
