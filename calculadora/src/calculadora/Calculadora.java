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
      System.out.println("Elige la operacion a realizar:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Seno\n6. Coseno\n7. Tangente\n8. Potencia\n9. Raiz\n10. IVA\n11. Salir");
      opcion = leer.nextInt();

      switch (opcion) {
      case 1 -> {
        System.out.println("Digite el primer numero:");
        num1 = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        num2 = leer.nextInt();

        respuesta = num1 + num2;
        System.out.println("La suma de ambos numeros es: " + respuesta);
        break;
      }
      case 2 -> {
        System.out.println("Digite el primer numero:");
        num1 = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        num2 = leer.nextInt();

        respuesta = num1 - num2;
        System.out.println("La resta de ambos numeros es: " + respuesta);
        break;
      }
      case 3 -> {

        System.out.println("Digite el primer numero:");
        num1 = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        num2 = leer.nextInt();

        respuesta = num1 * num2;
        System.out.println("El producto de ambos numeros es: " + respuesta);
        break;
      }
      case 4 -> {

        System.out.println("Digite el primer numero:");
        num1 = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        num2 = leer.nextInt();

        if (num2 == 0) {
          System.out.println("Esta respuesta es indefinida");
        } else {
          respuesta = num1 / num2;
          System.out.println("El cociente de ambos numeros es: " + respuesta);
        }
        break;
      }
      case 5 -> {

        System.out.println("Digite el primer numero:");
        num1 = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        num2 = leer.nextInt();

        respuesta = (float) Math.sin(num1);
        System.out.println("El seno del primer numero en radianes es: " + respuesta);
        respuesta = (float) Math.sin(num2);
        System.out.println("El seno del segundo numero en radianes es: " + respuesta);
        break;
      }
      case 6 -> {

        System.out.println("Digite el primer numero:");
        num1 = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        num2 = leer.nextInt();

        respuesta = (float) Math.cos(num1);
        System.out.println("El coseno del primer numero es: " + respuesta);
        respuesta = (float) Math.cos(num2);
        System.out.println("El coseno del segundo numero es: " + respuesta);
        break;
      }
      case 7 -> {

        System.out.println("Digite el primer numero:");
        num1 = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        num2 = leer.nextInt();

        respuesta = (float) Math.tan(num1);
        System.out.println("La tangente del primer numero es: " + respuesta);
        respuesta = (float) Math.tan(num2);
        System.out.println("La tangente del segundo numero es: " + respuesta);
        break;
      }
      case 8 -> {

        System.out.println("Digite la base de la potencia:");
        num1 = leer.nextInt();

        System.out.println("Digite el exponente de la potencia:");
        num2 = leer.nextInt();

        respuesta = (float) Math.pow(num1, num2);
        System.out.println("El resultado de la potencia es: " + respuesta);
        break;
      }
      case 9 -> {

        System.out.println("Digite el radical de la raiz:");
        num1 = leer.nextInt();

        System.out.println("Digite el indice de la raiz:");
        num2 = leer.nextInt();

        respuesta = (float) Math.pow(num1,1.0/ num2);
        System.out.println("El resultado de la raiz es: " + respuesta);
        break;
      }
      case 10 -> {

        System.out.println("Digite el valor al que le quiere sacar el IVA:");
        num1 = leer.nextInt();

        System.out.println("Digite el porcentaje del IVA:");
        num2 = leer.nextInt();

        respuesta = (num1*num2)/100;
        System.out.println("El IVA de "+ num1+" es: "+respuesta);
        break;
      }
      case 11 -> {
        break;
      }
      }
    } while (opcion != 11);

  }
}