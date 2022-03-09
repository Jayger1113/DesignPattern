package behavioural.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class AndExpression implements Expression {

    private List<Expression> expressionList = new ArrayList<>();

    public void addExpression(Expression expression){
        expressionList.add(expression);
    }

    @Override
    public boolean interpret(String context) {
        AtomicReference<Boolean> result = new AtomicReference<>(true);
        expressionList.forEach(e -> result.set(result.get() && e.interpret(context)));
        return result.get();
    }
}