import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {

        String[] name ={"Java", "JavaScript", "RUby", "C", "Python", "Java","C"};

        //1.  Compare each element-- worst solution 0(n*n)

        for(int i=0 ; i<name.length; i++){
            for (int j=i+1; j<name.length;j++){
                if (name[i].equals(name[j])){
                    System.out.println("Duplicate element is "+name[i]);
                }
            }
        }
        System.out.println("***********************************");
        //2. Using HashSet
        Set<String> store = new HashSet<String>();

        for (String names: name){
            if (!store.add(names)){
                System.out.println("Duplicate element  "+names);
            }
        }
        System.out.println("**********************************");
        //3. HashMap

        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        for (String names: name){
            Integer count = storeMap.get(names);

            if (count==null){
                storeMap.put(names, 1);
            }
            else
                storeMap.put(names, ++count);
        }

        // get values from this hashMap
        Set<Map.Entry<String, Integer>> entrySet= storeMap.entrySet();

        for (Map.Entry<String, Integer> entry: entrySet){

            if (entry.getValue()>1){
                System.out.println("Dupicate Element is "+entry.getKey());
            }
        }
    }
}
