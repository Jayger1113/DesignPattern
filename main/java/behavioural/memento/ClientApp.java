package behavioural.memento;

import behavioural.memento.DatabaseVersion.Memento;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientApp {
    public static void main(String[] args) {
        List<Memento> savedTimes = new ArrayList<Memento>();

        DatabaseVersion databaseVersion = new DatabaseVersion();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = simpleDateFormat.format(new Date());
        int index = 1;
        String split = "_";
        databaseVersion.set(currentDate + split + Integer.toString(index++));
        savedTimes.add(databaseVersion.saveToMemento());
        databaseVersion.set(currentDate + split + Integer.toString(index++));
        savedTimes.add(databaseVersion.saveToMemento());
        databaseVersion.set(currentDate + split + Integer.toString(index++));
        savedTimes.add(databaseVersion.saveToMemento());
        databaseVersion.set(currentDate + split + Integer.toString(index++));

        databaseVersion.restoreFromMemento(savedTimes.get(2));
    }
}
