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

    public void createTask() {
        String input = scanner.nextLine();
        System.out.println(input);

    }

    public void deleteTask() {

    }

}