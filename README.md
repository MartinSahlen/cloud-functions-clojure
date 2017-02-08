# cloud-fn-test

A Clojure thing designed to test Google cloud functions https://cloud.google.com/functions/docs/quickstart.

Write your code using clojurescript and compile it to server-side node required by Google cloud functions.

Currently, this only implements a http function (which essentially are express handler functions). The idea of this
project is really to show that a pretty simple setup like this (very little dependencies and config required) enables
you to write code for cloud functions using Clojure <3!

Run `lein cljsbuild once` to compile the project. Based on what your namespaces are (currenty only `core`),
the index.js will export the function(s) in the node module format required by Google cloud functions. Pretty cool!


## License

Copyright © 2017 Martin Sahlen

Distributed under the MIT License
