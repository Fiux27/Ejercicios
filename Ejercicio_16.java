import java.util.Scanner;
  
public class Ejercicio_16
{
public static void main( String args[] )
    {
    Scanner entrada = new Scanner(System.in);
    
    int num1;
    int num2;
    
    System.out.println("\nIntroduzca un entero: ");
    num1 = entrada.nextInt();
    
    System.out.println("\nIntroduzca un segundo entero: ");
    num2 = entrada.nextInt();
    
    if ( num1 > num2 )
    System.out.printf("\nEl numero %d es mayor que %d\n", num1, num2);
    
    if ( num2 > num1 )
    System.out.printf("\nEl numero %d es mayor que %d\n", num2, num1);
    
    if ( num1 == num2 )
    System.out.printf( "\nEl numero %d es igual al numero %d\n", num1, num2);
    }
}