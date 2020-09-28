public class Factorial {

    public static void main(String[] args) {
        getFact(5);
        System.out.println(fact(5));

    }

    // 1. Genral Solution
    public static void getFact(int num) {
        // !5 = 5*4*3*2*1 = 120
        //!0 = 1
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Fact is " + fact);
    }

    // 2. Recursion
    public static int fact(int n) {

        if (n == 1)
            return n;
        else
            return n * fact(n - 1);
    }


}
