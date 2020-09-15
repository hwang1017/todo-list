package learn.service;

import learn.model.ToDoData;
import learn.model.ToDoItem;

public interface ToDoItemService {
    void addItem(ToDoItem toAdd);
    void removeItem(int id);
    ToDoItem getItem(int id);
    void updateItem(ToDoItem toUpdate);
    ToDoData getData();
}
