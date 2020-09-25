public class Swap {

    public static void main(String[] args) {


        int a  = 10;
        int b = 20;

        System.out.println("Before swap :");
        System.out.println("Value of a "+a);
        System.out.println("value of b "+b);

        System.out.println("After swaping");

        int temp ;
        temp = a;
        a=b;
        b=temp;

        System.out.println("value of a "+a);
        System.out.println("value of b "+b);

        System.out.println("--------------------------");

        a = a-b;
        b= a+b;
        a = b-a;

        System.out.println("value of a "+a);
        System.out.println("value of b "+b);
    }
}
