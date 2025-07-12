import java.util.Scanner;

public class TaskManager {
    private String message;
    Scanner scanner = new Scanner(System.in);

        public TaskManager(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return message;
    }

    public String createTask() {
        String input = scanner.nextLine();
        return input;
    }

    public void deleteTask() {

    }

}