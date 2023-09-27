import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de notas: ");
        int cantNotas = lector.nextInt(); 

        while(cantNotas <= 0){
            System.out.println("No se permitan valores negativos no cero");
            System.out.println("Ingrese la cantidad de notas: ");
            cantNotas = lector.nextInt(); 
        }

        int[] notas = new int[cantNotas];
        String[] nombres = new String[cantNotas];
        int sumaNotas = 0;

       
        System.out.println("Ingrese las notas del estudiante y el nombre:");
        for(int i = 0; i < notas.length ; i++) {
            System.out.print("Estudiante: [" + (i+1) + "] = ");
            lector.nextLine();
            nombres[i] = lector.nextLine();
            

            System.out.print("Nota [" + (i+1) + "] = ");
            notas[i] = lector.nextInt();
            sumaNotas = notas[i];

            while(sumaNotas < 0){
                System.out.println("No se permiten valores negativos");
                System.out.print("Nota [" + (i+1) + "] = ");
                notas[i] = lector.nextInt();
                sumaNotas = notas[i];
            }

            if(sumaNotas >= 90 && sumaNotas <= 100 ){
               System.out.println("El intervalo de las notas es: 90-100");

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Nombre completo \t\t Notas de los estudiantes: ");
            System.out.println(nombres[i] + "................................" + notas[i]);
            }

            
        

            if(sumaNotas >= 80 && sumaNotas <= 89 ){
            System.out.println("El intervalo de las notas es: 80-89");

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Nombre completo \t\t Notas de los estudiantes: ");
            System.out.println(nombres[i] + "................................" + notas[i]);
            }

            if(sumaNotas >= 70 && sumaNotas <= 79 ){
                System.out.println("El intervalo de las notas es: 70-79");

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Nombre completo \t\t Notas de los estudiantes: ");
            System.out.println(nombres[i] + "................................" + notas[i]);
            }

            if(sumaNotas >= 60 && sumaNotas <= 69){
                System.out.println("El intervalo de las notas es: 60-69");

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Nombre completo \t\t Notas de los estudiantes: ");
            System.out.println(nombres[i] + "................................" + notas[i]);
            }

            if(sumaNotas >= 0 && sumaNotas <= 59){
                System.out.println("El intervalo de las notas es: 0-59");

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Nombre completo \t\t Notas de los estudiantes: ");
            System.out.println(nombres[i] + "................................" + notas[i]);
            }
        }

        


        System.out.println("");
        System.out.println("Nombre de todos los studiantes \t\t Notas de todos los estudiantes");
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i] + "..........................................." + notas[i]);
        }



        double promedio = (double)sumaNotas/(double)cantNotas;
        System.out.println("Promedio de notas: " + promedio);




       lector.close(); 
    }
}
