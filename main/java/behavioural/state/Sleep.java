package behavioural.state;

public class Sleep implements NotebookPowerState {
    @Override
    public void execute(NotebookContext notebookContext) {
        System.out.println("notebook is sleeping , execute power saving mode");
    }
}
