package problemSloving.arraysPrograms;

public class SumOfNNum {

    public static void sumofnum(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumofnum(50);
    }
}
