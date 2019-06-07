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


; gran parte de Clojure está implementado en Clojure
(def testz (macroexpand-1 '(defn hello [] (println ":D"))))
(println testz) ; un defn es un def + fn
(eval testz)
(hello) ; Clojure (Lisp) está bastante loco