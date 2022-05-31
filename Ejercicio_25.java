import java.util.Scanner;

public class Ejercicio_25
{
public static void main(String args[])
    {
int num;
Scanner entrada = new Scanner(System.in);
  
System.out.println("\nIntroduzca un numero para saber si es par o impar.");
num = entrada.nextInt();
  
if( 0 == num % 2 )
System.out.println("\nEl numero es par.");
  
if ( 0 != num % 2)
System.out.println("\nEl numero es impar.");
    }
}