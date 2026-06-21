import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        Student student = searchStudent(id);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }

    public int getTotalStudents() {
        return students.size();
    }
}
