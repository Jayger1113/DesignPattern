package structural.decorator;

public class DisplayAdapter implements Notebook{
    protected Notebook notebook;

    public DisplayAdapter(Notebook notebook){
        this.notebook = notebook;
    }

    @Override
    public void boot() {
        notebook.boot();
    }
}
