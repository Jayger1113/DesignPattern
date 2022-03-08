package behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class NotebookOperationExecutor {

    private final List<NotebookOperation> notebookOperationList = new ArrayList<>();

    public void executeOperation(NotebookOperation notebookOperation) {
        notebookOperationList.add(notebookOperation);
        notebookOperation.execute();
    }
}