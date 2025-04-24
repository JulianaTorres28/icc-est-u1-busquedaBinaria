package controllers;

import views.View;
import models.Person;
import java.util.ArrayList;

public class Controller {
    private View view;
    private ArrayList<Person> people;
    private SortingMethods sortingMethods;
    private SearchingMethods searchingMethods;

    // Constructor
    public Controller(View view, SortingMethods sortingMethods, SearchingMethods searchingMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchingMethods = searchingMethods;
        this.people = new ArrayList<>();  // Inicializamos el ArrayList vacío
    }

    // Método principal para iniciar el programa
    public void start() {
        boolean exit = false;

        while (!exit) {
            view.showMenu();  // Mostrar el menú
            int option = view.scanner.nextInt();
            view.scanner.nextLine();  // Limpiar el buffer

            switch (option) {
                case 1:
                    inputPerson();  // Agregar persona
                    break;
                case 2:
                    showPeople();  // Mostrar todas las personas
                    break;
                case 3:
                    searchByName();  // Buscar por nombre
                    break;
                case 4:
                    searchByAge();  // Buscar por edad
                    break;
                case 5:
                    sortByName();  // Ordenar por nombre
                    break;
                case 6:
                    sortByAge();  // Ordenar por edad
                    break;
                case 7:
                    exit = true;  // Salir
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Método para agregar una persona
    public void inputPerson() {
        Person newPerson = view.inputPerson();  // Pedimos los datos de la persona
        addPerson(newPerson);  // Agregamos la persona
    }

    // Método para agregar persona al ArrayList
    public void addPerson(Person person) {
        people.add(person);  // Añadimos la nueva persona al ArrayList
    }

    // Mostrar todas las personas
    public void showPeople() {
        view.displayPersons(people);  // Llamamos al método de View para mostrar las personas
    }

    // Buscar por nombre
    public void searchByName() {
        String name = view.inputSearchName();  // Pedimos el nombre
        Person result = searchByNameInArray(name);  // Buscamos la persona
        view.displaySearchResult(result);  // Mostramos el resultado
    }

    // Buscar por edad
    public void searchByAge() {
        int age = view.inputSearchAge();  // Pedimos la edad
        Person result = searchByAgeInArray(age);  // Buscamos la persona
        view.displaySearchResult(result);  // Mostramos el resultado
    }

    // Búsqueda binaria por nombre
    public Person searchByNameInArray(String name) {
        int low = 0;
        int high = people.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (people.get(mid).getName().equals(name)) {
                return people.get(mid);  // Si encontramos la persona, la devolvemos
            }
            if (people.get(mid).getName().compareTo(name) < 0) {
                low = mid + 1;  // Buscar en la mitad superior
            } else {
                high = mid - 1;  // Buscar en la mitad inferior
            }
        }
        return null;  // No se encontró
    }

    // Búsqueda binaria por edad
    public Person searchByAgeInArray(int age) {
        int low = 0;
        int high = people.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (people.get(mid).getAge() == age) {
                return people.get(mid);  // Si encontramos la persona, la devolvemos
            }
            if (people.get(mid).getAge() < age) {
                low = mid + 1;  // Buscar en la mitad superior
            } else {
                high = mid - 1;  // Buscar en la mitad inferior
            }
        }
        return null;  // No se encontró
    }

    // Ordenar por nombre usando el algoritmo de burbuja
    public void sortByName() {
        sortingMethods.sortByNameWithBubble(people);  // Usamos el algoritmo de burbuja
        view.displayPersons(people);  // Mostrar las personas ordenadas
    }

    // Ordenar por edad usando el algoritmo de inserción
    public void sortByAge() {
        sortingMethods.sortByAgeWithInsertion(people);  // Usamos el algoritmo de inserción
        view.displayPersons(people);  // Mostrar las personas ordenadas
    }
}
