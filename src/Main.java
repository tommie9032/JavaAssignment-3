//Name : Tom Thomas
//PRN : 23070126136
//Batch : AIML B3
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations op = new StudentOperations();

        while(true) {
            System.out.println("---------------------------------------------");
            System.out.println("\nMENU\n");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Search Student");
            System.out.println("4. Edit Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("Please enter your choice");

            int choice = scan.nextInt();
            System.out.println("----------------------------------------------");
            switch(choice) {
                case 1://Adding new Student
                    scan.nextLine();
                    System.out.println("Enter Student Name :");
                    String name = scan.nextLine();

                    System.out.println("Enter Student Age :");
                    int age = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter Student Gender :");
                    String gender = scan.nextLine();
                    System.out.println("Enter Student PRN :");
                    long prn = Long.parseLong(scan.nextLine());

                    System.out.println("Enter Student Grade :");
                    double grade = Double.parseDouble(scan.nextLine());





                    Student student = new Student(name,age,gender,prn,grade);
                    op.addStudent(student);
                    break;
                case 2://Displaying Student Details
                    System.out.println("\nAll Student Details :\n");
                    op.displayStudents();
                    break;

                case 3:
                    op.searchStudent();
                    break;

                case 4:
                    op.editStudent();
                    break;
                case 5:
                    op.deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you for using this program!!");
                    scan.close();
                    return;

                default:
                    System.out.println("Please enter a valid choice");


            }
        }
    }
}