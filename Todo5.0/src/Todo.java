public class Todo {
    public String todo;
    public Boolean isCompleted;

    public Todo(String todo, Boolean isCompleted){
        this.todo= todo;
        this.isCompleted = isCompleted;
    }
    public void completeTodo(){
        this.isCompleted = true;
    }
    public String toString(){
        String complete;
        if (this.isCompleted){
            complete = " [x] ";
        } else {
            complete = " [ ] ";
        }
        return complete + this.todo;
    }
}
