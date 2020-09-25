public class SingleTonClass {
    //Static Class Reference
    private static SingleTonClass obj=null;
    private SingleTonClass(){
        /*Private Constructor will prevent
         * the instantiation of this class directly*/
    }
    public static SingleTonClass objectCreationMethod(){
        /*This logic will ensure that no more than
         * one object can be created at a time */
        if(obj==null){
            obj= new SingleTonClass();
        }
        return obj;
    }
    public void display(){
        System.out.println("Singleton class Example");
    }

    public void display2(){
        System.out.println("Singleton class2 Example");
    }
    public static void main(String args[]){
        //Object cannot be created directly due to private constructor
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
        SingleTonClass myobject= SingleTonClass.objectCreationMethod();
        myobject.display();
        SingleTonClass myobject1= SingleTonClass.objectCreationMethod();
        myobject1.display2();
    }
}