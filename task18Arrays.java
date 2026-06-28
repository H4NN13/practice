import java.util.Arrays;
public class task18Arrays {
    public static void main(String[] args){
        int[] arr = new int[]{3,5,20,8,7,3,100};
        int[] finalArray = printOddNumbers(arr);
        System.out.print(Arrays.toString(finalArray));
    }
    public static  int[] printOddNumbers(int[] arr){
        int count = 0;
            for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        };
        int[] arr2 = new int[count];
        int arr2Index = 0;
            for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                arr2[arr2Index] = arr[i];
                arr2Index++;
            }
        }
        return arr2;
    }
}
