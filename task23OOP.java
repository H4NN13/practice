public class task23OOP {
    public static  class Cat{
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }
    public static  class  Dog {
        public void sayHello(){
            System.out.println("Гав!");
        }
        public void сatchCat(Cat cat){
            System.out.println("кошка поймана");
            sayHello();
            cat.sayHello();
        }

    }
    public static void main (String[] args) {
        Cat Barsik = new Cat();
        Dog Sharik = new Dog();
        Sharik.сatchCat(Barsik);
    }
}
