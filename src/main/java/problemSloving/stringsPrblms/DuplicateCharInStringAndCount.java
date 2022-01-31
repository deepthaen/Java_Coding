package problemSloving.stringsPrblms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharInStringAndCount {

    public static void duplicateChar(){
        System.out.println("ENter string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = s.toCharArray();
        for (char c:charArray) {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        for (Map.Entry<Character, Integer> entry:
        map.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                        + " : "
                        + entry.getValue());
            }
        }

    }

    public static void main(String[] args) {
        duplicateChar();

    }
}
