public class SumNaturalNumber {

    public static void main(String[] args) {

        int num = 9;
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println("Total " + sum);
        int k = 0;
        while (k <= num) {
            sum1 = sum1 + k;
            k++;
        }
        System.out.println("While loop sum " + sum);
    }
}
