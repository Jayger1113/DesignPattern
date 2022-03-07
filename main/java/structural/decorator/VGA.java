package structural.decorator;

public class VGA extends DisplayAdapter {
    public VGA(Notebook notebook) {
        super(notebook);
    }

    @Override
    public void boot() {
        notebook.boot();
        display();
    }

    public void display() {
        System.out.println(VGA.class.getSimpleName() + " display");
    }
}
