(ns quiescent-react-extensions.react-waypoint
  (:require [quiescent.factory :as f]
            [cljsjs.react-waypoint]))

(def Waypoint (f/factory js/ReactWaypoint))
