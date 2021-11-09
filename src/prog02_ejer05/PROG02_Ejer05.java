
import java.util.Scanner;

/**
 *
 * @author jfunez
 */
public class PROG02_Ejer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    Scanner sc= new Scanner(System.in); 
    //System.in is a standard input stream  

    System.out.print("Enter first number- ");  
    int a= sc.nextInt();  

    System.out.print("Enter second number- ");  
    int b= sc.nextInt();  

    float resto = a % b;


    if ( resto > 0 ) {

        System.out.print(a + " no es multiplo de " + b);
    }else{
        System.out.print(a + " es multiplo de " + b);
    }

    System.out.print("\n");
    System.out.print(resto);
    System.out.print("\n");
    } 
    
    }
    
