package controllers;


public class BusquedaBinaria {

    public Integer busquedaBinaria(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;// lenght saca tamaño por eso -1

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // 1er validamos el medio
            if (arr[medio] == objetivo) {
                return arr[medio];
            }

            // 2do deciddo si busco a la derecha o izquierda
            if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null;
    }

    public Integer sortBurbuja(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;


            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return null;
    }
}
