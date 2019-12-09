package todo;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Todo {

        static List<String> tasks;
        static List<String> isComplete;
        public static void main(String[] args) {
//            TodoMethods info = new TodoMethods(); // kulon class es stb
            System.out.println(TodoMethods.info());
            tasks = new ArrayList<>();
            isComplete = new ArrayList<>();
            operations();
        }

        public static void operations() {
            if (tasks.size()<1){
                TodoMethods.readEmIn((ArrayList<String>) tasks,(ArrayList<String>) isComplete);
            }
            System.out.println("Please type in the commands to tell me what to do!(5 is to list the commands)");
            Scanner scanner = new Scanner((System.in));
            int inputOperator = scanner.nextInt();

            switch (inputOperator) {
                case 1:
                    TodoMethods.listTodos((ArrayList<String>) tasks,(ArrayList<String>) isComplete);
                    operations();
                    break;
                case 2:
                    TodoMethods.addTodo((ArrayList<String>) tasks,(ArrayList<String>) isComplete);
                    operations();
                    break;
                case 3:
                    TodoMethods.deleteTodo((ArrayList<String>) tasks,(ArrayList<String>) isComplete);
                    operations();
                    break;
                case 4:
                    TodoMethods.completeTodo((ArrayList<String>) isComplete);
                    operations();
                    break;
                case 5:
                    System.out.println(TodoMethods.info());
                    operations();
                    break;
                case 6:
                    System.out.println("Bye bye");
                    TodoMethods.writeThemIn((ArrayList<String>) tasks,(ArrayList<String>) isComplete);
                    return;
            }
        }
    }




