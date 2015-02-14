(defproject om-sync "0.1.1"
  :description "A sync component for Om"
  :url "http://github.com/swannodette/om-sync"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2850"
                  :scopre "provided"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"
                  :scope "provided"]
                 [org.omcljs/om "0.8.8" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.0.4"]]

  :cljsbuild { 
              :builds [{:id "test"
                        :source-paths ["src"]
                        :compiler {
                                   :output-to "app.js"
                                   :output-dir "out"
                                   :optimizations :none
                                   :source-map true}}]})
