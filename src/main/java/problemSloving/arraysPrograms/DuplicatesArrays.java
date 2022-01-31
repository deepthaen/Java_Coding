package problemSloving.arraysPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesArrays {

    
    public static void duplicatesArray(int[] arr){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
            
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ ":"+
                        entry.getValue());
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,4,2,7,2,7,5,6};
        duplicatesArray(arr);
    }
}
