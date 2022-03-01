package creational.builder.after.builder;

import creational.builder.after.product.Notebook;

public abstract class NotebookBuilder {
    protected Notebook notebook;

    public abstract NotebookBuilder setCpu(String cpu);

    public abstract NotebookBuilder setMonitor(String monitor);

    public abstract NotebookBuilder setMemory(String memory);

    public abstract NotebookBuilder seKeyboard(String keyboard);

    public abstract NotebookBuilder setHarddisk(String harddisk);

    public abstract NotebookBuilder setMouse(String mouse);

    public abstract NotebookBuilder setHdmi(String hdmi);

    public abstract Notebook build();

}