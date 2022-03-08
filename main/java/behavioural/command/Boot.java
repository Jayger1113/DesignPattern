package behavioural.command;

public class Boot implements NotebookOperation {

    private Notebook notebook;
    
    public Boot(Notebook notebook){
        this.notebook = notebook;
    }

    @Override
    public void execute() {
        notebook.boot();
    }
}