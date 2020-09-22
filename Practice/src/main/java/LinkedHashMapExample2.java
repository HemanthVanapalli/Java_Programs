import java.util.*;

public class LinkedHashMapExample2 {

    public static class Product{
        int pid;
        String pcurrency;
        String pname;

        public Product(int pid, String pcurrency, String pname) {
            this.pid = pid;
            this.pcurrency = pcurrency;
            this.pname = pname;
        }

        @Override
        public String toString() {
            return "ID "+pid+"\n "+"Currency "+pcurrency+"\n "+"Name "+pname;
        }
    }


    public static void main(String[] args) {

        LinkedHashMap<Integer, Product> lmap = new LinkedHashMap<Integer, Product>();

        lmap.put(1, new Product(111, "INR", "Pen"));
        lmap.put(2, new Product(222, "USD", "Book"));
        lmap.put(3, new Product(333, "AUS", "Pencil"));

        Set<Map.Entry<Integer, Product>> entries = lmap.entrySet();

        Iterator<Map.Entry<Integer, Product>> itr = entries.iterator();

        while ( itr.hasNext()){

            Map.Entry<Integer, Product> data = itr.next();

            Product value = data.getValue();

            if (value.pid == 111){
                itr.remove();
            }

            if (value.pname.equals("Book")){
                itr.remove();
            }
        }
     // Print data

        for( Map.Entry<Integer, Product> updatedData : lmap.entrySet()){

            System.out.println(updatedData);

        }

    }
}
