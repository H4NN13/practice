import java.util.function.Function;
import java.util.Objects;
public class task516_2 {
    public static void main(String[] args) {
        NumberGenerator<? super Number> myGen = getGenerator();
        System.out.println("5 большу нуля? " + myGen.cond(5));
        System.out.println("-2 больше нуля? " + myGen.cond(-2));
        System.out.println("0.01 больше нуля? " + myGen.cond(0.01));
    }
    @FunctionalInterface
    public interface NumberGenerator<T extends Number>{
        boolean cond(T arg);
    }
    public static NumberGenerator<? super Number> getGenerator(){
        return n -> n.doubleValue() > 0;
    }

}
