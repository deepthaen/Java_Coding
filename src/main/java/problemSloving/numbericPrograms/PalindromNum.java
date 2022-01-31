package problemSloving.numbericPrograms;

public class PalindromNum {

    public static void palindromNum(){
        int n = 3232, reveresed =0;
        while (n!=0){
            int digit = n%10;
            reveresed = reveresed*10+digit;
            n = n/10;
        }
        System.out.println("rev num ::"+reveresed);

        if(n == reveresed){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }


    public static void main(String[] args) {
        palindromNum();
    }
}
