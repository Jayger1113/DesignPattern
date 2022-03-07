package structural.flyweight.composite;



public class ConcreteKeyboard implements Keyboard {
    private String key;

    public ConcreteKeyboard(String key) {
        this.key=key;
        System.out.println("Create " + key);
    }

    @Override
    public void type(String msg) {
        System.out.println("I am " + key);
        System.out.println(msg);
    }
}
