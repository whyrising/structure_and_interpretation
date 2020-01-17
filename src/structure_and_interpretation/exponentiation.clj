(ns structure-and-interpretation.exponentiation)

; b^n = b*b^(n-1)
; b^0 = 1
(defn- exp-recur [b n]
  (if (= n 0) 1
              (* b (exp-recur b (dec n)))))

(defn- exp-iter [b counter product]
  (if (= counter 0) product
                    (exp-iter b (dec counter) (* b product))))

(defn exp [b n]
  (if (= n 0) 1
              (exp-iter b n 1)))

; b^2 = b*b
; b^4 = b^2 * b^2
; b^8 = b^4 * b^4
(defn- square [x] (* x x))

(defn exp-fast [b n]
  (cond (= n 0) 1
        (even? n) (square (exp-fast b (/ n 2)))
        :else (* b (exp-fast b (dec n)))))