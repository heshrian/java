import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todos {
    static List<Todo> todoList = new ArrayList<>();
    static ScannerData scannerData = new ScannerData();

    public void listTodos(){
        for (int i = 0; i < todoList.size() ; i++) {
            String line = ""+ (i+1) + todoList.get(i); // == (i+1) + todoList.get(i).toString(); ezt igy magamnak
            System.out.println(line);
        }
    }
    public void addTask(){
        Todo addTodo = new Todo(scannerData.getString());
        todoList.add(addTodo);
    }
    public void deleteTask(){
        int deleteTodo = scannerData.getInt();
        todoList.remove(deleteTodo-1);
    }
    public void completeTodo(){
        int completeTodo = scannerData.getInt();
        Todo complete = todoList.get((completeTodo)- 1);
        complete.completeTodo();
    }
}
