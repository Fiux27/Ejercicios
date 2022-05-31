import java.util.Scanner;
  
public class Ejercicio_24
{
public static void main( String args[])
    {
    Scanner entrada = new Scanner(System.in);
    
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    
    System.out.println("\nEste programa lee cinco numeros y devuelve el mayor y el menor. ");
    System.out.println("Introduzca el primer numero:");
    num1 = entrada.nextInt();
    
    System.out.println("\nIntroduzca el segundo entero:");
    num2 = entrada.nextInt();
    
    System.out.println("\nIntroduzca el tercer entero:");
    num3 = entrada.nextInt();
    
    System.out.println("\nIntroduzca el cuarto entero:");
    num4 = entrada.nextInt();
    
    System.out.println("\nIntroduzca el quinto entero:");
    num5 = entrada.nextInt();

    int menor = num1;
    
    if ( num2 < menor)
    menor = num2;
    if ( num3 < menor)
    menor = num3;
    if (num4 < menor)
    menor = num4;
    if (num5 < menor)
    menor = num5;

    int mayor = num1;
    
    if (num2 > mayor)
    mayor = num2;
    if (num3 > mayor)
    mayor = num3;
    if (num4 > mayor)
    mayor = num4;
    if(num5 > mayor)
    mayor = num5;

    System.out.printf("\nEl menor de los numeros es: %d\n", menor);
    System.out.printf("\nEl mayor de los numeros es: %d\n", mayor);
    }
}