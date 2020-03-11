package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num7;
        int num8;
        int num9;
        int num10;
        int suma;
        
        System.out.println("Ingrese 10 nùmeros por linea.");
        num1 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num2 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num3 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num4 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num5 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num6 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num7 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num8 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num9 = teclado.nextInt();
        System.out.println("Ingrese otro nùmero");
        num10 = teclado.nextInt();
        
        suma = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        System.out.println("La suma de todos los nùmeros es "+suma);
        System.out.println("El promedio de todos los nùmeros es: "+suma / 10);
        
        
        
        
        
        
    }
    
}
