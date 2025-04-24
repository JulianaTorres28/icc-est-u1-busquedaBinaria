package controllers;

import models.Person;
import java.util.ArrayList;

public class SearchingMethods {

    // Búsqueda binaria por nombre
    public Person binarySearchByName(ArrayList<Person> people, String name) {
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

        return null;  // No se encontró la persona
    }

    // Búsqueda binaria por edad
    public Person binarySearchByAge(ArrayList<Person> people, int age) {
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

        return null;  // No se encontró la persona
    }
}
