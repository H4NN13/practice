public class task5 {
    public static void main (String [] args) {
        char result = charExpression(2);
        System.out.println(result);

    }

    public static char charExpression(int a) {
        return (char) ('a' + a);
    }
}
