package problemSloving.numbericPrograms;

import java.util.Scanner;

public class SwapNumber {

    public static void swapNumwithThirdVar(){
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        int num2 =n2.nextInt();
        System.out.println("before swapping ::"+num1 +" "+num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void swapNumwithoutThirdVar(){
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        int num2 =n2.nextInt();
        System.out.println("before swapping ::"+num1 +" "+num2);

        num1 = num1-num2;
        num2 = num1+num2;
        num1 = num2-num1;
        System.out.println("AFter swapping ::"+num1 +" "+num2);
    }

    public static void main(String[] args) {
        swapNumwithThirdVar();
        swapNumwithoutThirdVar();
    }
}
