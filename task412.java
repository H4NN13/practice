public class task412 {
    public static void main(String[] args) {
        Box<String> emptyBox = Box.getBox();
    }
    public static class Box <T> {
        private T object;
        public static <T> Box<T> getBox(){
            return new Box<T>();
        }
    }
}
