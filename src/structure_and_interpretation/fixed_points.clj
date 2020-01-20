(ns structure-and-interpretation.fixed-points)

(defn h [x]
  (* (/ 1 2)
     (+ x
        (/ 25 x))))

(defn abs [x]
  (if (neg? x) (* -1 x) x))

(def tolerance 0.00001)

(defn close-enough? [v1 v2]
  (<= (abs (- v1 v2)) tolerance))

(defn fixed-points [f first-guess]
  (letfn [(try-guess [guess]
            (let [f-guess (f guess)]
              (if (close-enough? guess f-guess)
                guess
                (try-guess f-guess))))]
    (try-guess first-guess)))