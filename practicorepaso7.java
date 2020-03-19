import java.util.Scanner;

public class practico1 {
    public static void main (String[]args) {

        Scanner entrada = new Scanner(System.in);


         int numpiezastotales;
         double longitudpieza = 0;
         int piezasprocesadas = 0;
         int piezasaptas = 0;
         System.out.println("Ingrese el número de piezas a procesar:");
         numpiezastotales = entrada.nextInt();
         System.out.println(numpiezastotales+" piezas registraas.");

         while (piezasprocesadas <= numpiezastotales){
             System.out.println("Ingrese la longitud de una pieza:");
             longitudpieza = entrada.nextDouble();
             piezasprocesadas++;

             if (longitudpieza >= 1.20 && longitudpieza <= 1.30){
                 piezasaptas++;
             } else {
                 System.out.println("Pieza no apta.");
             }
         }



        System.out.println("Número de piezas aptas en el lote: "+piezasaptas);


    }
}
