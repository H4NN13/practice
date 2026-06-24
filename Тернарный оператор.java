public class task9 {
    public static void main(String[] args){
        String result = checkWeekend("Monday");
        System.out.println(result);
    }
    public static String checkWeekend(String weekday){
        return (weekday.equals("Saturday") || weekday.equals("Sunday"))
                ? "ура выходной"
                :"работать!";
    }

}
