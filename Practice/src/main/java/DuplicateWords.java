import java.util.*;

public class DuplicateWords {

    public static void main(String[] args) {
    //    findDuplicate("This is java for java program is This");

        removeDuplicate("This is java java program");
    }

    public static void findDuplicate(String sentence){

        int counter =1;
        //Split words
        String[] words = sentence.split(" ");


        //Store in hashMap
        Map<String , Integer> wordCount = new HashMap<String, Integer>();

        //Word count
        for (String word: words){
            if (wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            else
                wordCount.put(word,1);
        }

        //extract data frem map - word count
        Set<String> wordsInString = wordCount.keySet();

        for (String word: wordsInString){
            if (wordCount.get(word)>1){
                System.out.println(word+" : "+ wordCount.get(word));
            }
            else
                System.out.println(word+" : "+ wordCount.get(word));
        }

     }

     public static void removeDuplicate(String sentence){

        String[] words = sentence.split(" ");

        Set<String> storeWords = new LinkedHashSet<String>();

        for (String word: words){
           storeWords.add(word);
        }

       //  System.out.println(storeWords);
        storeWords.forEach(word->{
       //     System.out.println(word);
        });

        Iterator itr = storeWords.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+"\t");
        }

     }
}
