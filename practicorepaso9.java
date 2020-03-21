import java.util.Scanner;

public class practico1 {
    public static void main (String[]args) {

        Scanner entrada = new Scanner(System.in);

        int [] miArreglo=new int [6];
        int contador = 0;

        for(int i = 0; i< 5; i++){
            System.out.println("Ingrese un número: ");
            miArreglo[i] = entrada.nextInt();

        }

        for(int i=0; i< 10000000 ; i++){
            if(miArreglo[0] ==100* i +15){
                contador++;
            }
        }

        for(int i=0; i< 10000000 ; i++){
            if(miArreglo[1] ==100* i +15){
                contador++;
            }
        }

        for(int i=0; i< 10000000 ; i++){
            if(miArreglo[2] ==100* i +15){
                contador++;
            }
        }

        for(int i=0; i< 10000000 ; i++){
            if(miArreglo[3] ==100* i +15){
                contador++;
            }
        }

        for(int i=0; i< 10000000 ; i++){
            if(miArreglo[4] ==100* i +15){
                contador++;
            }
        }


        System.out.println(contador+" numeros terminan en 15");

    }
}
