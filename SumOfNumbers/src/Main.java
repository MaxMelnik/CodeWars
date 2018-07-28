
public class Main {

        public static int GetSum(int a, int b) {
            return (a + b) * (Math.abs(a - b) + 1) / 2;
        }

    public static void main(String[] args) {
        System.out.println(GetSum(-1, 3));
    }

}
