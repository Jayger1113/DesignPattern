package creational.builder.after.builder;

import creational.builder.after.product.Notebook;

class NotebookStore {

    private NotebookBuilder notebookBuilder;

    NotebookStore(NotebookBuilder notebookBuilder) {

        this.notebookBuilder = notebookBuilder;
    }

    public Notebook i5NoteBook() {
        Notebook notebook = notebookBuilder
                .setCpu("i5")
                .setHdmi("hdmi")
                .setHarddisk("500G")
                .setMouse("mouse")
                .build();
        return notebook;
    }

    public Notebook i7NoteBook() {
        Notebook notebook = notebookBuilder
                .setCpu("i7")
                .setHdmi("hdmi")
                .setHarddisk("1024G")
                .setMouse("mouse")
                .build();
        return notebook;
    }

}