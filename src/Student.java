public class Student {
    private String name;
    private int age;
    private String UID;
    private double gpa;

    public Student(String nameOfStudent, int ageOfStudent, String UIDofStudent, double gpaofStudent){
        this.name = nameOfStudent;
        this.age = ageOfStudent;
        this.UID = UIDofStudent;
        this.gpa = gpaofStudent;
    }

    public Student(){
        this.name = "Student";
        this.age = 18;
        this.UID = "U0000000";
        this.gpa = 0.0;

    }

    public static void main(String[] args) {
        Student defaultStudent = new Student();
        System.out.println(defaultStudent.name);

        Student bibekObject = new Student("Bibek", 100, "U010876567",4.0);
        System.out.println(bibekObject.name);
    }

}
