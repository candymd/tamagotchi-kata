
> Un **Tamagotchi** (たまごっち) es una [mascota virtual](https://es.wikipedia.org/wiki/Mascota_virtual) creada en 1996 por Aki Maita y comercializada por [Bandai](https://es.wikipedia.org/wiki/Bandai). El Tamagotchi es un aparato electrónico con la forma y el tamaño de un huevo, que tiene una pantalla en blanco y negro pixelada, donde se puede ver una mascota virtual.

En esta Kata intentaremos implementar una versión simplificada del tamagotchi
>

- El tamagotchi tiene tres atributos: hambre (`hunger`), energía (`energy`) y humor (`mood`).
- **La puntuación inicial de cada uno de los atributos es `4` .**
- Cuando el tamagotchi realiza una acción (comer, jugar o dormir), responde mostrando su estado:
    - `:-)` (contento) **cuando el humor está por encima de 8**
    - `(-_-)` (cansado) **cuando la energía esté por debajo de 3**
    - `(-_-) zZZ` (dormido) **cuando la energía llega a 0 o cuando se le ordena dormir.**
    - `ఠ_ఠ` (enfadado) **cuando el humor esté por debajo de 2**
    - `:-|` (normal) **resto de casos**
- Cuando el tamagotchi juega, el hambre y el humor aumentan en un punto, la energía disminuye en un punto.
- Cuando el tamagotchi come, el hambre disminuye 2 puntos, la energía disminuye en 1 punto.
- Cuando el tamagotchi duerme, la energía aumenta dos puntos.

<aside>
🗺️ La clase Tamagotchi **únicamente** ha de tener 3 métodos, `play`, `eat` y `sleep`. Los tres métodos devuelven un String (el estado del tamagotchi) y no reciben ningún argumento.

</aside>