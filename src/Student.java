public class Student {
    private String firstName;
    private double grade;
    private final int studentID;

    public Student(String firstName, int studentID) {   // constructor
        this.firstName = firstName;
        this.studentID = studentID;
        this.grade = 0.0;           // set to default value
    }

    // Definition of Getter
    public String getFirstName() {
        return firstName;
    }

    public double getGrade() {
        return grade;
    }

    public int getStudentID() {
        return studentID;
    }

    // Definition of Setter
    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 5.0) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0.0 and 5.0");
        }
    }

    // Print these values
    public void showInfo() {
        System.out.println("First Name: " + firstName + ", Grade: " + grade + ", StudentID: " + studentID);
    }
}
