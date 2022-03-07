package structural.decorator;

public class MyDecoratedNotebook implements Notebook{
    @Override
    public void boot() {
        System.out.println("MyDecoratedNotebook can boot");
    }
}
