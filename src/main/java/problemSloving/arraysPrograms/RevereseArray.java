package problemSloving.arraysPrograms;

public class RevereseArray {

    public static void reverseArray(int[] arr){
        System.out.print("Before reverseing ::");
        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.print( arr[i]);
        }
        System.out.print("After reversing ::");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);

        }
    }


    public static void main(String[] args) {
        int[] arr ={2,3,4,1,5};
        reverseArray(arr);

    }
}
