(ns quiescent-react-extensions.react-date-picker
  (:require [quiescent.factory :as f]
            [cljsjs.react-date-picker]))

(def DatePicker (f/factory js/ReactDatePicker))
