import java.util.*;

public class OccuranceCount {

    public static void main(String[] args) {
        occuranceCount("Reliance Jio");
    }


    public static void occuranceCount(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> characterCount = new LinkedHashMap<>();
        // character count check
        for (char c : chars) {
                Integer count = characterCount.get(c);
                if (count == null) {
                    characterCount.put(c, 1);
                } else
                    characterCount.put(c, ++count);
        }

// Fetch the values
        Set<Character> characters = characterCount.keySet();
        for (Character character : characters){
                System.out.println("Character :"+character+ " with occurance "+characterCount.get(character));
        }
    }
}
