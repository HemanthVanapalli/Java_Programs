public class Palindrome {
    public static void main(String[] args) {
     //   isPalindromeString("madam");
        isPalindromeNumber(121);
    }

    public static void isPalindromeString(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println(str + " is palindrome");
        } else
            System.out.println(str + " not palindrome");
    }

    public static void isPalindromeNumber(int number) {
        int remainder, reverse = 0, temp = number;
        while (number != 0) {
            remainder = number % 10;
            reverse = ( reverse * 10 )+ remainder;
            number = number/10;
        }

        if (temp==reverse){
            System.out.println("is palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}
