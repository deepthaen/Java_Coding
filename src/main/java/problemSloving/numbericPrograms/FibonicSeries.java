package problemSloving.numbericPrograms;

public class FibonicSeries {

    public static void fibonicSeries(int n){

        int n1 =0, n2=1;
        int count=0;

        while(count<n){
            System.out.println(n1 + " "+ "");
            int n3 = n1+n2;
            n1=n2;
            n2= n3;
            count = count+1;
        }

    }

    public static void main(String[] args) {
        int n =10;
        fibonicSeries(n);
    }
}
