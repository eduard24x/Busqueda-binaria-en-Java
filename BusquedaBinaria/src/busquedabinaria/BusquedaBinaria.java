package busquedabinaria;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner introducido = new Scanner(System.in);
        int elementos;
        System.out.println("Introduzca el número de elementos del arreglo:");
        elementos = introducido.nextInt();

        int arreglo[] = new int[elementos];// Crea el arreglo y Asigna el tamaño al arreglo
        for (int i = 0; i < elementos; i++) {//Recorre al arreglo
            System.out.println("Introduzca el elemento que estará en la posición " + (i + 1) + ":");
            arreglo[i] = introducido.nextInt();
        }

        BusqBinaria secuencial = new BusqBinaria();
        System.out.println("\nLos elementos introducidos son: \n"); //Elementos introducidos
        secuencial.mostrarArreglo(arreglo); //Llamada del método mostrarArreglo

        System.out.println("Introduzca el elemento a buscar:"); //Introducir elemento a buscar
        int elemento = introducido.nextInt();
        
        System.out.println("\nRESULTADO\n");
        
        int indice=secuencial.busquedaBinaria(arreglo, elemento);
        
        if(indice!=-1){
            System.out.println("Elemento " +elemento +" encontrado en el índice "+indice); //Resultado de la búsqueda
        }else{
            System.out.println("Elemento "+elemento +" no encontrado" );
        }

    }

}


