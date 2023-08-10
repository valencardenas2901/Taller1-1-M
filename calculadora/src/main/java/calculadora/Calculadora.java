package calculadora;
import java.util.Scanner;
/*Valentina Cardenas Mercado*/
public class Calculadora {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opcion;
    int num1 = 0;
    int num2 = 0;
    int respuesta;

    do {
      System.out.println("Elige la operacion a realizar:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Salir");
      opcion = leer.nextInt();

      switch (opcion) {
      case 1 -> {
        respuesta = num1 + num2;
        System.out.println("La suma de ambos numeros es: " + respuesta);
        break;
      }
      case 2 -> {
        respuesta = num1 - num2;
        System.out.println("La resta de ambos numeros es: " + respuesta);
        break;
      }
      case 3 -> {
        respuesta = num1 * num2;
        System.out.println("El producto de ambos numeros es: " + respuesta);
        break;
      }
      case 4 -> {
        if (num2 == 0) {
          System.out.println("Esta respuesta es indefinida");
        } else {
          respuesta = num1 / num2;
          System.out.println("El cociente de ambos numeros es: " + respuesta);
        }
        break;
      }
      case 5 -> {
        continue;
      }
      }
      
      
      
      System.out.println("Digite el primer numero:");
      do {
        num1 = leer.nextInt();
      } while (num1 < 0 || num1 > 200);

      System.out.println("Digite el segundo numero:");
      num2 = leer.nextInt();

    } while (opcion != 5);


  }
}