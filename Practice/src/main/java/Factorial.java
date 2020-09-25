public class Factorial {

    public static void main(String[] args) {
        getFact(5);

    }

    public static void getFact(int num) {
        // !5 = 5*4*3*2*1 = 120
        //!0 = 1
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Fact is " + fact);
    }


}
