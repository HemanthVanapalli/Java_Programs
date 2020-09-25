import java.util.*;

public class TreeMapExample{

    public static class Product{
        int pid;
        String pname;

        public Product(int pid, String pname) {
            this.pid = pid;
            this.pname = pname;
        }

        @Override
        public String toString() {
            return "ID "+pid+" "+"Name "+pname;
        }
    }

    public static class Customer{
        int cid;
        String cname;

        public Customer(int cid, String cname) {
            this.cid = cid;
            this.cname = cname;
        }
        @Override
        public String toString() {
            return "Student ID "+cid+ " "+"Name "+cname;
        }
    }

    public static Comparator<Product> pidSort = new Comparator<Product>() {
        public int compare(Product o1, Product o2) {
            return o2.pid - o1.pid;
        }
    };

    public static void main(String[] args) {

        TreeMap<Product, Customer> t1 = new TreeMap<Product, Customer>(pidSort);


        t1.put(new Product(111, "Pencil"), new Customer(1, "Ram"));
        t1.put(new Product(222, "Book"), new Customer(2, "Vishu"));
        t1.put(new Product(333, "Pen"), new Customer(3, "Sunil"));


        for (Product p : t1.keySet()) {
            System.out.println(p);
        }

        for(Customer c : t1.values()){
            System.out.println(c);
        }

        for (Map.Entry<Product,Customer> p : t1.entrySet()){
            System.out.println(p);
        }

        TreeMap<Integer, String> t2 = new TreeMap<Integer, String>();
        t2.put(1, " Ratan");
        t2.put(2, "Ravi");
        t2.put(4, "Siva");
        t2.put(3, "Vishu");
        System.out.println(t2);
    }





}
