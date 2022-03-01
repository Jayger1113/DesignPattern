package creational.factorymethod;

public class MacFactory implements NotebookFactory {
    @Override
    public ProduceNotebook createNotebook() {
        ProduceNotebook mac = new ProduceMac();
        mac.assemble();
        mac.deliver();
        return mac;
    }
}
