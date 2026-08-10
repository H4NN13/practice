import java.math.BigInteger;
import java.util.stream.LongStream;
public class task526_1 {
    public static void main(String[] args) {
        System.out.println("факториал числа 5: " + factorial(5));
    }
    public static BigInteger factorial(int value){
        if (value <= 0){
            return BigInteger.ONE;
        }
        return LongStream.rangeClosed(1, value)
                .mapToObj(BigInteger :: valueOf)
                .reduce(BigInteger.ONE, BigInteger :: multiply);
    }
}
