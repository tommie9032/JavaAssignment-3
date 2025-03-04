public class Student {
    private String name;
    private int age;
    private String gender;
    private long prn;
    private double grade;

    public Student(String name, int age, String gender, long prn, double grade) {
        setName(name); //Making Consturctor
        setPrn(prn);
        setAge(age);
        setGender(gender);
        setGrade(grade);

    }
    //Getter and Setter for each variable
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPrn(long prn) {
        this.prn = prn;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public long getPrn() {
        return prn;
    }
    public double getGrade() {
        return grade;
    }

    public void display() {//Display Method
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("prn = " + prn);
        System.out.println("grade = " + grade);
    }

}
