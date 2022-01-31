package problemSloving.stringsPrblms;

public class ReverseWords {
    public static void reverseWOrd(String str){
        String res = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            res = res + str.charAt(i);
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
       reverseWOrd("deeptha ajio");

    }
}
