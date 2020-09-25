public class LeapYear {
    public static void main(String[] args) {

        //Divisible by 4 for all centuries -- ending with 00
        // century is leap year only when its perfectly divisible by 400\

        int year = 2020;
        boolean flag = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            } else {
                flag = true;
            }
        } else {
            flag = false;
        }

        if (flag)
        System.out.println("Leap year");
        else {
            System.out.println("Not a leap year");
        }
    }
}
