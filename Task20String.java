public class Task20String {
    public static void main (String[] args){
        String number = "42";
        parseAndPrintNumber(number);
    }
    public static void parseAndPrintNumber(String number){
        int i = Integer.parseInt(number);
        int result = i/2;
        System.out.println(result);
    }
}
