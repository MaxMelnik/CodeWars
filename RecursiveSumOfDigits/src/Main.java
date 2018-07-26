public class Main {
        public static int digital_root(int n) {
            int sum = 0;
            while(n != 0){
                sum += (n % 10);
                n/=10;
            }
            if (sum > 9) {sum = digital_root(sum);}
            return sum;
        }

        public static void main(String[] args){
            System.out.println(digital_root(123));
            System.out.println(digital_root(9999));
        }
}
