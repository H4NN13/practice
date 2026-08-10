import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class task526_3 {
    public static void main(String[] args) {
        List<Integer> statusCodes = Arrays.asList(200, 201, 500, 200, 400, 404, 403, 400, 500, 200);

        Long successCount = statusCodes.stream()
                .filter(code -> code >= 200 && code < 300)
                .count();
        System.out.println("успешных кодов: " + successCount);

        Long clientErrorsCount = statusCodes.stream()
                .filter(code -> code >= 400 && code < 500)
                .count();
        System.out.println("клиентских ошибок: " + clientErrorsCount);

        boolean hasServerError = statusCodes.stream()
                .anyMatch(code -> code >= 500 && code < 600);
        System.out.println("есть ли серверные ошибки? " + hasServerError);

        Integer mostFrequent = statusCodes.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("самый частый код: " + mostFrequent);

        double successPercent = ((double) successCount / statusCodes.size()) * 100;
        System.out.println("процент успешных запросов: " + successPercent + "%");


    }
}
