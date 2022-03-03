package structural.bridge;

public class ClientApp {

    public static void main(String[] args){
        Color black = new Black();
        Notebook transformNotebook = new TransformNotebook();
        transformNotebook.setColor(black);
        System.out.println(transformNotebook.getName());

        Notebook gamingNotebook = new GamingNotebook();
        gamingNotebook.setColor(black);
        System.out.println(gamingNotebook.getName());
    }
}
