package structural.bridge;

//RefinedAbstraction繼承Abstraction，並實作其中的getName
public class TransformNotebook extends Notebook{

    @Override
    public String getName() {
        return color.getColor() + " , " + TransformNotebook.class.getSimpleName();
    }
}
