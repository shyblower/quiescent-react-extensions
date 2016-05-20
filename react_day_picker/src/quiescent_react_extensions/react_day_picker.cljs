(ns quiescent-react-extensions.react-day-picker
  (:require [quiescent.factory :as f]
            [cljsjs.react-day-picker]))

(def DayPicker (f/factory js/ReactDayPicker))
