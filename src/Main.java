import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Welcome to To do app! *** \n");
        System.out.println("What would you like to do?\n 1. Add task\n 2. View tasks\n 3. Toggle task status\n 4. Exit\n");

        boolean exitCode = false;
        while(exitCode != false) {
            String input = scanner.next();

            }

        TaskManager manager = new TaskManager("welcome");
        //String input = manager.createTask();

        //Task taskX = new Task(input);
        //System.out.println(taskX);
    }
}



        //create the gui
        //ToDoListGUI gui = new todoListGUI();
        //String newTask = manager.createTask();
        //System.out.println(input);
        //calls the createTask method

