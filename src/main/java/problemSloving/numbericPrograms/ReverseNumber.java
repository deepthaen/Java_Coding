package problemSloving.numbericPrograms;

public class ReverseNumber {

    public static void revereseNum(){
        int n = 1234, reversed =0;

        while(n!=0){
            int digit = n%10;
            reversed = reversed*10+digit;
            n = n/10;
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        revereseNum();
    }
}
