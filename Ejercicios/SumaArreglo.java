import java.util.Scanner;

public class SumaArreglo {

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los arreglos");
        int tamaño = lector.nextInt();

        //Validar que e tamaño no sea menor o igual a cero
        while(tamaño <= 0){
            System.out.println("El tamaño de los arreglos no puede ser menor o igual acero");
            System.out.println("Ingrese el tamaño de los arreglos");
            tamaño = lector.nextInt();
        }
        //Declarar los arreglos
        int[] arregloA = new int[tamaño];
        int[] arregloB = new int[tamaño];
        int[] arregloSuma = new int[tamaño];
        //Pedir los elementos de los arreglos al usuario
        //arregloA.lenght es lo mismo a decir tamaño
        System.out.println("Elementos del arreglo A: ");
        for(int i = 0; i < arregloA.length; i++) {
            System.out.println("Elemento [" + (i+1) + "] = ");
            arregloA[i] = lector.nextInt();
        }

        System.out.println("Elementos del arreglo B");
        for(int i = 0; i < arregloB.length; i++) {
            System.out.println("Elemento [" + (i+1) + "] = ");
            arregloB[i] = lector.nextInt();
        }
        //Sumar ambos arreglos elemento a elemento
        for(int i = 0;i < arregloSuma.length; i++){
            arregloSuma[i] = arregloA[i] + arregloB[i];
        }
        //Mostaar resultados
        System.out.println("Elementos del Arreglo A");
        System.out.print("ArregloA= [");
        for(int i = 0; i < arregloSuma.length; i++){
            System.out.print(arregloA[i] + ",");
        }
        System.out.println("] \n");

        System.out.println("Elementos del arreglo B");
        System.out.print("ArregloB= [");
        for(int i = 0; i < arregloSuma.length; i++){
            System.out.print(arregloB[i] + ",");
        }
        System.out.println("] \n");

        System.out.print("ArregloSuma= [");
        for(int i = 0; i < arregloSuma.length; i++){
            System.out.print(arregloSuma[i] + ",");
        }
        System.out.println("] \n");


        lector.close();
    }
}
