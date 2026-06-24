public class task7 {
    public static void main (String[] args) {
        boolean result = isWeekend("Sunday");
        System.out.println(result);

    }
    public static boolean isWeekend(String weekday){
        switch (weekday){
            case "Saturday":
            case "Sunday":
            return true;
            default:
                return false;
        }





    }
}
