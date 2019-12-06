package todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo {

    static List<String> tasks;
    static List<String> isComplete;

    public static void main(String[] args) {
        tasks = new ArrayList<>();
        isComplete = new ArrayList<>();
        System.out.println(usage());
        operations();
    }



    public static String usage(){
        return "Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                "    1   Lists all the tasks\n" +
                "    2   Adds a new task\n" +
                "    3   Removes an task\n" +
                "    4   Completes an task\n" +
                "    5   Show command line arguments";
    }

    public static void operations(){



        Scanner scanner = new Scanner((System.in));
        int inputOperator = scanner.nextInt();
        if (inputOperator==5) {
            System.out.println(usage());
        }
        if (inputOperator==2){
            System.out.println("Please type in the Todo");
            Scanner task = new Scanner((System.in));
            String taskToAdd = task.nextLine();
            System.out.println(taskToAdd);
            tasks.add(taskToAdd);

        }
        if (inputOperator==1){
            System.out.println(tasks.size());
            for (int i = 0; i < tasks.size() ; i++) {
                System.out.println(tasks.get(i));
            }
        }
        operations();
    }
}


