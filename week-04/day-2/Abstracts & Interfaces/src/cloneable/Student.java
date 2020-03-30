package cloneable;

public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +
        " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  @Override
  public Student clone() throws CloneNotSupportedException {
    Student clone = (Student) super.clone();
    return clone;
  }
}
