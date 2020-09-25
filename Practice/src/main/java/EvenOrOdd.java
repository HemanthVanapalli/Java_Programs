import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner
                = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = scanner.nextInt();

        if( n % 2 == 0)
            System.out.println("Is Even");
        else System.out.println("Is Odd");
    }



}
