package decorator.javapapers.com;

public class IcecreamMaker {
    public static void main(String[] args) {
        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());
    }
}
