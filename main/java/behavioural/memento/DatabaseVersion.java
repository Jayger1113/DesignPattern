package behavioural.memento;

public class DatabaseVersion {
    private String version;

    public void set(String version) {
        System.out.println("Setting version to " + version);
        this.version = version;
    }

    public Memento saveToMemento() {
        System.out.println("Saving version to Memento");
        return new Memento(version);
    }

    public void restoreFromMemento(Memento memento) {
        version = memento.getSavedVersion();
        System.out.println("Version restored from Memento: " + version);
    }

    public static class Memento {
        private final String version;

        public Memento(String versionToSave) {
            version = versionToSave;
        }

        public String getSavedVersion() {
            return version;
        }
    }
}