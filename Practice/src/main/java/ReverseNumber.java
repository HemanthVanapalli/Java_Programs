public class ReverseNumber {

    public static void main(String[] args) {

        //123 = 321, 457 = 754

        int num = 1234;

        int rev = 0;


        while (num != 0) {
            int sum = num % 10; // 4
            rev = rev * 10 + sum;
            num = num / 10; // 123

        }
        System.out.println("Reverse "+rev);
    }
}
