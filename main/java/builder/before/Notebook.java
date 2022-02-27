package builder.before;

public class Notebook {
    private String cpu;
    private String monitor;
    private String memory;
    private String keyboard;
    private String harddisk;

    private String mouse;//新增
    private String hdmi;//新增


    public Notebook(String cpu, String monitor, String memory, String keyboard, String harddisk) {
        this.cpu = cpu;
        this.monitor = monitor;
        this.memory = memory;
        this.keyboard = keyboard;
        this.harddisk = harddisk;
    }

    public Notebook(String cpu, String monitor, String memory, String keyboard, String harddisk, String hdmi) {
        this.cpu = cpu;
        this.monitor = monitor;
        this.memory = memory;
        this.keyboard = keyboard;
        this.harddisk = harddisk;
        this.hdmi = hdmi;
    }

    public Notebook(String cpu, String monitor, String memory, String keyboard, String harddisk, String mouse, String hdmi) {
        this.cpu = cpu;
        this.monitor = monitor;
        this.memory = memory;
        this.keyboard = keyboard;
        this.harddisk = harddisk;
        this.mouse = mouse;
        this.hdmi = hdmi;
    }
}
