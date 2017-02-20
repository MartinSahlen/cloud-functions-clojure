(ns cloud-fn.core)

(defn greet
  [req, res]
  (.send res "Hello world!"))

(set! (.-exports js/module) #js {:greet greet})
