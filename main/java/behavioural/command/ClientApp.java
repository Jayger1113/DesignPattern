package behavioural.command;

public class ClientApp {

    public static void main(String[] args){
        NotebookOperationExecutor notebookOperationExecutor = new NotebookOperationExecutor();
        Notebook notebook = new Notebook("myNotebook");
        notebookOperationExecutor.executeOperation(new Boot(notebook));
        notebookOperationExecutor.executeOperation(new Reboot(notebook));
        notebookOperationExecutor.executeOperation(new Shutdown(notebook));
    }
}
