package greenfoxorganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> students;
  private List<Mentor> mentors;

  public Cohort(String name) {
    students = new ArrayList<>();
    mentors = new ArrayList<>();
    this.name = name;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() +
        " students and " + mentors.size() + " mentors.");
  }
}


