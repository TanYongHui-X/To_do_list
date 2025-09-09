import java.util.ArrayList;

//Acts as the controller / organiser of all your tasks.
public class TaskManager {
    private String message;
    private ArrayList<String> Task = new ArrayList<String>();


        public TaskManager(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return message;
    }

    public void createTask(String name) {
        Task task = new Task(name);
    }

    public void deleteTask() {

    }

}