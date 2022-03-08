package behavioural.state;

public class NotebookContext {
    private NotebookPowerState currentPowerState = new Balance(); //initial state

    public void setState(NotebookPowerState state) {
        this.currentPowerState = state;
    }

    public void execute() {
        currentPowerState.execute(this);
    }
}
