(defproject hello-browser "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.456"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :cljsbuild {
  :builds [{
    :source-paths ["src"]
    :compiler {
               :main core
               :output-to "index.js"
               :target :nodejs
               :source-map "index.js.map"
               :optimizations :simple
               }}]})
