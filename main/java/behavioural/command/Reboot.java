package behavioural.command;

public class Reboot implements NotebookOperation {

    private Notebook notebook;

    public Reboot(Notebook notebook){
        this.notebook = notebook;
    }

    @Override
    public void execute() {
        notebook.reboot();
    }
}