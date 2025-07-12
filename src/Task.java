public class Task {
    private boolean isDone;
    private String name;

    public void markasDone() {
        this.isDone = true;
    }

    public void togglestatus() {
         this.isDone = !this.isDone;
    }
    //“When someone gives me a name, I’ll store it in the name variable.”
    public Task(String taskName) {
        this.name = taskName;
    }

    public String toString() {

        if (this.isDone) {
            return "[DONE]" + "~" + name + "~";
        } else {
            return "[NOT DONE]" + name;
        }
    }
}
