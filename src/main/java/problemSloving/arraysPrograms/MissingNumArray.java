package problemSloving.arraysPrograms;

public class MissingNumArray {

    public static void missingNum(int[] arr){
        int len = arr.length;
        int sum = ((len+1)*(len+2))/2;
        for (int i = 0; i < len; i++) {
            sum = sum-arr[i];
        }
        System.out.println(sum);

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        missingNum(arr);
    }
}
