package singleton.Singleton.feynman;

public class Singleton {

    // Part I
    // Static variable that holds the class.
    // Already instantiated
    private static Singleton uniqueInstance;
    private String idName;

    // Part II
    // a private constructor. This can not be called directly.
    private Singleton() {
    }

    // Part III
    // A method allow user to assigned the object.
    public static Singleton getInstance() {
        // If we don't use it, it never gets created.
        if (uniqueInstance == null) uniqueInstance = new Singleton();  // this is lazy instantiation

        return uniqueInstance;
    }

    public String youGotThis(){
        return "You got this!";
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }
}
