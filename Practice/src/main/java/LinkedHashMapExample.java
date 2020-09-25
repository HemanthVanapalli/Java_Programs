import java.util.*;

public class LinkedHashMapExample {

    public static class Employee {
        int eId;
        String eName;

        public Employee(int eId, String eName) {
            this.eId = eId;
            this.eName = eName;
        }

        @Override
        public String toString() {
            return eId + " " + eName;
        }
    }

    public static class Student {
        int sid;
        String sName;

        public Student(int sid, String sName) {
            this.sid = sid;
            this.sName = sName;
        }

        @Override
        public String toString() {
            return "Student Name " + sName + " " + "ID " + sid;
        }
    }


    public static void main(String[] args) {
        LinkedHashMap<Employee, Student> lmap = new LinkedHashMap<Employee, Student>();
        lmap.put(new Employee(111, "Ram"), new Student(1, "Vishu"));
        lmap.put(new Employee(222, "Lax"), new Student(2, "Hindu"));

        Collection<Student> s1 = lmap.values();
        for (Student s : s1) {
            System.out.println(s);
        }

        for (Employee e : lmap.keySet()) {
            System.out.println(e);
        }

        for (Map.Entry<Employee, Student> e1 : lmap.entrySet()) {

            System.out.println(e1);

        }


        Set<Map.Entry<Employee, Student>> ss = lmap.entrySet();

        Iterator<Map.Entry<Employee, Student>> itr = ss.iterator();
        while (itr.hasNext()) {

            Map.Entry<Employee, Student> e = itr.next();

          //  System.out.println(e);

            Employee e1 = e.getKey();
           /* System.out.println("EMPLOYEE KEYS " + e1);

            Student s2 = e.getValue();
            System.out.println("STUDENT VALUE " + s2);*/

            if (e1.eId == 111){
                itr.remove();
            }

        }
       for (Map.Entry<Employee, Student> up : lmap.entrySet()){
           System.out.println(up.getValue());
       }
    }
}
