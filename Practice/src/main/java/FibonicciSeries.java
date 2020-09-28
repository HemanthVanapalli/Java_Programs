public class FibonicciSeries {

    public static void main(String[] args) {


    }
    //1. General Prgram
    public static void fib(int num) {
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        for (int i = 0; i <= num; i++) {
            temp = n1 + n2;

            n2 = n1;
            n1 = temp;
            System.out.println("fibonicci series " + temp);
        }

    }

    // Recursive function to generate fibonicci sequence
    public static int fibonicci(int n){
        if (n <= 1)
            return n;
        else
            return fibonicci(n - 1) + fibonicci(n - 2);
    }


    static void printReversedFib( int x) {
        if (x <= 1)
            System.out.println(fibonicci(x));
        else {
            System.out.println(fibonicci(x));
            printReversedFib(x - 1);
        }
    }
}

