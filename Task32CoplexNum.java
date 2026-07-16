import java.util.Objects;

public class Task32CoplexNum {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5.5, 10.2);
        ComplexNumber num2 = new ComplexNumber(5.5, 10.2);

        System.out.println("Равны ли числа? " + num1.equals(num2));
        System.out.println("Хэш-код первого: " + num1.hashCode());
        System.out.println("Хэш-код второго: " + num2.hashCode());
    }
    public static class ComplexNumber{
        double re;
        double im;

        public ComplexNumber(double re, double im){
            this.re = re;
            this.im = im;
        }
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(re, that.re) == 0 && Double.compare(im, that.im) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(re, im);
        }
    }
}
