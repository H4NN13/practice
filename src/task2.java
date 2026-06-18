public class task2 {
    public static void main(String [] args) {
        task2 program = new task2();
        double total = program.priceCalculation(8.50, 2);
        System.out.println(total);
    }
    public double priceCalculation(double price, int count) {
        return price * count;
    }
}
