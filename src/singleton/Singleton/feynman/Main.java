package singleton.Singleton.feynman;

public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.youGotThis());
        obj1.setIdName("Am I Obj1");

        // Can't be created
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.youGotThis());
        System.out.println(obj2.getIdName());

        // Can't be created here either with a new operator
      //  Singleton obj3 = new Singleton();  Gives an error since it's private.

    }
}
