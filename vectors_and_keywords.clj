:my_keyword ; esto es una palabra clave (? átomo en elixir)
(def my_vector [:uno :dos :tres]) ; esto es una variable
(println my_vector)  ; ¿Qué pasa si lo intentamos imprimir?
(println (first my_vector))
(println (last my_vector))  ; ? Existe last


; expetimentando con readstring

(def read_vector (read-string "[:one :two :three]"))
(println read_vector)

(def my-list (list :an :du :trois))  ; !!! Los nombres soportan guíones medios
(println my-list)