import java.math.BigInteger;
public class task11 {
    public static void main(String[] args){
        BigInteger eureka = factorial(5);
        System.out.println(eureka);


    }
    public static BigInteger factorial(int value){
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= value; i++){
            result = (result.multiply(BigInteger.valueOf(i)));
        }
        return result;

    }
}
