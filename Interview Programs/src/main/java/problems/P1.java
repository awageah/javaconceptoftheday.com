package problems;

public class P1 {

    public static void main(String[] args) {
        String str = "ayman";
        System.out.println("String is " + str);
        System.out.println("Reversed String is: " + doReverse(str));
    }

    private static String doReverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
