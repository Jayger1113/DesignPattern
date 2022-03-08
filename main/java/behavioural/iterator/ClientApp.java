package behavioural.iterator;


public class ClientApp {

    public static void main(String[] args){
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("USA");
        aggregate.add("TAIWAN");
        aggregate.add("CHINA");
        aggregate.add("UKRAINE");
        System.out.println("Dump:");
        Iterator iterator = aggregate.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
