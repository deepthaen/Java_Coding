package problemSloving;

public class PowerOfN {
    public static void main(String[] args) {
        int x=2,y=3;

        int res = 1;
        for(; y!=0; --y){
            res *= x;
        }
        System.out.println("n power n ::"+res);
    }
}
