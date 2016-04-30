(ns quiescent-react-extensions.react-bootstrap-table
  (:require [quiescent.factory :as f]
            [cljsjs.react-bootstrap-table]))

(f/def-factories js/ReactBootstrapTable
    BootstrapTable
    TableHeaderColumn
    TableDataSet)
