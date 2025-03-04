import java.util.*
public class StudentOperations {
    ArrayList<Student> students;

    public StudentOperations() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added Student : " + student);
    }

    public void displayStudents() {
        for (Student student : students) {
            student.display();
            System.out.println("\n");
        }
    }

    public void searchStudent() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Search by : \n1) Name \n2)PRN");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Name : ");
                String name = scan.next();
                searchByName(name);
                break;


            case 2:
                System.out.println("Enter prn : ");
                long prn = Long.praseLong(scan.nextLine());
                searchByPrn(prn);
                break;
        }

        public void searchByName(String name){//Searching for Student by Name
            for (Student student : students) {
                if(student.getName().equalsIgnoreCase(name)){
                    System.out.println("Student Found!!!\n");
                    System.out.println("\n");
                    student.display();
                    System.out.println("\n");
                    return;
                }
            }
            System.out.println("Student "+name+" Not Found!!!\n");
        }

        public void searchByPrn(long prn){//Searching for Student by PRN
            for (Student student : students) {
                if(student.getPrn() == prn){
                    System.out.println("Student Found!!!\n");
                    System.out.println("\n");
                    student.display();
                    System.out.println("\n");
                    return;
                }
            }
            System.out.println("Student "+prn+" Not Found!!!\n");
        }


        public void deleteStudent(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter prn : ");
            long prn = Long.parseLong(scan.nextLine());

            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.getPrn() == prn) {
                    iterator.remove();
                    System.out.println("Student Deleted !!!\n");
                    System.out.println("\n");
                    return;
                }
            }
            System.out.println("Student "+prn+" Not Found!!!\n");
        }

        public void editStudent(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter prn : ");
            long prn = Long.parseLong(scan.nextLine());

            for (Student student : students) {
                if (student.getPrn() == prn) {

                    System.out.println("Enter New Student Details!\n");

                    System.out.println("Enter New Name : \n");
                    student.setName(scan.nextLine());
                    System.out.println("Enter New Prn : \n");
                    student.setPrn(Long.parseLong(scan.nextLine()));
                    System.out.println("Enter New Grade : \n");
                    student.setGrade(Long.parseLong(scan.nextLine()));

                    System.out.println("Student Edited !!!\n");
                    System.out.println("\n");
                    return;
                }
            }
            System.out.println("Student "+prn+" Not Found!!!\n");
        }



    }






}
