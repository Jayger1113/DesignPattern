package behavioural.state;

public class Balance implements NotebookPowerState {
    @Override
    public void execute(NotebookContext notebookContext) {
        System.out.println("notebook is balance mode , execute balance mode");
    }
}
