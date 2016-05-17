(ns quiescent-react-extensions.react-overlays
  (:require [quiescent.factory :as f]
            [cljsjs.react-overlays]))

(f/def-factories js/ReactOverlays
  Affix
  AutoAffix
  Modal
  Overlay
  Portal
  Position
  Transition)
