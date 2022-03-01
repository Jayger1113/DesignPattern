package simplefactory;

public class ProduceMac implements ProduceNotebook {
    @Override
    public void assemble() {
        System.out.println("assemble mac notebook");
    }

    @Override
    public void deliver() {
        System.out.println("deliver mac notebook");
    }
}
