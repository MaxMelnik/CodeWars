public class Main {

    public static int countOfGeneration = 5;
    public static int totalCount = 5;

    public static int FindTheGeneration(int number) {
        int res = 1;
        countOfGeneration = 5;
        totalCount = 5;
        while (totalCount < number) {
            countOfGeneration *= 2;
            totalCount += countOfGeneration;
            res++;
        }
        return res;
    }

    public static int PlaceInGeneration(int n) {
        FindTheGeneration((n));
        return n - (totalCount - countOfGeneration);
    }

    public static int index(int n) {
        for (int j = 4; j >= 0; j--) {
            if (n > countOfGeneration - (countOfGeneration / 5) * (5 - j)) {
                return j;
            }
        }
        return 0;
    }

    public static String WhoIsNext(String[] names, int n) {
        return names[index(PlaceInGeneration(n))];
    }

    public static void main(String[] args) {
        System.out.println(WhoIsNext(new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}, 6));
    }
}
