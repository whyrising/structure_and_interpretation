(ns structure-and-interpretation.main
  (:require [structure-and-interpretation.fibonacci :refer :all])
  (:require [structure-and-interpretation.ex1.11 :refer :all])
  (:require [structure-and-interpretation.exponentiation :refer :all])
  (:require [structure-and-interpretation.sum :refer :all])
  (:require [structure-and-interpretation.local-variables :refer :all])
  )

(println (fib 5))

(println (f 5))
(println (exp 2 3))
(println (exp-fast 2 3))
(println (sum-integers 2 3))
(println (sum-cubes 2 3))
(println (f1 3 2))
(println (f-lambda 3 2))
(println (f-let 3 2))