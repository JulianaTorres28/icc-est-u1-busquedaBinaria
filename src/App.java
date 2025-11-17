import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {

        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        int[] arr = new int[] { 10, 2, 4, 6, 7, 8, 13, 20 };
        Integer result = bB.sortBurbuja(arr);
        result = bB.busquedaBinaria(arr, 10);

        sC.showArray(arr);
        sC.showResult(result);

        // Instanciamos PersonaController
        // creamos el arreglo
        Persona[] personas = new Persona[] {
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Pedro", 20),
                new Persona("Maria", 28),
                new Persona("Luis", 22),
                new Persona("Carmen", 27),
                new Persona("Sofia", 24),
        };
        // Orednamso el arreglo por nombre
        PersonaController personaController = new PersonaController();
        personaController.sortBurbuja(personas);
        sC.showArray(personas);

        // mandamos a buscar a Pedro
        Persona encontrada = personaController.findByName(personas, "Pedro");

        // mostramos el resultado
        sC.showPersonResult(encontrada, "Pedro");
    }
}
