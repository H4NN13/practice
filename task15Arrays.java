import java.util.Arrays;

public class task15Arrays {
    public static void main(String[] args){
        int[] mass5 = new int[]{1, 2, 3, 4, 5};
        int[] mass6 = new int[]{1, 2, 3, 4, 5, 6};
        int[] newArr = Arrays.copyOfRange(mass5, mass5.length/2, (mass5.length/2) + 1);
        int[] newArr_2 = Arrays.copyOfRange(mass6, (mass6.length/2) -1, (mass6.length/2) + 1);
        System.out.print(Arrays.toString(newArr));
        System.out.print(Arrays.toString(newArr_2));
    }
}
