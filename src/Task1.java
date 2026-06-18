public class Task1 {
    public static void main(String[] args) {
        Task1 program = new Task1();
        int result = program.drawsMonitorsCounter(10, 3);
        System.out.println(result);}
        public int drawsMonitorsCounter(int monitors, int programmers) {
            return monitors % programmers;
        }

    }
