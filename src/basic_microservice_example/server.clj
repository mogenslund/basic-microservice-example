(ns basic-microservice-example.server
  (:gen-class)
  (:require [basic-microservice-example.components :as components]
            [liq.core]))

(defn run-liquid
  "The entry-point for 'lein run-dev'"
  [& args]
  (println "\nCreating your [DEV] server...")
  (future (components/create-and-start-system! :local-system))
  (liq.core/-main))

(defn run-dev
  "The entry-point for 'lein run-dev'"
  [& args]
  (println "\nCreating your [DEV] server...")
  (components/create-and-start-system! :local-system))

(defn -main
  "The entry-point for 'lein run'"
  [& args]
  (println "\nCreating your server...")
  (components/create-and-start-system! :base-system))
