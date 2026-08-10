import java.util.*;
import java.util.stream.Collectors;
public class task526_2 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Иван", "ivan@test.com", "USER", 21),
                new User(2, "Пётр", "petr@test.com", "ADMIN", 35),
                new User(3, "Мария", "maria@test.com", "USER", 28),
                new User(4, "Анна", "anna@test.com", "USER", 30),
                new User(5, "Алексей", "alex@test.com", "MANAGER", 42));

        List<String> emails = users.stream()
                .filter( u -> u.getAge() > 25)
                .map(User::getEmail)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("старше по алфавиту " + emails);

        Optional<User> oldestUser = users.stream()
                .max(Comparator.comparingInt(User::getAge));
        System.out.println("самый старший " + oldestUser
                .map(u -> u.getName() + "(" + u.getAge() + ")").orElse("нет данных"));

        boolean hasAdmin = users.stream()
                .anyMatch(u -> u.getRole()
                        .equals("ADMIN"));
        System.out.println("Есть ли админ? " + hasAdmin);

        Map<String, List<User>> groupByRole = users.stream()
                .collect(Collectors.groupingBy(User::getRole));
        System.out.println("группировка по ролям:  " + groupByRole);

        List<String> allNames = Collections.singletonList(users.stream()
                .map(User::getName)
                .collect(Collectors.joining(", ")));
        System.out.println("все имена: " + allNames);

    }
    public static class User {
        private int id;
        private String name;
        private String email;
        private String role;
        private int age;

    public User(int id, String name, String email, String role, int age){
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.age = age;
        }
        public String getEmail() {
            return email;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getRole() {
            return role;
        }
        public int getAge() {
            return age;
        }
        @Override
        public String toString(){
            int s = age;
            return name + ", " + s;


        }
    }
}
