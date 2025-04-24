package controllers;

import models.Person;
import java.util.ArrayList;

public class SortingMethods {

    // Ordenar por nombre usando el algoritmo de burbuja
    public void sortByNameWithBubble(ArrayList<Person> people) {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = 0; j < people.size() - i - 1; j++) {
                if (people.get(j).getName().compareTo(people.get(j + 1).getName()) > 0) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }
    }

    // Ordenar por edad usando el algoritmo de inserción
    public void sortByAgeWithInsertion(ArrayList<Person> people) {
        for (int i = 1; i < people.size(); i++) {
            Person key = people.get(i);
            int j = i - 1;
            while (j >= 0 && people.get(j).getAge() > key.getAge()) {
                people.set(j + 1, people.get(j));
                j--;
            }
            people.set(j + 1, key);
        }
    }
}
