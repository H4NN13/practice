public class task8 {
    public static void main(String[] args){
       boolean result = (isWeekend(5));
       System.out.println(result);

    }
    public static boolean isWeekend(int weekDayNumber) {
        if (weekDayNumber == 6 || weekDayNumber == 7) {
            return true;
        } else{
            return false;
        }
    }

}
