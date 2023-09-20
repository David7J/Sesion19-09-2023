import java.utill.Scanner;

public class ArreglosBidimensionales {

    public static void main(String [] args){
        java.util.Scanner lector = new Scanner(System.in);


        int matrizB[][] = {
            {1,2},
            {1,4}
        };
        System.out.println("Cantidad de filas: ");
        int cantFilas = lector.nextInt();

        System.out.println("Cantidad de columnas: ");
        int cantColumnas = lector.nextInt();

        int[][] matrizA = new int[cantFilas][cantColumnas];

        System.out.println("Ingrese los elementos de la matriz A:");

        for (int i = 0; i < matrizA.length; i++) { //Para filas
            for (int j = 0; j < matrizA[i].length; j++) { //Para columnas
                System.out.println("AreregloA[" + i + "," + j + "]" );
                matrizA[i][j] = lector.nextInt();
            }
        }
        System.out.println("Los datos en forma de matriz:");
            for ( i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizA[i].length; j++) {
                    System.out.println(matrizA[i][j] + "\n");

                    System.out.println();
                    
                }
            }



        lector.close();
    }
}
