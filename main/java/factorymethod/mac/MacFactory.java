package factorymethod.mac;

import factorymethod.NotebookFactory;
import factorymethod.ProduceNotebook;

public class MacFactory implements NotebookFactory {
    @Override
    public ProduceNotebook createNotebook() {
        ProduceNotebook mac = new ProduceMac();
        mac.assemble();
        mac.deliver();
        return mac;
    }
}
