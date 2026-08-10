import java.util.function.Function;
import java.util.function.UnaryOperator;

public class task516 {
    public static void main(String[] args) {
        task516 test = new task516();
        System.out.println(test.sqrt().apply(5));

    }
    public UnaryOperator<Integer> sqrt(){
        return a -> a * a;
    }
}
