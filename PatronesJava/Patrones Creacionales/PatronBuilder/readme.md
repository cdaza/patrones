El patrón Builder o Constructor se utiliza cuando queremos crear un producto que tiene diferentes partes.

Separa la construcción de un objeto complejo de su representación para que el mismo proceso de construcción pueda dar lugar a diferentes representaciones.

Facilita la construcción de un objeto con una composición de más objetos. Un caso habitual es el de construir una Interfaz de usuario.

Ejemplo: una aplicación que convierte texto RTF a diferentes formatos: texto ascii, TeX, TextWidget.

Se usa cuando:

El algoritmo para crear un objeto complejo debe ser independiente de las partes que constituyen el objeto y su ensamblaje.
El proceso de construcción debe permitir representaciones diferentes del objeto construido.

Diagrama de clases:

![Diagrama de clases patrón Builder](https://github.com/cdaza/patrones/blob/master/PatronesJava/Patrones%20Creacionales/PatronBuilder/DiagramaClasesBuilderOriginal.jpg)

Diagrama de clases Ejemplo:

![patrón Builder](https://github.com/cdaza/patrones/blob/master/PatronesJava/Patrones%20Creacionales/PatronBuilder/DiagramaClasesBuilder.png)
