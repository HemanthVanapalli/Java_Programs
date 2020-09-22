public class FibonicciSeries {

    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13 21

        int num = 10;
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
}
