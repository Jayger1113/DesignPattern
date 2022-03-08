package behavioural.command;

public class Shutdown implements NotebookOperation {

    private Notebook notebook;

    public Shutdown(Notebook notebook) {
        this.notebook = notebook;
    }

    @Override
    public void execute() {
        notebook.shutdown();
    }
}