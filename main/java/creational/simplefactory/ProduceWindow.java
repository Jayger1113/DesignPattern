package creational.simplefactory;

public class ProduceWindow implements ProduceNotebook {
    @Override
    public void assemble() {
        System.out.println("assemble window notebook");
    }

    @Override
    public void deliver() {
        System.out.println("deliver window notebook");
    }
}
