public class Main {
    public static char findMissingLetter(char[] array)
    {
        char missing = ' ';
        Boolean flag = true;
        int i = 0;
        while (flag)
        {
            int a = (int) array[i];System.out.println(a);
            int b = (int) array[i+1];System.out.println(b);
            if (b-a == 2)
            {
                missing = (char) (a+1);
                flag = false;
            }
            i++;
        }
        return missing;
    }

    public static void main(String[] args) {
        System.out.println("!!!START!!!!");
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' }));
        System.out.println("!!!!END!!!");
    }
}
