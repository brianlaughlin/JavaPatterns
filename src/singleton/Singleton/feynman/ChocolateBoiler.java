package singleton.Singleton.feynman;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null) uniqueInstance = new ChocolateBoiler();

        return uniqueInstance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }
}
