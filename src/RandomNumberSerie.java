import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class RandomNumberSerie {
    //Atributos
    private int tamanio;

    //Constructor
    public RandomNumberSerie(int tamanio) {
        this.tamanio = tamanio;
    }
    
    //Metodos
    public static List<Integer> generateSerie(int tamanio) {
        List<Integer> serie = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < tamanio; i++) {
            int number = random.nextInt(100);
            serie.add(number);
        }

        return serie;
}}
