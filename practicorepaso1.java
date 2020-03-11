package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
       
        
        
        Scanner teclado = new Scanner(System.in);
        
        int num = 1;
        int suma = 0;
        while(num != 0) {
            
        System.out.println("Ingrese un nùmero: ");
        num = teclado.nextInt();
        suma = suma + num;
        
        
        }
        System.out.println("La suma es: " +suma);
        
        
    }
    
}
