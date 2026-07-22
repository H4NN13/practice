class MyNewException extends Exception{
    public MyNewException (String massage){
        super(massage);
    }
}

public class TaskException01 {
        public void testexp() throws MyNewException{
            throw new MyNewException("first exeption");
        }
    public static void main(String[] args) {
        TaskException01 task  = new TaskException01();
        try {
            task.testexp();
        } catch (MyNewException e){
            System.out.println("exeption catched " + e.getMessage());
        }
    }
}
