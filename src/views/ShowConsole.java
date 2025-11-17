package views;

import models.Persona;

public class ShowConsole {

    public void showArray(int[] arr){
        System.out.print(" Arreglo ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void showArray(Persona[] personas){
        System.out.print(" Arreglo ordenado: ");
        System.out.print("[");
        for (Persona persona : personas) {
            System.out.print(persona.getNombre() + ", " );
        }
        System.out.println("]");
    }

    public void showResult(Integer resultado){
        if (resultado != null) {
            System.out.println(" Número encontrado: " + resultado);
        } else {
            System.out.println(" Número no encontrado en el arreglo.");
        }
    }

    public void showPersonResult(Persona persona, String nombreBuscado){
        if (persona != null) {
            System.out.println(" Persona encontrada: " + persona.getNombre());
        } else {
            System.out.println(" No se encontró ninguna persona con el nombre: " + nombreBuscado);
        }
    }
}