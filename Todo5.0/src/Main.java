import java.io.IOException;

public class Main {
        public static void main(String[] args) {
            Todos myTodoList = new Todos();
            Controller menu = new Controller(myTodoList);
            try {
                menu.operations();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
