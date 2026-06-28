import java.util.Arrays;
public class task17Arrays {
    public static void main(String[] args){
        int[] array1 = new int[]{1, 3, 7, 5};
        int[] array2 = new int[]{8, 4, 2, 4};
        int[] array3 = mergeAndSort(array1, array2);
        System.out.print(Arrays.toString(array3));
    }
    public static int[] mergeAndSort(int[] first, int[] second){
        int[] result = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++ ){
            result[i] = first[i];
        }
        for (int i = 0; i < second.length; i++){
            result[first.length + i] = second[i];
        }
        Arrays.sort(result);
        return result;
    }
}
