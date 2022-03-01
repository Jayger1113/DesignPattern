package creational.factorymethod;

public class ClientApp {

    public static void main(String[] args){
        new WindowFactory().createNotebook();
        new MacFactory().createNotebook();
    }
}
