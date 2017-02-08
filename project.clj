(defproject hello-browser "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.456"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :cljsbuild {
  :builds [{
    :source-paths ["src"]
    :compiler {:output-to "core.js"
               :target :nodejs
               :source-map "core.js.map"
               :optimizations :advanced
               }}]})
