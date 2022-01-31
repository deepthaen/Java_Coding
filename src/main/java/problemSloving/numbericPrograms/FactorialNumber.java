package problemSloving.numbericPrograms;

public class FactorialNumber {

    public static void factorialNum(){
        int n=5, fact=1;
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;

        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        factorialNum();
    }
}
