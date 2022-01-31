package problemSloving.stringsPrblms;

import java.util.Scanner;

public class ReverseString {

    public static void revereseString(){

        String s = "Deeptha AJio";
        System.out.println("Input string :: "+s);
        String res ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            res = res+s.charAt(i);

        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        revereseString();
    }
}
