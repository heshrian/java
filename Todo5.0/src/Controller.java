import java.io.IOException;
import java.util.Scanner;

public class Controller {
    Todos todos;
    ScannerData scannerData= new ScannerData();
    FileManipulate fileIO = new FileManipulate(todos);
    public Controller(Todos todos){
        this.todos = todos;
    }

    public void operations() throws IOException {
        System.out.println("Please type in the commands to tell me what to do!(5 is to list the commands)");
        int inputOperator = scannerData.getInt();

        switch (inputOperator) {
            case 1:
//                fileIO.readFile();
                this.todos.listTodos();
                this.operations();
                break;
            case 2:
                System.out.println("Please type in a new thing Todo");
                todos.addTask();
                this.operations();
                break;
            case 3:
                System.out.println("Please give me the number of the task to remove from the list");
                this.todos.deleteTask();
                this.operations();
                break;
            case 4:
                System.out.println("Please give me the number of the task to complete");
                this.todos.completeTodo();
                this.operations();
                break;
            case 5:
                System.out.println(this.info());
                this.operations();
                break;
            case 6:
                System.out.println("Bye bye");
                fileIO.writeFile();
        }
    }

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
}
