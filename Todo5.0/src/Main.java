    public class Main {
        public static void main(String[] args) {
            Todos myTodoList = new Todos();
            Controller operation = new Controller(myTodoList);
            operation.operations();
        }
    }
