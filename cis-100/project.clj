(defproject cis-100 "0.1.0-SNAPSHOT"
  :description "My attempt to emulate the compiler from a puzzle game I admire"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot cis-100.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
