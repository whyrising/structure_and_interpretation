(ns structure-and-interpretation.lists)

(defn scale-tree [tree factor]
  (map (fn [sub-tree]
         (println (str "sub-tree : " sub-tree " is " (if (list? sub-tree) "a list" "not a list")))
         (if (list? sub-tree)
           (scale-tree sub-tree factor)
           (* sub-tree factor)))
       tree))