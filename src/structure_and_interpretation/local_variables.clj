(ns structure-and-interpretation.local-variables)

; lambda <=> fn
; f(x,y) = x(1 + xy)^2 + y(1 - y) + (1 + xy)(1 - y)
; a = 1 + xy
; b = 1 - y
; f(x,y) = x.a^2 + y.b + ab
(defn square [x] (* x x))

(defn f1 [x y]
  (letfn [(f-helper [a b]
            (+ (* x (square a))
               (* y b)
               (* a b)))]
    (f-helper (+ 1 (* x y))
              (- 1 y))))

(defn f-lambda [x y]
  ((fn [a b]
     (+ (* x (square a))
        (* y b)
        (* a b)))
   (+ 1 (* x y))
   (- 1 y)))

;More convenience form.
(defn f-let [x y]
  (let [a (+ 1 (* x y)) b (- 1 y)]
    (+ (* x (square a))
       (* y b)
       (* a b))))