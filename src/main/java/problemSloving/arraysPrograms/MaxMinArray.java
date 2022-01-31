package problemSloving.arraysPrograms;

public class MaxMinArray {

    public static void maxArray(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] >max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }

    public static void minArray(int[] arr){
        int min = arr[arr.length-1];
        for (int i=0; i< arr.length-1; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,40,50,30};
        maxArray(arr);
        minArray(arr);
    }
}
