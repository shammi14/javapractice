import java.util.ArrayList;
import java.util.List;

public class School {
    List<Teacher> teachers;
   List<Student> students;

    Library library;

    public School(List<Teacher> teachersRec, List<Student> studentsRec, Library libraryRec){
        teachers = teachersRec;
        students = studentsRec;
        library = libraryRec;
    }


   public int getNumberOfTeachers(){
        return teachers.size();

    }




}




