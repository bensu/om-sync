(defproject om-syncing "0.1.2"
  :description "Fork of om-sync"
  :url "http://github.com/bensu/om-syncing"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :scm {:name "git"
        :url "https://github.com/bensu/om-syncing"}

  :signing {:gpg-key "sbensu@gmail.com"}

  :deploy-repositories [["clojars" {:creds :gpg}]]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2850"
                  :scope "provided"]
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
