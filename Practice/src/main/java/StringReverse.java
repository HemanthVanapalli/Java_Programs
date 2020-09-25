public class StringReverse {

    public static void main(String[] args) {
        reverseString("This is java world");
    }

    public static void reverseString(String str) {

        String[] words = str.split(" ");
        String reverseString = "";

        for ( String word : words){ // Welcome

            String reverseWord="";

            for (int i=word.length()-1; i>=0;i--){
                reverseWord = reverseWord+word.charAt(i); // emocleW
            }
            reverseString = reverseString+reverseWord+" ";
        }

      //  System.out.println(reverseString);

        //2. Second Approach

        StringBuffer stringBuffer  = new StringBuffer(str);

        String reverseWord="";

        reverseWord = reverseWord+stringBuffer.reverse();

        System.out.println(reverseWord);

    }
}
