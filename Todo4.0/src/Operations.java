import java.util.Scanner;

public class Operations {
    TodoList todos;
    public Operations(TodoList todos){
        this.todos = todos;
    }

    public void operations(){
        if (this.todos.tasks.size()< 1){
            this.todos.readTodoList();
        }
        System.out.println("Please type in the commands to tell me what to do!(5 is to list the commands)");
        Scanner scanner = new Scanner((System.in));
        int inputOperator = scanner.nextInt();

        switch (inputOperator) {
            case 1:
                this.todos.listTask();
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
                this.todos.completeTask();
                this.operations();
                break;
            case 5:
                System.out.println(this.todos.info());
                this.operations();
                break;
            case 6:
                System.out.println("Bye bye");
                this.todos.writeTodoList();
        }
    }
}