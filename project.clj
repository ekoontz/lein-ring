(defproject lein-ring "0.9.8-ekoontz"
  :description "Leiningen Ring plugin"
  :plugins [[s3-wagon-private "1.2.0"]]

  :url "https://github.com/weavejester/lein-ring"
  :scm {:name "git"
        :url "https://github.com/weavejester/lein-ring"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/data.xml "0.0.8"]
                 [leinjacker "0.4.2"]]
  :eval-in-leiningen true

  :repositories {"s3" {:url "s3p://ekoontz-repo/releases/"
                       :username :env/aws_access_key ;; gets environment variable AWS_ACCESS_KEY
                       :passphrase :env/aws_secret_key ;; gets environment variable AWS_SECRET_KEY
                       }})

  
