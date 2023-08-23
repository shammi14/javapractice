import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class Main {



 public static void main(String[] args){

  List<Teacher>  teachers = new ArrayList<>();
  Teacher teacher1 = new Teacher();
  Teacher teacher2 = new Teacher();
  teachers.add(teacher1);
  teachers.add(teacher2);


  List<Student> students = new ArrayList<>();
  Student satvik = new Student();
  Student ashvik = new Student();
  students.add(satvik);
  students.add(ashvik);

  Library library1 = new Library();

  School satviksSchool = new School(teachers,students,library1);
  int numTeachers = satviksSchool.getNumberOfTeachers();
  System.out.println(numTeachers);
 }
}
