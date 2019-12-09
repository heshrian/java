import java.util.Scanner;

public class Operations extends TodoList {

    public void operations(){
        if (tasks.size()< 1){
            this.readTodoList();
        }
        System.out.println("Please type in the commands to tell me what to do!(5 is to list the commands)");
        Scanner scanner = new Scanner((System.in));
        int inputOperator = scanner.nextInt();

        switch (inputOperator) {
            case 1:
                this.listTask();
                this.operations();
                break;
            case 2:
                this.addTask();
                this.operations();
                break;
            case 3:
                this.deleteTask();
                this.operations();
                break;
            case 4:
                this.completeTask();
                this.operations();
                break;
            case 5:
                System.out.println(this.info());
                this.operations();
                break;
            case 6:
                System.out.println("Bye bye");
                this.writeTodoList();
                return;
        }
    }
}