package behavioural.state;

public class Performance implements NotebookPowerState {
    @Override
    public void execute(NotebookContext notebookContext) {
        System.out.println("notebook is performance mode , execute performance mode");
    }
}
