package structural.bridge;

//Abstraction類別，並將Color合成進來
public abstract class Notebook {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
