package todo;


import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.MediaSize;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class Todo {

        static List<String> tasks;
        static List<String> isComplete;
        public static void main(String[] args) {
            System.out.println(TodoMethods.info());
            tasks = new ArrayList<>();
            isComplete = new ArrayList<>();
//            System.out.println(usage());
            operations();
        }

//        public static String usage() {
//            return "Command Line Todo application\n" +
//                    "=============================\n" +
//                    "\n" +
//                    "Command line arguments:\n" +
//                    "    1   List all the tasks\n" +
//                    "    2   Add a new task\n" +
//                    "    3   Remove a task\n" +
//                    "    4   Complete a task\n" +
//                    "    5   Show command line argument\n" +
//                    "    6   Thank you, goodbye!\n";
//        }

        public static void operations() {
            if (tasks.size()<1){
                readEmIn();
            }

            System.out.println("Please type in the commands to tell me what to do!(5 is to list the commands)");
            Scanner scanner = new Scanner((System.in));
            int inputOperator = scanner.nextInt();
            if (inputOperator == 5) {
                System.out.println(usage());
            }
            if (inputOperator == 2) {
                System.out.println("Please type in a new thing Todo");
                Scanner task = new Scanner((System.in));
                String taskToAdd = task.nextLine();
                tasks.add(taskToAdd);
                isComplete.add("[]");

            }
            if (inputOperator == 1) {
                if (tasks.size() < 1) {
                    System.out.println("Please add TODOs (use number 2)");
                }
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + " " + isComplete.get(i) + " " + tasks.get(i));
                }
            }
            if (inputOperator == 4) {
                System.out.println("Please give me the number of the task to complete");
                Scanner todoNo = new Scanner((System.in));
                int todoNumber = todoNo.nextInt();
                isComplete.set(todoNumber - 1, "[x]");
            }
            if (inputOperator == 3) {
                System.out.println("Please give me the number of the task to remove from the list");
                Scanner remover = new Scanner((System.in));
                int removeIt = remover.nextInt();
                isComplete.remove(removeIt - 1);
                tasks.remove(removeIt - 1);
            }
            if (inputOperator != 6) {
                operations();
            } else {
                System.out.println("Bye bye");
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
                    System.out.println(e.getMessage());
                }
            }
        }
        public static void readEmIn(){
            try{
                Scanner taskLine = new Scanner(new File("tasks.txt"));
                while (taskLine.hasNext()){
                    tasks.add(taskLine.next());
                }
                taskLine.close();
                Scanner completeLine = new Scanner(new File("complete.txt"));
                while (completeLine.hasNext()){
                    isComplete.add(completeLine.next());
                }
                completeLine.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


