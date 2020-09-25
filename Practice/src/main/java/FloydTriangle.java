public class FloydTriangle {
    public static void main(String[] args) {
      //  startraingle(10);
    //    numbertraingle(10);
     //   innerIteration(10);
     //   reverseFolyd(10);
     //   reverseFolydstar(10);
     //   reverseFolydinner(10);
      //  pyramid(10);
        test();
    }

    public static void startraingle(int n) {
        int k =0;
        for(int i = 1; i <= n; i++) {
            for(int j=1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numbertraingle(int n) {
        int k =0;
        for(int i = 1; i <= n; i++) {
            for(int j=1;j <= i; j++){
                System.out.print(" "+k++);
            }
            System.out.println();
        }
    }

    public static void innerIteration(int n){
        int k =0;
        for(int i = 1; i <= n; i++) {
            for(int j=1;j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void reverseFolyd(int n){
        int k =0;
        for(int i = n; i >= 0; i--) {
            for(int j=1;j <= i; j++){
                System.out.print(" "+k++);
            }
            System.out.println();
        }
    }

    public static void reverseFolydstar(int n){
        int k =0;
        for(int i = n; i >= 0; i--) {
            for(int j=1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseFolydinner(int n){
        int k =0;
        for(int i = n; i >= 0; i--) {
            for(int j=1;j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){
        int k =0;
        for(int i = 1; i <= n; ++i, k = 0) {
            for(int j = 1; j <= n - i; ++j) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }

    public static void test(){
        String amt = "₹100.0";
        System.out.println(amt.split("₹")[1]);


    }
}
