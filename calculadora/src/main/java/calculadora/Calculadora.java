package calculadora;
import java.util.Scanner;
/*Valentina Cardenas Mercado*/
public class Calculadora {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int opcion;
    float num1 = 0;
    float num2 = 0;
    float respuesta;

    do {
      System.out.println("Elige la operacion a realizar:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Seno\n6. Coseno\n7. Tangente\n8. Salir");
      opcion = leer.nextInt();
      
      System.out.println("Digite el primer numero:");
        num1 = leer.nextInt();

      System.out.println("Digite el segundo numero:");
      num2 = leer.nextInt();

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
        respuesta = (float)Math.sin(num1);
        System.out.println("El seno del primer numero es: " + respuesta);
        break;
      }
      case 8 -> {
        continue;
      }
      }
      
      
      

    } while (opcion != 5);


  }
}