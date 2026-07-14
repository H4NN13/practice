public class Task24OOP {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
            public boolean isWeekend(){
                switch (this){
                    case SATURDAY:
                    case SUNDAY:
                        return true;
                    default:
                        return false;
                }
            }
            public String getRusName(){
                switch (this){
                    case MONDAY:
                        return "Понедельник";
                    case TUESDAY:
                        return "Вторник";
                    case WEDNESDAY:
                        return "Среда";
                    case THURSDAY:
                        return "Четверг";
                    case FRIDAY:
                        return "Пятница";
                    case SATURDAY:
                        return "Суббота";
                    case SUNDAY:
                        return "Воскресенье";
                    default:
                        return "Неизвествный день.";
                }
            }
    }
    public static void main (String[] args){
        Day today = Day.SATURDAY;
        System.out.println(today.isWeekend());
        System.out.println(today.getRusName());
    }
}
