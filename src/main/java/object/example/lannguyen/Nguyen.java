package object.example.lannguyen;

public class Nguyen {
    String firstName;
    String lastName;
    int age;
    int grade;
    String major;

    public Nguyen(String firstName, String lastName, int age, int grade, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Nguyen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public boolean isPass() {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        return grade > 60;
    }


    public static void main(String[] args) {
        Nguyen ng1 = new Nguyen("Helen", "Tran", 24, 90, "Computer Science");
        Nguyen ng2 = new Nguyen("AnhDao", "Mai", 34, 95, "PreMed");
        System.out.println(ng1.toString());
        System.out.println(ng1.isPass());
        System.out.println(ng2.toString());
        System.out.println(ng2.isPass());
    }
}