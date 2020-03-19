import java.util.Scanner;

public class practico1 {
    public static void main (String[]args) {


        Scanner teclado = new Scanner(System.in);

        int num = 1;
        int suma = 0;
        int ingresados = 0;
        int promedio;
        int ingresadoMayor = 0;
        int porcentajeMayores = 0;
        
        while(num != 0) {

            System.out.println("Ingrese una edad: ");
            num = teclado.nextInt();
            suma = suma + num;

            //si num no es igual a 0, aumentar un numero ingresado.
            //uso el if para que 0 no cuente como un ingreso y el promedio sea correcto.
            if(num != 0){
                ingresados++; //aumentar la cantidad de edades ingresadas
            }

            if(num >= 50){
                ingresadoMayor++;
            }

        }

        promedio = suma / ingresados;

        porcentajeMayores =  (ingresadoMayor)*(100) / ingresados;
        System.out.println("El promedio de las edades es " +promedio);
        System.out.println("Se ingresaron "+ingresadoMayor+ " edades mayores a 50.");
        System.out.println("El porcentaje de personas mayores de 50 años es "+porcentajeMayores+ "%");



    }
}
