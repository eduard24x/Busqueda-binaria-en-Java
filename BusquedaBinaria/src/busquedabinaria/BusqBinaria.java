package busquedabinaria;

/**
 *
 * @author Eduardo
 */
public class BusqBinaria {

    public int busquedaBinaria(int arreglo[], int elemento) {//Método que recibe como parámetro un arreglo
        int centro, primero, ultimo, valorCentro; //Variables de tipo entero para ordenar
        primero = 0;
        ultimo = arreglo.length - 1;
        while (primero <= ultimo) { //Condición para ordenar los elementos
            centro = (primero + ultimo) / 2;
            valorCentro = arreglo[centro];
            System.out.println("Comparando a " + elemento + " con " //Mensaje
                    + arreglo[centro]);
            if (elemento == valorCentro) {
                return centro;
            } else if (elemento < valorCentro) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }
        }
        return -1;
    }
    
        public void mostrarArreglo(int[] arreglo) { //Método mostrarArreglo
        int k;
        for (k = 0; k < arreglo.length; k++) { //Ciclo for para recorrer el arreglo
            System.out.println("[" + arreglo[k] + "]");
        }
        System.out.println();
    }

}

