(defproject hello-browser "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.456"]
                 [bidi "2.0.16"]]
  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-npm "0.6.2"]]
  :npm {:dependencies [[circular-json "0.3.1"]]}
  :cljsbuild {
  :builds [{
    :source-paths ["src"]
    :compiler {:main core
               :output-to "index.js"
               :target :nodejs
               :source-map false
               :optimizations :simple}}]})
