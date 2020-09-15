package learn.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ToDoData {
    private static int idValue = 1;
    private final List<ToDoItem> items = new ArrayList<>();

    public ToDoData() {
        addItem(new ToDoItem("title - 1", "detail - 1", LocalDate.now()));
        addItem(new ToDoItem("title - 2", "detail - 2", LocalDate.now()));
        addItem(new ToDoItem("title - 3", "detail - 3", LocalDate.now()));
        addItem(new ToDoItem("title - 4", "detail - 4", LocalDate.now()));
    }

    public List<ToDoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull ToDoItem toAdd) {
        toAdd.setId((idValue));
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id) {
        ListIterator<ToDoItem> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            ToDoItem item = itemIterator.next();
            if (item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public ToDoItem getItem(int id) {
        for (ToDoItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull ToDoItem toUpdate) {
        ListIterator<ToDoItem> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            ToDoItem item = itemIterator.next();
            if (item.equals(toUpdate)) {
                itemIterator.set(toUpdate);
                break;
            }
        }
    }

}
