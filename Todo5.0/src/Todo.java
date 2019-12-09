public class Todo {
    public String todo;
    public Boolean isCompleted = false;

    public Todo(String todo){
        this.todo= todo;
    }
    public void completeTodo(){
        this.isCompleted = true;
    }
}
