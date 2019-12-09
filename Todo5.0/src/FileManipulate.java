import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManipulate {
    Todos todos;
    public FileManipulate(Todos todos){
    this.todos = todos;
    }
//    public void readFile(){
//        try{
//            Scanner taskLine = new Scanner(new File("tasks.txt"));
//            while (taskLine.hasNext()){
//                todoList.add(taskLine.nextLine());
//            }
//            taskLine.close();
//        } catch (Exception e){
//            System.out.println(e);
//        }
//    }
    public void writeFile(){
        try{
            FileWriter writeTodo = new FileWriter("tasks.txt");
            String completed;
            String todoStr;
            for (Todo todo : Todos.todoList){
                if (todo.isCompleted){
                    completed = " :/| COMPL";
                } else {
                    completed = " :/| NOTCOMPL";
                }
                todoStr =""+ todo.todo + completed;
                writeTodo.write(todoStr  + System.lineSeparator());
            }
            writeTodo.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
//    public void readFile(){
//        try{
//            Scanner taskLine = new Scanner(new File("tasks.txt"));
//            while (taskLine.hasNext()){
//                List<String> todoToWrite= new ArrayList<>();
//                todoToWrite = taskLine.nextLine().split(":/|");
//                System.out.println((todoToWrite[0]));
//                System.out.println(todoToWrite[1]);
//                System.out.println(todoToWrite[4]);
//                String todoBackInArrayList = todoToWrite[0];
//                Boolean isComplete;
//                if (taskLine.nextLine().endsWith("NOTCOMPL")){
//                    isComplete = false;
//                } else {
//                    isComplete = true;
//                }
//                Todo todo = new Todo(todoBackInArrayList, isComplete);
//                todos.todoList.add(todo);
//            }
//            taskLine.close();
//        } catch (Exception e){
//            System.out.println(e);
//        }
//        this.info();
    }

}
