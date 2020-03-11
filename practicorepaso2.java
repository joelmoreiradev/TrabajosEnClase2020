package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        System.out.println("Ingrese un nùmero: ");
        num = teclado.nextInt();
        for(int i = 1; i <= num; i++ ){
            System.out.println(i);
        }
        
        
    }
    
}
