package structural.flyweight.simple;

import java.util.HashMap;

//享元工廠角色
public class KeyboardFactory {
    private static volatile KeyboardFactory keyboardFactory;

    private HashMap<String, Keyboard> keyboardMap = new HashMap<String, Keyboard>();

    public static KeyboardFactory getInstance() {
        if (keyboardFactory == null) {
            synchronized (KeyboardFactory.class) {
                if (keyboardFactory == null) {
                    keyboardFactory = new KeyboardFactory();
                }
            }
        }
        return keyboardFactory;
    }

    public Keyboard getKeyboard(String key) {
        Keyboard keyboard = (Keyboard) keyboardMap.get(key);
        if (keyboard != null) {
            System.out.println(key + " is exist!!");
        } else {
            keyboard = new ConcreteKeyboard(key);
            keyboardMap.put(key, keyboard);
        }
        return keyboard;
    }
}
