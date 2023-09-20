import java.util.Scanner;

public class Arreglos {
    
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Cantidad de notas: ");
        int cantidadNotas = lector.nextInt();

        while(cantidadNotas <= 0) {
        System.out.println("No se permiten valores menores o iguales a cero");
        System.out.println("Cantidad de notas: ");
        cantidadNotas = lector.nextInt();
        }

        int[] notas = new int[cantidadNotas];
        String[] nombres = new String[cantidadNotas];
        int sumaNotas = 0;

        //Arrays
        System.out.println("Ingrese las notas del grupo y el nombre de cada uno:");
        for(int i = 0; i < notas.length ; i++) {
            System.out.print("Estudiante: [" + (i+1) + "] = ");
            lector.nextLine();
            nombres[i] = lector.nextLine();
            

            System.out.print("Nota [" + (i+1) + "] = ");
            notas[i] = lector.nextInt();
            sumaNotas += notas[i];
        }
        System.out.println("::::::::::::::::::::::::");
        System.out.println("Nombre completo \t\t Nota");

        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i] + "\t\t " + notas[i]);
        }

        System.out.println("Promedio de notas: " + (double) sumaNotas/(double)cantidadNotas);


        lector.close();
    }
}