
public class Main {

    public static boolean validatePin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {return false;}
        String voc = "0123456789";
        int flag = 0;
        for (int i = 0; i<pin.length(); i++){
            flag = 0;
            for (int j = 0; j<10; j++){
                System.out.println(pin.charAt(i) + " " + voc.charAt(j) + " flag " + flag);
                if (voc.charAt(j) != pin.charAt(i)){
                    flag++;
                }
            }
            if (flag == 10) { return false;}
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("!!!START!!!!");
        System.out.println(validatePin(".234"));
        System.out.println("!!!!END!!!");
    }
}
