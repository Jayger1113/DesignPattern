package creational.factorymethod;

public class WindowFactory implements NotebookFactory {
    @Override
    public ProduceNotebook createNotebook() {
        ProduceNotebook window = new ProduceWindow();
        window.assemble();
        window.deliver();
        return window;
    }
}
