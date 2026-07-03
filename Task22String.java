public class Task22String {
    public static void main(String[] args){
        String gmail = "biba123@gmail.com";
        String outlook = "boba321@outlook.com";
        String bad = "buba333@rambler.ru";
        boolean result = isGmailOrOutlook(gmail);
        boolean result1 = isGmailOrOutlook(outlook);
        boolean result2 = isGmailOrOutlook(bad);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static boolean isGmailOrOutlook(String email){
        if (!email.endsWith("@gmail.com") && !email.endsWith("@outlook.com")) {
            System.out.println("попробуйте другой email");
            return false;
        }
        if(email.endsWith("@gmail.com")){
            System.out.println("это gmail!");
        } else if (email.endsWith("@outlook.com")){
            System.out.println("это Outlook!");
        }
            String[] parts = email.split("@");
            return parts[0].matches("[a-zA-Z0-9]+");
        };
}
