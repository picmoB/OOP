import model.Auto;

public class Main {
    public static void main(String[] args) {
        // Students
        Student student01 = new Student("John", 1);
        Student student02 = new Student("Jane", 2);

        // 'setGrade' usage - setter
        student01.setGrade(3.2);
        // 'showInfo()' usage - getter
        student01.showInfo();

        System.out.println(student01.getFirstName() + " " + student01.getGrade() + " " + student01.getStudentID());
        System.out.println(student02);

        // AUTO
        Auto auto01 = new Auto("BMW", 2020, "M5");
        Auto auto02 = new Auto("Mercedes", 2026, "AMG");

        System.out.println(auto01.getAuto() + " " + auto01.getGodina() + " " + auto01.getModel());
        System.out.println(auto02.getAuto() + " " + auto02.getGodina() + " " + auto02.getModel());

        auto02.setModel("CLA");     // promjena naziva modela
        auto02.showCarInfo();
    }
}
