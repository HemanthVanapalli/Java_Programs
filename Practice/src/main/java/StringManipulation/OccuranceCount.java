package StringManipulation;

public class OccuranceCount {

    public static void main(String[] args) {
        String str = "abcv       hddgdg  hh     hhj";

        String str1 = str.replace(" ", "");

        System.out.println(str1);

        occuranceCount("RelianceJio");
    }

    public static void occuranceCount(String str) {

        char[] chars = new char[str.length()];
        int[] counter = new int[256];
        for (int i = 0; i < str.length(); i++)
            counter[str.charAt(i)]++;

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {

                if (str.charAt(i) == chars[j]) {
                    flag++;
                }
                if (flag == 1) {
                    System.out.println("Occurrence of char " + str.charAt(i)
                            + " in the String is:" + counter[str.charAt(i)]);
                }
            }
        }
    }
}
