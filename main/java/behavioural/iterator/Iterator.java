package behavioural.iterator;

public interface Iterator {
    Object first();

    Object next();

    Object previous();

    Object last();

    boolean hasNext();
}