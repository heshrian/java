package todo;

public class TodoMethods {
    public static void main(String[] args) {

    }
    public static String info() {
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

//      if (inputOperator == 1) {
//        if (tasks.size() < 1) {
//            System.out.println("Please add TODOs (use number 2)");
//        }
//        for (int i = 0; i < tasks.size(); i++) {
//            System.out.println((i + 1) + " " + isComplete.get(i) + " " + tasks.get(i));
//        }
//    }
    public static void addTodo( arrayList, String todoToAdd){
        if (arrayList.size() < 1){
            System.out.println("Please add TODOs");
        }
    }
}
