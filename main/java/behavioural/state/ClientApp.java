package behavioural.state;

public class ClientApp {
    public static void main(String[] args) {
        NotebookContext notebookContext = new NotebookContext();
        notebookContext.execute();

        notebookContext.setState(new Sleep());
        notebookContext.execute();

        notebookContext.setState(new Performance());
        notebookContext.execute();
    }
}
