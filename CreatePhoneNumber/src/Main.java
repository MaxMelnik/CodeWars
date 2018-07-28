public class Main {


    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{ 8, 0, 0, 5, 5, 5, 3, 5, 3, 5}));
    }
}
