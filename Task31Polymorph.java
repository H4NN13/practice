public class Task31Polymorph {
    public static void main(String[] args) {

        Student usualStudent = new Student();
        System.out.println("обычный студент");
        usualStudent.study();

        JavaStudent javaStudent = new JavaStudent();
        System.out.println("Java студент");
        javaStudent.study();

        LazyStudent lazyStudent = new LazyStudent();
        System.out.println("ленивый студент");
        lazyStudent.study();
    }
    public static class Student{
       public String studying = "учусь";
       public void study (){
           System.out.println(studying);
       }
    }
    public static class JavaStudent extends Student{
        public JavaStudent(){

        }
        @Override
        public void study(){
            System.out.println("Я очень занят. Прохожу курс по Java.");
        }
    }
    public static class LazyStudent extends Student{
        public LazyStudent(){

        }
        @Override
        public void study(){
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }
}
