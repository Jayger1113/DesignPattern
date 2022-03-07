package structural.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

//複合實體享元角色
class CompositeConcreteKeyboard implements Keyboard {
    private Map<String, Keyboard> keyboardMap = new HashMap<>();

    @Override
    public void type(String msg) {
        for (Map.Entry<String, Keyboard> entry : keyboardMap.entrySet()) {
            entry.getValue().type(msg);
        }
    }

    public void add(String key, Keyboard keyboard) {
        keyboardMap.put(key, keyboard);
    }

    public void remove(String key) {
        keyboardMap.remove(key);
    }
}