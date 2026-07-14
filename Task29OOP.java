public class Task29OOP {
    public static void main(String[] args){
        String[] myWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(weekendCount(myWeek));
        System.out.println(weekdayCount(myWeek));

    }
    public static boolean isWeekend(String dayName){
        return dayName.equals("Saturday") || dayName.equals("Sunday");
    }
    public static int weekendCount(String[] days){
        int count = 0;
        for (String day: days){
            if(isWeekend(day)){
                count++;
            }
        }
        return count;
    }
    public static int weekdayCount(String[] days){
        int count = 0;
        for (String day : days){
            if (!isWeekend(day)){
                count++;
            }
        }
        return count;
    }
}
