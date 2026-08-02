import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class task422 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;

        while (scanner.hasNextInt()){
           int number = scanner.nextInt();
           if (index % 2 != 0){
               stack.push(number);
           }
           index++;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
