package behavioural.command;

public class Notebook {

    private String name;

    public Notebook(String name) {
        this.name = name;
    }

    public void boot() {
        System.out.println(name + " is booting");
    }

    public void reboot() {
        System.out.println(name + " is reboot");
    }

    public void shutdown() {
        System.out.println(name + " is shutdown");
    }
}