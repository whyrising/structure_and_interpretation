(ns structure-and-interpretation.sum)

(defn- sum-integers-iter [a b sum]
  (if (> a b) sum
              (recur (inc a) b (+ a sum))))

(defn- sum-integers-recur [a b]
  (if (> a b) 0
              (+ a (sum-integers-recur (inc a) b))))

(defn sum-integers [a b]
  (if (> a b) 0
              (sum-integers-iter a b 0)))

(defn cube [x] (* x x x))

(defn sum-cubes-iter [a b sum-cubes]
  (if (> a b) sum-cubes
              (recur (inc a) b (+ (cube a) sum-cubes))))

(defn sum-cubes [a b]
  (if (> a b) 0
              (sum-cubes-iter a b 0)))