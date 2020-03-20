import java.util.Scanner;

public class practico1 {
    public static void main (String[]args) {

        Scanner entrada = new Scanner(System.in);

        int [] miArreglo=new int [6];


        for(int i = 0; i< 5; i++){
            System.out.println("Ingrese un número: ");
            miArreglo[i] = entrada.nextInt();

        }

        System.out.println("Números comprendidos entre 1 y "+miArreglo[0]);
        for(int i = 2; i < miArreglo[0]; i++){
                System.out.println(i);
        }

        System.out.println("Números comprendidos entre 1 y "+miArreglo[1]);
        for(int i = 2; i < miArreglo[1]; i++){
            System.out.println(i);
        }

        System.out.println("Números comprendidos entre 1 y "+miArreglo[2]);
        for(int i = 2; i < miArreglo[2]; i++){
            System.out.println(i);
        }

        System.out.println("Números comprendidos entre 1 y "+miArreglo[3]);
        for(int i = 2; i < miArreglo[3]; i++){
            System.out.println(i);
        }

        System.out.println("Números comprendidos entre 1 y "+miArreglo[4]);
        for(int i = 2; i < miArreglo[4]; i++){
            System.out.println(i);
        }



    }
}
