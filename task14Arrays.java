import java.util.Arrays;
public class task14Arrays {
    public  static void main(String[] args){
        int[] array5 = new int[]{1, 2, 3, 4, 5};
        int[] array6 = new int[] {1, 2, 3, 4, 5, 6};

        for(int i = 0; i < array5.length; i++){
            if(i == (array5.length) / 2){
                int middle = array5[i];
                int[] newArr_1 = new int[]{middle};
                System.out.println(Arrays.toString(newArr_1));
            }
        }
        for (int i = 0; i < array6.length; i++){
            if(i == (array6.length) / 2){
                int middle1 = (array6[i]);
                int middle2 = (array6[i - 1]);
                int[] newArr_2 = new int[]{middle2, middle1};
                System.out.println(Arrays.toString(newArr_2));
            }
        }

    }

}
