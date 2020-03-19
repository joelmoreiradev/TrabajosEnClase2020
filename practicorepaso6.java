import java.util.Scanner;

public class practico1 {
    public static void main (String[]args) {

        Scanner entrada = new Scanner(System.in);


         int valor1;
         int valor2;
         int valor3;
         int valor4;
         int valor5;
         int valor6;
         int valor7;
         int valor8;
         int valor9;
         int valor10;
         
         int numeropar = 0;


         System.out.println("Ingrese 10 valores por linea:");
        valor1 = entrada.nextInt();
        valor2 = entrada.nextInt();
        valor3 = entrada.nextInt();
        valor4 = entrada.nextInt();
        valor5 = entrada.nextInt();
        valor6 = entrada.nextInt();
        valor7 = entrada.nextInt();
        valor8 = entrada.nextInt();
        valor9 = entrada.nextInt();
        valor10 = entrada.nextInt();

        if(valor1 %2 == 0) {
            numeropar++;
        }
        if(valor2 %2 == 0) {
            numeropar++;
        }
        if(valor3 %2 == 0) {
            numeropar++;
        }if(valor4 %2 == 0) {
            numeropar++;
        }if(valor5 %2 == 0) {
            numeropar++;
        }if(valor6 %2 == 0) {
            numeropar++;
        }if(valor7 %2 == 0) {
            numeropar++;
        }if(valor8 %2 == 0) {
            numeropar++;
        }if(valor9 %2 == 0) {
            numeropar++;
        }if(valor10 %2 == 0) {
            numeropar++;
        } else {
            System.out.println("Ningún número es par.");
        }

        System.out.println("Hay "+ numeropar+ " números par.");






    }
}
