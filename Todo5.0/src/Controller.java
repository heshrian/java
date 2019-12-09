import java.util.Scanner;

public class Controller {
    static Todos todos;
    static ScannerData scannerData= new ScannerData();
    public Controller(Todos todos){
        this.todos = todos;
    }
    public void operations(){
        System.out.println("Please type in the commands to tell me what to do!(5 is to list the commands)");
        int inputOperator = todos.scannerData.getInt();

        switch (inputOperator) {
            case 1:
                this.todos.listTodos();
                this.operations();
                break;
            case 2:
                this.todos.addTask();
                this.operations();
                break;
            case 3:
                this.todos.deleteTask();
                this.operations();
                break;
            case 4:
                this.todos.completeTodo();
                this.operations();
                break;
            case 5:
                System.out.println(this.todos.info());
                this.operations();
                break;
            case 6:
                System.out.println("Bye bye");
//                this.todos.writeTodoList();
        }
    }

}
