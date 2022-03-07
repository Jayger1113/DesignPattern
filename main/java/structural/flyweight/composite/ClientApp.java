package structural.flyweight.composite;

import java.util.ArrayList;
import java.util.List;

public class ClientApp {
    public static void main(String[] args) {
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        List<String> keyList = new ArrayList<>();
        keyList.add("enter");
        keyList.add("esc");
        keyList.add("shift");
        Keyboard keyboard1 = keyboardFactory.getKeyboard(keyList);
        keyboard1.type("This is my keyboard");

        Keyboard keyboard2 = keyboardFactory.getKeyboard(keyList);
        // 不相等，複合享元模式的物件不可共享
        System.out.println(keyboard1 == keyboard2);
    }
}
