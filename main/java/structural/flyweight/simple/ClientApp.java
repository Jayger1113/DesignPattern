package structural.flyweight.simple;

public class ClientApp {
    public static void main(String[] args) {
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        Keyboard enter1 = keyboardFactory.getKeyboard("enter");
        enter1.type("enter key typing");
        Keyboard enter2 = keyboardFactory.getKeyboard("enter");
        enter2.type("enter key typing");

        //enter1 == enter2
        System.out.println(enter1 == enter2);

        Keyboard esc = keyboardFactory.getKeyboard("esc");
        esc.type("esc key typing");

    }
}
