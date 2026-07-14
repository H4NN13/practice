public class Task30Incapsulation {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getExperience());
        System.out.println(human.getSecret());
        System.out.println(human.getGossip());
        System.out.println(human.getNews());
    }
    public static class Human {
        String secret = "мой секрет";
        String news = "новости";
        String experience = "личный опыт";
        String gossip = "сплетня";

        private String getSecret(){
            return secret;
        }
        String getGossip(){
            return gossip;
        }
        public String getNews(){
            return news;
        }
        protected String getExperience(){
            return experience;
        }
    }
}
