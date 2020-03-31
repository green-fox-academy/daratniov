package printable;

public class Todo implements Printable {
  private String task;
  private Priority priority;
  private boolean isItDone;

  public Todo(String task, Priority priority, boolean isItDone) {
    this.task = task;
    this.priority = priority;
    this.isItDone = isItDone;
  }

  @Override
  public void printAllFields() {
    System.out.println("Task: " + task + " | Priority: " + priority + " | Done: " + isItDone);
  }
}
