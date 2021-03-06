El patrón Factory Method o Fábrica es una simplificación del patrón Abstract Factory. En un patrón Factory Method sólo existe un producto, no una familia de ellos.

Se le conoce como Constructor Virtual, su nombre en español es Método de Fábrica, este patron consiste en utilizar una clase constructora abstracta con unos cuantos métodos definidos y otro(s) abstracto(s): es dedicado a la construcción de objetos de un subtipo de un tipo determinado.

Define la interfaz de creación de un cierto tipo de objeto, permitiendo que las subclases decidan qué clase concreta necesitan instanciar.

Se usa patron Fabrica cuando:

Una clase no puede anticipar la clase de objetos que debe crear.
Se necesita que las subclases especifiquen los objetos a ser creados

Diagrama de clases:

![patrón Factory](https://github.com/cdaza/patrones/blob/master/PatronesJava/Patrones%20Creacionales/PatronFabrica/DiagramaClasesFabricaOriginal.jpg)

Diagrama de clases ejemplo:

![patrón Factory](https://github.com/cdaza/patrones/blob/master/PatronesJava/Patrones%20Creacionales/PatronFabrica/DiagramaClasesFabrica.png)
