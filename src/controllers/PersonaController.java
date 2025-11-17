package controllers;

import models.Persona;

public class PersonaController {
    public Persona findByName(Persona[] personas, String targetName) {
        int izquierda = 0;
        int derecha = personas.length - 1;

        while (izquierda <= derecha) {
            int medio = (derecha + izquierda) / 2;

            int comparacion = personas[medio].getNombre().compareTo(targetName);
            if (comparacion == 0) {
                return personas[medio];
            }

            if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return null;
    }

    public void sortBurbuja(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            boolean swapped = false;


            for (int j = 0; j < personas.length - 1 - i; j++) {

                if (personas[j].getNombre().compareTo(personas[j + 1].getNombre()) > 0) {
                Persona temp = personas[j];
                personas[j] = personas[j + 1];
                personas[j + 1] = temp;
                swapped = true;
            }

            }

            if (!swapped) {
                break;
            }
        }
    }

}
