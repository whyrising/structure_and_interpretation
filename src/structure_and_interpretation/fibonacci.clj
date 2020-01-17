(ns structure-and-interpretation.fibonacci)

(defn- fib-iter [a b count]
  (if (= count 0)
    b
    (fib-iter (+ a b) a (dec count))))

(defn fib [n]
  (let [fib0 0 fib1 1]
    (fib-iter fib1 fib0 n)))