(ns cloud-fn.core
  (:require [bidi.bidi :as bidi]))

(def circular-json (js/require "circular-json"))

(defn parse-raw-req
  [raw-req]
  (js->clj (.parse js/JSON (.stringify circular-json raw-req)) :keywordize-keys true))

(def my-routes ["/" [["index.html" :index]
                    [true         :not-found]]])

(defn index-handler
  [req]
  (:headers req))

(defn greet
  [raw-req raw-res]
  (let [req (parse-raw-req raw-req)]
    (do
      (println (.-path raw-req))
      (println req)
      (println (bidi/match-route my-routes (:path req)))
      (.json raw-res (clj->js(:headers req))))))

(enable-console-print!)
(set! (.-exports js/module) #js {:greet greet})
