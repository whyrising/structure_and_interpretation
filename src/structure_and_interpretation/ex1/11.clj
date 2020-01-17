(ns structure-and-interpretation.ex1.11)
; { f(n) = n                                 ; if n <3
; { f(n) = f(n - 1) + 2f(n - 2) + 3f(n - 3)  ; if n >= 3

(defn- f-recur [n]
  (if (< n 3) n
              (+ (* 1 (f-recur (- n 1)))
                 (* 2 (f-recur (- n 2)))
                 (* 3 (f-recur (- n 3)))))
  )

(defn- f-iter [a b c count]
  (if (< count 3) a
                  (recur (+ a (* 2 b) (* 3 c))
                         a
                         b
                         (dec count))))
(defn f [n]
  (if (< n 3) n
              (f-iter 2 1 0 n)))