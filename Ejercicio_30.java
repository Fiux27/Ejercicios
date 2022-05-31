import java.util.Scanner;
  
public class Ejercicio_30
{
public static void main(String arg[])
    {
    Scanner entrada = new Scanner(System.in);
    int num;
    
    System.out.println("\nIntroduzca un numero de cinco cifras para separarlos entre ellos.");
    num = entrada.nextInt();
    
    System.out.printf("%d ",   num/10000);
    System.out.printf("%d ", (num%10000)/1000);
    System.out.printf("%d ", ((num%10000)%1000)/100);
    System.out.printf("%d ", (((num%10000)%1000)%100)/10);
    System.out.printf("%d\n ", ((((num%10000)%1000)%100)%10));
    }
}