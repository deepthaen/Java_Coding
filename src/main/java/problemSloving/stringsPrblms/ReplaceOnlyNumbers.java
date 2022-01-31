package problemSloving.stringsPrblms;

public class ReplaceOnlyNumbers {

    public static void replaceOnlyNumbers(){
        String s = "fhsfh3245fg43ds2";
        String res = s.replaceAll("[0-9]", "");
        System.out.println("replace only numbers and string is :: "+res);

    }

    public static void main(String[] args) {
        replaceOnlyNumbers();
    }
}
