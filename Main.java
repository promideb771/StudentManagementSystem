import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Total Students");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    manager.addStudent(new Student(id, name));

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    Student student = manager.searchStudent(searchId);

                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();

                    if (manager.deleteStudent(deleteId)) {
                        System.out.println("Student Deleted!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Total Students: "
                            + manager.getTotalStudents());
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
