import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {

    //Ejercicio 1
/*      Addition addition = new Addition(0, 0);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        int result = addition.add(num1, num2);
        System.out.println("El resultado de la suma es: " + result);*/

    //Ejercicio 2
/*      TriangleArea triangleArea = new TriangleArea(0, 0, 0);

        System.out.print("Ingrese el primer lado del triangulo: ");
        double side1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo lado del triangulo: ");
        double side2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer lado del triangulo: ");
        double side3 = scanner.nextDouble();

        double area = triangleArea.getArea(side1, side2, side3);
        System.out.println("El area del triangulo es: " + area);*/

    //Ejercicio 3
/*        OddEvenNumber oddEvenNumber = new OddEvenNumber(0);

        System.out.print("Ingrese el numero que desea comprobar: ");
        int number = scanner.nextInt();

        boolean isEven = oddEvenNumber.isEven(number);

        if (isEven) {
            System.out.println("El numero " + number + " es par.");
        } else{
            System.out.println("El numero " + number + " es impar.");
        }*/

    //Ejercicio 4
/*        RandomNumberSerie randomNumberSerie = new RandomNumberSerie(0);
        System.out.print("Ingrese el tamanio de la serie que desea generar: ");
        int tamanio = scanner.nextInt();

        List<Integer> serie = RandomNumberSerie.generteSerie(tamanio);
        System.out.println("La serie generada es: " + serie);

        StringBuilder evenNumbers = new StringBuilder();
        for (int number : serie) {
            if (OddEvenNumber.isEven(number)) {
                evenNumbers.append(number).append(" ");
            }
        }

        System.out.println("Numeros pares: [ " + evenNumbers.toString() + "]");
   }*/

    //Ejercicio 5
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    CalculateAverage calculateAverage = new CalculateAverage();
    System.out.println("ingrese el numero de datos que desea ingresar:");
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("ingrese el numero " + (i + 1));
        int number = scanner.nextInt();
        calculateAverage.agregarNumero(number);
    }
    double promedio = calculateAverage.calcularPromedio();
    System.out.println("El promedio es: " + promedio);
}*/
}