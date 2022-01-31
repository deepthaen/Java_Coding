package problemSloving.stringsPrblms;

public class ReplaceSpecialCharacter {
    public static void main(String[] args) {
        String s = "hsdfj@#433GHSShgfh55&%$&";
        String res = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(res);
    }
}
