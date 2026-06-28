
public class task12 {
    public static void main (String[] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        printArray(arr);
    }
    public static void printArray(int[] numbers) {
        if (numbers.length == 0)
            System.out.print("[]");
        System.out.print("[");


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1)
                System.out.print(", ");
        }
            System.out.print("]");

        return;

    }


    }
