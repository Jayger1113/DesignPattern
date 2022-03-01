package factorymethod.window;

import factorymethod.NotebookFactory;
import factorymethod.ProduceNotebook;

public class WindowFactory implements NotebookFactory {
    @Override
    public ProduceNotebook createNotebook() {
        ProduceNotebook window = new ProduceWindow();
        window.assemble();
        window.deliver();
        return window;
    }
}
