import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todos {
    static List<Todo> todoList = new ArrayList<>();
    static ScannerData scannerData = new ScannerData();
    public String info(){
        return "Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                "    1   List all the tasks\n" +
                "    2   Add a new task\n" +
                "    3   Remove a task\n" +
                "    4   Complete a task\n" +
                "    5   Show command line argument\n" +
                "    6   Thank you, goodbye!\n";
    }
    public void listTodos(){
        String complete;
        for (int i = 0; i < todoList.size() ; i++) {
            if (todoList.get(i).isCompleted){
                complete = " [x] ";
            } else {
                complete = " [ ] ";
            }
            System.out.println((i+1) + complete + todoList.get(i).todo);
        }
    }
    public void addTask(){
        System.out.println("Please type in a new thing Todo");
        Todo addTodo = new Todo(scannerData.getString());
        todoList.add(addTodo);
    }
    public void deleteTask(){
        System.out.println("Please give me the number of the task to remove from the list");
        int deleteTodo = scannerData.getInt();
        todoList.remove(deleteTodo-1);
    }
    public void completeTodo(){
        System.out.println("Please give me the number of the task to complete");
        int completeTodo = scannerData.getInt();
        Todo complete = todoList.get((completeTodo)- 1);
        complete.completeTodo();
        todoList.set(completeTodo-1, complete);
    }
}
