package creational.builder.after.builder;

import creational.builder.after.product.Notebook;

public class NotebookFactory extends NotebookBuilder{

    private String cpu;
    private String monitor;
    private String memory;
    private String keyboard;
    private String harddisk;
    private String mouse;
    private String hdmi;

    @Override
    public NotebookBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public NotebookBuilder setMonitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    @Override
    public NotebookBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public NotebookBuilder seKeyboard(String keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    @Override
    public NotebookBuilder setHarddisk(String harddisk) {
        this.harddisk = harddisk;
        return this;
    }

    @Override
    public NotebookBuilder setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    @Override
    public NotebookBuilder setHdmi(String hdmi) {
        this.hdmi = hdmi;
        return this;
    }

    @Override
    public Notebook build() {
        return new Notebook(cpu,  monitor, memory,  keyboard,  harddisk,  mouse,  hdmi);
    }
}
