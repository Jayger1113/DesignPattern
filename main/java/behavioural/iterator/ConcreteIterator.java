package behavioural.iterator;

import java.util.List;

class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    public Object next() {
        Object obj = null;
        if (hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    public Object previous() {
        Object obj = null;
        if (hasNext()) {
            obj = list.get(--index);
        }
        return obj;
    }

    public Object last() {
        index = list.size() - 1;
        Object obj = list.get(index);
        return obj;
    }
}