(defmacro make-printer [name to-print]
    (list 'defn name [] (list 'println to-print)))

(make-printer my-printer "Cadena de ejemplo")
(my-printer)


(defmacro make-printer-short [name to-print]
    `(defn ~name [] (println ~to-print)))

(def x (macroexpand-1 (make-printer-short two "TWO")))

(println x)
(make-printer-short two "hello")
; (two)