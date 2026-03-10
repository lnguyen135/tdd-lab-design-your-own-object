package object.example.lannguyen;



public class Nguyen {

    private String firstName;
    private String lastName;
    private int age;
    private int grade;
    private String major;

    // Constructor
    public Nguyen(String firstName, String lastName, int age, int grade, String major) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.major = major;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }

    // Setters
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grade = grade;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Custom method
    public boolean isPass() {
        return grade > 60;
    }

    // toString override
    @Override
    public String toString() {
        return "Nguyen{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }
}