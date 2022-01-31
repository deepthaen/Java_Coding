package problemSloving.arraysPrograms;

public class SecondLargestElement {

    public static void secondLargestElement(){
        int temp;
        int[] arr = {10,20,30,40,50,60,70};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                 if(arr[i]>arr[j]){
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
            }
        }
        System.out.println(arr[arr.length-2]);
    }

    public static void main(String[] args) {
        secondLargestElement();
    }
}
