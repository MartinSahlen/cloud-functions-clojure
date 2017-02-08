(ns core)
  (defn ^:export greet
    [req, res]
    (.send res "Hello world!"))
