import java.io.File;
import java.io.FileWriter;
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
                    completed = "COMPL";
                } else {
                    completed = "NOTCOMPL";
                }
                todoStr =""+ todo.todo;
                System.out.println(todoStr);
                System.out.println(completed);
//                System.out.println(todoStr instanceof String);
                writeTodo.write(todoStr + completed + System.lineSeparator());
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
