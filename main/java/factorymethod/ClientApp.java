package factorymethod;

import factorymethod.mac.MacFactory;
import factorymethod.window.WindowFactory;

public class ClientApp {

    public static void main(String[] args){
        new WindowFactory().createNotebook();
        new MacFactory().createNotebook();
    }
}
