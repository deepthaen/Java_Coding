package problemSloving.stringsPrblms;

public class ReplaceOnlyCHaracter {

    public static void main(String[] args) {
        String s = "hgfu345jgDSfhgj5454h12";
        String res = s.replaceAll("[^\\d]", "");
        System.out.println(res);
    }
}
