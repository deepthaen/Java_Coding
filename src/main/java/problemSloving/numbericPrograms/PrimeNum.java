package problemSloving.numbericPrograms;

public class PrimeNum {

    public static void primeNum(){
        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num/2; ++i) {
        if(num % i ==0){
         flag = true;
         break;
        }

        }
        if(!flag){
            System.out.println("prime number");
        }else
        {
            System.out.println("not prime number");
        }
    }


    public static void main(String[] args) {
        primeNum();
    }
}
