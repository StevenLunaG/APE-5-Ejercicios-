public class OddEvenNumber {
    //Atributos
    private int number;

    //Constructor
    public OddEvenNumber(int number) {
        this.number = number;
    }

    //Metodos
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
