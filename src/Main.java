
public class Main {
    public static void main(String[] args) {
        //create the gui
        //ToDoListGUI gui = new todoListGUI();
        TaskManager manager = new TaskManager("Welcome to my app!");
        System.out.println(manager);
        //calls the createtask method
        manager.createTask();

        Task taskX = new Task("Buy groceries");
    }
}