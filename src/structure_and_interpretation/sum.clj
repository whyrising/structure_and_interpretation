(ns structure-and-interpretation.sum)

(defn sum [term a next b]
  (letfn [(iter [a result]
            (if (> a b) result
                        (iter (next a) (+ (term a) result))))] (iter a 0)))

(defn- sum-integers-recur [a b]
  (if (> a b) 0
              (+ a (sum-integers-recur (inc a) b))))

(defn sum-integers [a b]
  (sum identity a inc b))

(defn cube [x] (* x x x))

(defn sum-cubes [a b]
  (if (> a b) 0
              (sum cube a inc b)))