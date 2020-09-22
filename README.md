# poc-Command-Pattern

## Motivación

Los patrones de diseño son soluciones probadas y documentadas a problemas comunes en el desarrollo de software. 
En la construcción de frameworks de pruebas automatizadas se utilizan para evitar problemas como el alto costo de 
mantenimiento de los tests, código duplicado, entre otros.

Para la automatización de pruebas contamos con algunos patrones de diseño como: PageObject o ScreenPlay,
pero existen más patrones de diseño que a revisar y probar, con los cuales podríamos refactorizar
nuestros frameworks y hacerlos más robustos.

El concepto de Command Pattern o patron comando lo podemos implementar en muchas situaciones en las que tenemos que 
gestionar tareas que reciben algún tipo de objeto como parámetro y una vez recibido este objeto deberemos procesarle.

Lo que debemos comprender es el hecho de que una solicitud se encapsula en un objeto como comando y se pasa al objeto 
invocador. El objeto invocador busca el objeto apropiado que puede manejar este comando y pasa el comando al objeto 
correspondiente que ejecuta el comando.

### Ejercicios

* [Gestor de Tareas](src/main/scala/me/isortegah/labs/gestorTareas/Principal.java)
* [Gestor de Ordenes](src/main/java/me/isortegah/labs/gestorOrdenes/CommandPatternDemo.java)
* [Editor](src/main/java/me/isortegah/labs/gestorEditor/Demo.java)

## Reference
* [Command Pattern en Java y la gestion de tareas](https://www.arquitecturajava.com/command-pattern-tareas/)
* [Design Patterns - Command Pattern](https://www.tutorialspoint.com/design_pattern/command_pattern.htm)
* **[Command](https://refactoring.guru/design-patterns/command)**
* [Command Design Pattern](https://sourcemaking.com/design_patterns/command)
* [Command Pattern](https://www.geeksforgeeks.org/command-pattern/)  
* [The Command Design Pattern](https://medium.com/better-programming/the-command-design-pattern-2313909122b5)
* [Command .NET](https://www.dofactory.com/net/command-design-pattern)
* [Command Design Pattern](https://www.journaldev.com/1624/command-design-pattern)
* [How to implement Command Design Pattern in Java with Example](https://javarevisited.blogspot.com/2016/05/command-design-pattern-in-java-example-code.html)