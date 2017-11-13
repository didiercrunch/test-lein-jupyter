(defproject test-lein-jupyter "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot test-lein-jupyter.core
  :target-path "target/%s"
  :plugins [[org.clojars.didiercrunch/lein-jupyter "0.1.9"]]
;;  :jupyter-options {:jupyter-path "/home/ubuntu/anaconda3/bin/jupyter"}
  :profiles {:uberjar {:aot :all}})
