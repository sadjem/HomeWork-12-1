package HomeWork121;

public class Main {
    public static void main(String[] args) {
        String s = "dog has man";
        System.out.println(s);
        System.out.println(stringReverse(s));
    }

    public static String stringReverse(String s) {
        String[] tmp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = tmp.length - 1; i >= 0; i--) {
            sb.append(tmp[i] + " ");
        }
        return sb.toString().trim();
    }
}
