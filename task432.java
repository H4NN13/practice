import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.Reader;

public class task432 {

    public static void main(String[] args) {
        String testData = "Алексей 3000\n" +
                          "Дмитрий 9000\n" +
                          "Антон 3000\n" +
                          "Алексей 7000";
        Reader reader = new StringReader(testData);
        Map<String, Long> result = getSalesMap(reader);
        System.out.println("посчитали");
        System.out.println(result);
    }

    public static Map<String, Long> getSalesMap(Reader reader){
        Map<String, Long> sales = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            String priceTxt = parts[1];
            Long money = Long.parseLong(priceTxt);
            if (sales.containsKey(name)){
                Long oldMoney = sales.get(name);
                sales.put(name, oldMoney + money);
            } else {
                sales.put(name, money);
            }

        }
        return sales;
    }
}
