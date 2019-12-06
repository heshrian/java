package todo;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoMethods {
    public static void main(String[] args) {
    }

    public static String info() {
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

    public static void listTodos(ArrayList<String> todoList,ArrayList<String> completeList){
        if (todoList.size() < 1){
            System.out.println("Please add TODOs");
        }
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i+1) + " - " + completeList.get(i) + " " + todoList.get(i));
        }
    }

    public static void addTodo(ArrayList<String> todoList, ArrayList<String> completeList) {
        System.out.println("Please type in a new thing Todo");
        Scanner task = new Scanner((System.in));
        String taskToAdd = task.nextLine();
        todoList.add(taskToAdd);
        completeList.add("[ ]");
    }

    public static void deleteTodo(ArrayList<String> todoList, ArrayList<String> completeList) {
        System.out.println("Please give me the number of the task to remove from the list");
        Scanner remover = new Scanner((System.in));
        int removeIt = remover.nextInt();
        completeList.remove(removeIt - 1);
        todoList.remove(removeIt - 1);
    }

    public static void completeTodo(ArrayList<String> completeList){
        System.out.println("Please give me the number of the task to complete");
        Scanner todoNo = new Scanner((System.in));
        int todoNumber = todoNo.nextInt();
        completeList.set(todoNumber - 1, "[x]");
    }
    
    public static void readEmIn(ArrayList<String> todoList,ArrayList<String> completeList){
        try{
            Scanner taskLine = new Scanner(new File("tasks.txt"));
            while (taskLine.hasNext()){
                todoList.add(taskLine.nextLine());
            }
            taskLine.close();
            Scanner completeLine = new Scanner(new File("complete.txt"));
            while (completeLine.hasNext()){
                completeList.add(completeLine.nextLine());
            }
            completeLine.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeThemIn(ArrayList<String> todoList,ArrayList<String> completeList) {
        try {
            FileWriter writeTasks = new FileWriter("tasks.txt");
            for (String str : todoList){
                writeTasks.write(str + System.lineSeparator());
            }
            writeTasks.close();
            FileWriter writeComplete = new FileWriter("complete.txt");
            for (String str : completeList){
                writeComplete.write(str + System.lineSeparator());
            }
            writeComplete.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
