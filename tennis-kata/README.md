# Tenis Refactoring Kata

Imagina que trabajas para una empresa de consultoría, y uno de tus colegas ha estado trabajando para la Sociedad de Tenis. El contrato es por 10 horas de trabajo facturable, y su colega ha pasado 8,5 horas trabajando en él. Lamentablemente ahora se ha enfermado. Él dice que ha completado el trabajo, y todas las pruebas pasan. Tu jefe te ha pedido que te encargues de él. Quiere que pases una hora más o menos en el código para que pueda facturar al cliente las 10 horas completas. Ella le da instrucciones para que arregle un poco el código y quizás tome algunas notas para que pueda darle a su colega algunos comentarios sobre el diseño elegido. También debe prepararse para hablar con su jefe sobre el valor de este trabajo de refactorización, más allá de las horas adicionales facturables.

Hay tres versiones de este kata de refactorización, cada uno con sus propios olores y desafíos de diseño. Le sugiero que comience con el primero, con la clase "TennisGame1Refactored". El conjunto de pruebas proporcionado es bastante completo y rápido de ejecutar. No debería necesitar cambiar las pruebas, solo ejecútelas a menudo mientras lo refactoriza.

Si te gusta este Kata, te puede interesar mi libro, ["The Coding Dojo Handbook"] (https://leanpub.com/codingdojohandbook)

## Tenis Kata

El tenis tiene un sistema de puntuación bastante peculiar, y para los recién llegados puede ser un poco difícil seguirle la pista. La sociedad del tenis te ha contratado para construir un marcador para mostrar la puntuación actual durante los juegos de tenis.

Tu tarea es escribir una clase de "Juego de tenis" que contenga la lógica que genere la puntuación correcta como una cadena para mostrar en el marcador. Cuando un jugador obtiene un punto, activa un método para llamar a su clase y le permite saber quién anotó el punto. Más tarde, obtendrás una llamada "score ()" del marcador preguntando qué debería mostrar. Este método debe devolver una cadena con la puntuación actual.

Puede leer más sobre las puntuaciones de tenis [aquí] (http://en.wikipedia.org/wiki/Tennis#Scoring) que se resume a continuación:

1. El primer jugador gana un juego que ha ganado al menos cuatro puntos en total y al menos dos puntos más que el oponente.
2. El puntaje de cada juego se describe de una manera peculiar al tenis: los puntajes de cero a tres puntos se describen como "Amor", "Quince", "Treinta" y "Cuarenta" respectivamente.
3. Si al menos tres puntos han sido anotados por cada jugador, y las puntuaciones son iguales, la puntuación es "Deuce".
4. Si al menos tres puntos han sido anotados por cada lado y un jugador tiene un punto más que su oponente, la puntuación del juego es "Ventaja" para el jugador que está a la cabeza.

Solo necesitas reportar la puntuación del juego actual. Conjuntos y partidos están fuera de alcance.

Fuente https://github.com/emilybache/Tennis-Refactoring-Kata
