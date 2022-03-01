package simplefactory;

public class ClientApp {


    public static void main(String[] args){
        NotebookFactory notebookFactory = new NotebookFactory();
        ProduceNotebook mac = notebookFactory.createNoteBook("mac");
        mac.assemble();
        mac.deliver();
        ProduceNotebook window = notebookFactory.createNoteBook("window");
        window.assemble();
        window.deliver();
    }
}
