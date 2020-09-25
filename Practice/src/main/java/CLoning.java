public class CLoning implements Cloneable{

    int a = 10, b = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        CLoning t1 = new CLoning();
        System.out.println(new CLoning().a);
        System.out.println(new CLoning().b);

        CLoning t2 = (CLoning) t1.clone();

        System.out.println(t2.a);
        System.out.println(t2.b);

    }

}
