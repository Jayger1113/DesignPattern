package behavioural.interpreter;

public class ClientApp {

    public static Expression getMaleExpression() {
        OrExpression orExpression = new OrExpression();
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        orExpression.addExpression(robert);
        orExpression.addExpression(john);
        return orExpression;
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression() {
        AndExpression andExpression = new AndExpression();
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        andExpression.addExpression(julie);
        andExpression.addExpression(married);
        return andExpression;
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        String context = "John";
        System.out.println("is context male ? " + isMale.interpret(context));

        System.out.println("is context married women ? " + isMarriedWoman.interpret(context));
        context = "Married Julie";
        System.out.println("is context married women ? " + isMarriedWoman.interpret(context));
    }
}
