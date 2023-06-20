import java.util.List;
import java.util.ArrayList;

public class CalculateAverage {

    //Atributos
    private List<Integer> numeros;

    //Constructor
    public CalculateAverage() {
    numeros = new ArrayList<>();
    }

    //Metodos
    public void agregarNumero(int numero) {
    numeros.add(numero);
    }
    public double calcularPromedio() {
    if (numeros.isEmpty()) {
    return 0;
    }
    int suma = 0;
    for (int numero : numeros) {
    suma += numero;
    }
    double promedio = (double) suma / numeros.size();
    return promedio;
    }
}
