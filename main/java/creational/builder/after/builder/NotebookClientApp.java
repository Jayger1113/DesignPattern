package creational.builder.after.builder;

public class NotebookClientApp {

    public static  void main(String[] args){
        NotebookFactory notebookFactory = new NotebookFactory();
        NotebookStore notebookStore = new NotebookStore(notebookFactory);
        System.out.println(notebookStore.i5NoteBook().toString());
        System.out.println(notebookStore.i7NoteBook().toString());
    }

}
