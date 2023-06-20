public class TriangleArea {
    //Atributos
    private double side1;
    private double side2;
    private double side3;

    //Constructor
    public TriangleArea(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Metodos
    public double getArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
