import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {


    // Sorting using comparable
    public static class Emp implements Comparable {
        int id;
        String name;

        public Emp(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

     /*   public int compareTo(Object o) {
            Emp e = (Emp) o;
            if (id == e.id)
                return 0;
            else if (id > e.id)
                return 1;
            else return -1;
        }*/

        public int compareTo(Object o) {
            Emp e = (Emp) o;
            return this.id - e.getId();
        }

        public String toString() {
            return "[ id=" + id + ", name=" + name + "]";
        }
    }


    public static void comparable() {
        ArrayList<Emp> a1 = new ArrayList<Emp>();

        a1.add(new Emp(3, "Sunil"));
        a1.add(new Emp(2, "Vishu"));
        a1.add(new Emp(1, "Ram"));
        a1.add(new Emp(4, "Siva"));
        Collections.sort(a1);
        System.out.println("Comparable Result ");
        for (Emp e : a1) {
            System.out.println(e);
        }

    }


    public class Student {

        private int id;
        private String name;
        private int roll;

        public Student(int id, String name, int roll) {
            this.id = id;
            this.name = name;
            this.roll = roll;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public String toString() {
            return "id = " + id + " Roll =" + roll + " Name =" + name;
        }


    }

    public static Comparator<Student> nameSort = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Student> idSort = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            return o1.getId() - o2.getId();
        }
    };

    public static Comparator<Student> rollSort = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            return o1.getRoll() - o2.getRoll();
        }
    };


    public void comparator() {
        ArrayList<Student> al = new ArrayList<Student>();

        al.add(new Student(2, "Rahul", 234));
        al.add(new Student(1, "Sunil", 235));
        al.add(new Student(4, "Siva", 236));
        al.add(new Student(3, "Ram", 237));
        System.out.println("Comparator Result ");
//        Collections.sort(al, idSort);
//        Collections.sort(al, rollSort);
        Collections.sort(al, nameSort);
        for (Student str : al) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        comparable();
        new Sorting().comparator();

    }
}

