package views;

import models.Person;
import java.util.Scanner;
import java.util.ArrayList;

public class View {
    public Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);  // Iniciar el scanner aquí
    }

    // Mostrar el menú de opciones
    public void showMenu() {
        System.out.println("1. Agregar persona");
        System.out.println("2. Mostrar todas las personas");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Buscar por edad");
        System.out.println("5. Ordenar por nombre");
        System.out.println("6. Ordenar por edad");
        System.out.println("7. Salir");
    }

    // Solicitar los datos de la persona
    public Person inputPerson() {
        System.out.println("Ingrese el nombre de la persona: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer
        return new Person(name, age);
    }

    // Mostrar todas las personas
    public void displayPersons(ArrayList<Person> people) {
        if (people.isEmpty()) {
            System.out.println("No hay personas para mostrar.");
        } else {
            for (Person person : people) {
                System.out.println(person);
            }
        }
    }

    // Mostrar el resultado de la búsqueda
    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println("Persona encontrada: " + person);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    // Pedir el nombre para la búsqueda
    public String inputSearchName() {
        System.out.print("Ingresa el nombre de la persona a buscar: ");
        return scanner.nextLine();
    }

    // Pedir la edad para la búsqueda
    public int inputSearchAge() {
        System.out.print("Ingresa la edad de la persona a buscar: ");
        return scanner.nextInt();
    }
}
