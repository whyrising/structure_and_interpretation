(ns structure-and-interpretation.rational-numbers)

; n1/d1 + n2/d2 = (n1.d2 + d1.n2)/d1.d2
; n1/d1 - n2/d2 = (n1.d2 - d1.n2)/d1.d2
; n1/d1 * n2/d2 = (n1.n2)/(d1.d2)
; (n1/d1) / (n2/d2) = n1/d1 * d2/n2

; TODO : Implement a GCD procedure to reduce the numerator and the denominator
(defn make-rat [n d] (cons n [d]))

(defn numer [x] (first x))

(defn denom [x] (second x))

(defn print-rat [x]
  (newline)
  (print (numer x))
  (print "/")
  (print (denom x)))

(defn add-rat [x y]
  (make-rat (+ (* (numer x) (denom y))
               (* (numer y) (denom x)))
            (* (denom x) (denom y))))