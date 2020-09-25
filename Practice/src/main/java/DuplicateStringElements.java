
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateStringElements {

    public static void main(String[] args) {
        removeStringDuplicate("Sandeep");
    }

    public static void removeStringDuplicate(String str) {

        Set<Character> characters = new LinkedHashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!characters.contains(c)){
                characters.add(c);
                stringBuffer.append(c);
            }
        }
        System.out.println(stringBuffer.toString());

        characters.forEach(words -> {
            System.out.println(words);
        });


    }
}
