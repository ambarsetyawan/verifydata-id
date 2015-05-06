(defproject verifydata-id "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler verifydata-id.core/handler}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [liberator "0.12.2"]
                 [cats "0.4.0"]
                 [compojure "1.3.3"]
                 [enlive "1.1.5"]
                 [hiccup "1.0.5"]
                 [ring/ring-core "1.3.2"]])
