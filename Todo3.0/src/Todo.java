import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Todo {

    static List<String> tasks = new ArrayList<>();
    static List<String> isComplete = new ArrayList<>();
    static Operations operation = new Operations();

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

    public void listTask(){
        if (this.tasks.size() < 1){
            System.out.println("Please add TODOs");
        }
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println((i+1) + " - " + this.isComplete.get(i) + " " + this.tasks.get(i));
        }
    }
    public void addTask(){
        System.out.println("Please type in a new thing Todo");
        Scanner task = new Scanner((System.in));
        String taskToAdd = task.nextLine();
        this.tasks.add(taskToAdd);
        this.isComplete.add("[ ]");

    }
    public void deleteTask(){
        System.out.println("Please give me the number of the task to remove from the list");
        Scanner remover = new Scanner((System.in));
        int removeIt = remover.nextInt();
        this.tasks.remove(removeIt - 1);
        this.isComplete.remove(removeIt - 1);
    }
    public void completeTask(){
        System.out.println("Please give me the number of the task to complete");
        Scanner todoNo = new Scanner((System.in));
        int todoNumber = todoNo.nextInt();
        this.isComplete.set(todoNumber - 1, "[x]");
    }
    public void readTodoList(){
        try{
            Scanner taskLine = new Scanner(new File("tasks.txt"));
            while (taskLine.hasNext()){
                this.tasks.add(taskLine.nextLine());
            }
            taskLine.close();
            Scanner completeLine = new Scanner(new File("complete.txt"));
            while (completeLine.hasNext()){
                this.isComplete.add(completeLine.nextLine());
            }
            completeLine.close();
        } catch (Exception e){
            System.out.println(e);
        }
        this.info();
    }
    public void writeTodoList(){
        try {
            FileWriter writeTasks = new FileWriter("tasks.txt");
            for (String str : tasks){
                writeTasks.write(str + System.lineSeparator());
            }
            writeTasks.close();
            FileWriter writeComplete = new FileWriter("complete.txt");
            for (String str : isComplete){
                writeComplete.write(str + System.lineSeparator());
            }
            writeComplete.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void todoOperations() {
        this.operation.operations();
    }
}
