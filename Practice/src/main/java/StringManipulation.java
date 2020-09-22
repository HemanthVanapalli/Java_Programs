public class StringManipulation {

    public void palindrome() {


        String s1 = "ABCCDBA";
        String rev="";
        int len = s1.length();

        for (int i = len - 1; i >= 0; i--) {
             rev = rev + s1.charAt(i);
        }


    }

    public static void main(String[] args) {

    }
}
