public class task6 {
    public static void main (String[] args) {
        byte result = getAgeDiff((byte) 2, (byte) 5);

        System.out.println(result);
    }
    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age1-age2);
    }

}
