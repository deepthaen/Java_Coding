package problemSloving.arraysPrograms;

public class SortArray {

    public static void descendingOrder(){
        int[] arr = {2,4,1,3,5,6,9};
        int temp;
        for (int num:arr) {
            System.out.print(num+ " ");
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <= arr.length-2; j++) {
                if (arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                }
        }
            System.out.println("after descending sort ::");
            for (int num : arr){
                System.out.println(num+ "");
            }
        }



    public static void main(String[] args) {
        descendingOrder();
    }
}
