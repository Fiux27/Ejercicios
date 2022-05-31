import java.util.Scanner;

public class Ejercicio_15

{
public static void main( String args[] )

  {
  Scanner entrada = new Scanner(System.in);

  int num1;
  int num2;
  int sum;
  int product;
  int dif;
  int cos;

  System.out.print("\nEste programa recibe dos numeros y da su producto, cociente, suma y diferencia.\n");

  System.out.println("Introduzca el primer entero: ");
  num1 = entrada.nextInt();

  System.out.println("Introduzca el segundo entero: ");
  num2 = entrada.nextInt();

  sum = num1 + num2;
  dif = num1 - num2;
  product = num1*num2;
  cos = num1/num2;

  System.out.printf("\nLa suma de los numeros es: %d\n", sum);
  System.out.printf("\nLa diferencia de los numeros es: %d\n", dif);
  System.out.printf("\nEl producto de los numeros es: %d\n", product);
  System.out.printf("\nEl cociente de los numeros es: %d\n", cos);

  }
}