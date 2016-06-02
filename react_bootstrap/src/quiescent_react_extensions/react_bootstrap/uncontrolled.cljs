(ns quiescent-react-extensions.react-bootstrap.uncontrolled
  (:require [quiescent.factory :refer [factory]]
            [quiescent.dom.uncontrolled :refer [uncontrolled-component]]
            [cljsjs.react-bootstrap]))

(def FormControl (factory (uncontrolled-component "FormControl" js/ReactBootstrap.FormControl)))

; deprecatedS
(def Input (factory (uncontrolled-component "Input" js/ReactBootstrap.Input)))

; utility functions
(defn keep-cursor
  "Wrap this around your filtered value inside the onChange event to make the cursor
   stay in its place in uncontrolled inputs."
  [node value]
  (when (not= (.-value node) value)
    (let [old-length (count (.-value node))
          old-index (.-selectionStart node)]
      (set! (.-value node) value)
      (set! (.-selectionEnd node)
            (set! (.-selectionStart node)
                  (max 0 (+ (- (count value) old-length) old-index))))))
  value)
