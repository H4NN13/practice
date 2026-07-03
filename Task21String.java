import java.util.Locale;

public class Task21String {
    public static void main(String[] args) {
        String privet = "Was it a cat I saw?";
        boolean result = isPalindrome(privet);
        System.out.println(result);
    }
        public static boolean isPalindrome(String text) {
            String CleanText = text.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
            String reverse = new StringBuilder(CleanText).reverse().toString();
            return CleanText.equals(reverse);
        }

    }
