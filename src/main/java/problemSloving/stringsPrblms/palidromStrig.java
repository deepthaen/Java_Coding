package problemSloving.stringsPrblms;

public class palidromStrig {

    public static void checkStringPalindrom(){
        String s = "Radar";
        String res = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            res = res+s.charAt(i);

        }
        System.out.println(res);
        if(s.toLowerCase().equals(res.toLowerCase())){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }

    public static void main(String[] args) {
        checkStringPalindrom();
    }
}
