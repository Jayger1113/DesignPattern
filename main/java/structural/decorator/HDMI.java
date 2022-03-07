package structural.decorator;

public class HDMI extends DisplayAdapter{
    public HDMI(Notebook notebook) {
        super(notebook);
    }

    @Override
    public void boot() {
        notebook.boot();
        display();
    }

    public void display(){
        System.out.println(HDMI.class.getSimpleName() + " display");
    }
}
