(ns quiescent-react-extensions.react-bootstrap.uncontrolled
  (:require [quiescent.factory :refer [factory]]
            [quiescent.dom.uncontrolled :refer [uncontrolled-component]]
            [cljsjs.react-bootstrap]))

(def FormControl (factory (uncontrolled-component "FormControl" js/ReactBootstrap.FormControl)))

; deprecated
(def Input (factory (uncontrolled-component "Input" js/ReactBootstrap.Input)))

; utility functions
(defn- keep-cursor* [node value]
  (when (not= (.-value node) value)
    (let [old-length (count (.-value node))
          old-index (.-selectionStart node)]
      (set! (.-value node) value)
      (set! (.-selectionEnd node)
            (set! (.-selectionStart node)
                  (max 0 (+ (- (count value) old-length) old-index))))))
  value)

(defn keep-cursor [node-or-event value-or-func]
  "Wrap this around your filtered value or filter function inside
   the onChange event to make the cursor stay in its place in uncontrolled inputs.
   The first argument may be React's SyntheticEvent or the target node itself"
  (let [node (or (.-target node-or-event) node-or-event)
        value (if (fn? value-or-func)
                (value-or-func (.-value node))
                value-or-func)]
    (keep-cursor* node value)))
