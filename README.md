# Proyecto de Gestión de Personas en Java

Este proyecto tiene como objetivo implementar una aplicación de consola que permita gestionar una lista de personas. La aplicación ofrece funcionalidades para agregar personas, ordenarlas por nombre o edad, y buscarlas. El proyecto está implementado utilizando el patrón **Modelo-Vista-Controlador (MVC)**, donde se separa claramente la lógica de negocio, la interfaz de usuario y el control del flujo de la aplicación.

## Descripción

La aplicación permite realizar las siguientes operaciones:

- **Agregar personas**: Ingresar el nombre y la edad de las personas.
- **Ordenar personas**: Ordenar a las personas por su nombre o por su edad utilizando algoritmos de ordenación.
- **Buscar personas**: Buscar a una persona por su nombre o por su edad utilizando búsqueda binaria.
- **Mostrar personas**: Ver la lista de todas las personas registradas.

Este proyecto está implementado en **Java** y se sigue el patrón de diseño **MVC** para separar la lógica de la aplicación en tres componentes principales:
- **Modelo**: Representa los datos (en este caso, la clase `Person`).
- **Vista**: Gestiona la interfaz de usuario (en este caso, la clase `View`).
- **Controlador**: Contiene la lógica de la aplicación y conecta la vista con el modelo (en este caso, la clase `Controller`).

## Estructura del Proyecto

El proyecto está dividido en las siguientes clases:

### **1. `Person` (Modelo)**
- Clase que representa una persona con un nombre y una edad.
- Métodos: **`getName()`**, **`getAge()`**, **`setName()`**, **`setAge()`**, y **`toString()`** para representar la persona.

### **2. `View` (Vista)**
- Clase responsable de interactuar con el usuario.
- Muestra el menú, solicita entradas (como nombre y edad) y muestra los resultados.

### **3. `Controller` (Controlador)**
- Gestiona la lógica del negocio: agrega personas, realiza búsquedas y ordena la lista.
- Utiliza los métodos de la clase **`SortingMethods`** para ordenar y **`SearchingMethods`** para realizar las búsquedas.

### **4. `SortingMethods`**
- Contiene los métodos para ordenar las personas por nombre y por edad.
- Utiliza los algoritmos de **burbuja** y **inserción**.

### **5. `SearchingMethods`**
- Contiene los métodos para realizar la búsqueda binaria por nombre o edad.

