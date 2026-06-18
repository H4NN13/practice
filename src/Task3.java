public class Task3 {

    public static void main(String[] args) {
        calcCircleRadius(123);
    }
    public static void  calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f\n", radius);

    }
}
