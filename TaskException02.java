public class TaskException02 {
    public static void main(String[] args) {
        try (Car Ford = new Car()) {
            Ford.drive();
        } catch (RuntimeException e){

        }
    }
    public static class Car implements AutoCloseable{
        @Override
        public void close(){
             System.out.println("машина закрывается...");
         }
        public void drive(){
             System.out.println("машина поехала...");
         }
    }

}
