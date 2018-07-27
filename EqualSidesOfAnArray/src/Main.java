import java.util.Arrays;

public class Main {
    public static int findEvenIndex(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++){sumLeft += arr[j];}
            for (int j = i+1; j < arr.length; j++){sumRight += arr[j];}
            if (sumLeft == sumRight) {return i;}
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 42, 4, 2}));
    }
}
