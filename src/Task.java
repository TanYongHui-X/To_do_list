public class Task {
    private boolean isDone;

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

    private String name;




    public String toString() {

        if (this.isDone) {
            return "[✔]" + "~" + name + "~";
        } else {
            return "[◯]" + name;
        }
    }
}
