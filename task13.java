import java.util.Arrays;

public class task13 {
    public static void main (String[] args){
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        int[] subArray = getSubArrayBetween(numbers, 4, 10);
        System.out.println(Arrays.toString(subArray));
    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end){
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] >= start && numbers[i] <= end) {
                count = (count + 1);
            }
        }
        int[] result = new int[count];
        int resultIndex = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] >= start && numbers[i] <= end) {
                result[resultIndex] = numbers[i];
                resultIndex = (resultIndex + 1);
            }
        }
        return result;
    }
}
