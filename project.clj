(defproject clojurescripting "1.0.0-SNAPSHOT"
  :description "Learning clojurescript"
  :url "http://documentup.com/gozala/clojurescripting/"
  :license { :name "MIT"
             :url "http://jeditoolkit.com/LICENSE" }
  :plugins [[lein-cljsbuild "0.1.2"]]
  :cljsbuild { :builds [{ :source-path "src"
                          :compiler { :output-to "lib/app.js"
                                      :optimizations :whitespace
                                      :pretty-print true }}]})