import java.util.Arrays;

public class Main {
        public static double findUniq(double arr[]) {
            Arrays.sort(arr);
            if (arr[0] == arr[1]) return arr[arr.length-1];
            else return arr[0];
        }

        public static void main(String[] args) {
            System.out.println(findUniq(new double[]{17, 17, 17, 42, 17, 17}));
        }
}

