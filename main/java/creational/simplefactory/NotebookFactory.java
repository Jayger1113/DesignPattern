package creational.simplefactory;

public class NotebookFactory {

    public ProduceNotebook createNoteBook(String notebookType)  {
        ProduceNotebook produceNotebook = null;
        switch (notebookType){
            case "mac" -> produceNotebook = new ProduceMac();
            case "window"-> produceNotebook = new ProduceWindow();
        }
        return produceNotebook;
    }
}
