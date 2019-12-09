public class Main {
    public static void main(String[] args) {
        TodoList myTodoList = new TodoList();
        Operations operation = new Operations(myTodoList);
        operation.operations();
    }
}
