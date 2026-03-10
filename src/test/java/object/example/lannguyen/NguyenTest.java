package object.example.lannguyen;


import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;

public class NguyenTest {

    @Test
    void constructorHappyPath() {
        // Arrange
        String firstName = "Helen";
        String lastName = "Tran";

        // Act
        Nguyen student = new Nguyen(firstName, lastName, 24, 90, "Computer Science");

        // Assert
        assertEquals("Helen", student.getFirstName());
        assertEquals("Tran", student.getLastName());
        assertEquals(24, student.getAge());
        assertEquals(90, student.getGrade());
        assertEquals("Computer Science", student.getMajor());
    }
    @Test
    void testToString() {

        // Arrange
        Nguyen student = new Nguyen("Helen", "Tran", 24, 90, "Computer Science");

        // Act
        String result = student.toString();

        // Assert
        assertTrue(result.contains("Helen"));
        assertTrue(result.contains("Tran"));
    }
    @Test
    void testSetMajor() {

        // Arrange
        Nguyen student = new Nguyen("Helen", "Tran", 24, 90, "CS");

        // Act
        student.setMajor("Math");

        // Assert
        assertEquals("Math", student.getMajor());
    }
    @Test
    void testSetAgeValidation() {

        // Arrange
        Nguyen student = new Nguyen("Helen", "Tran", 24, 90, "CS");

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> {
            student.setAge(-1);
        });
    }
    @Test
    void testSetGradeValidation() {

        // Arrange
        Nguyen student = new Nguyen("Helen", "Tran", 24, 90, "CS");

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> {
            student.setGrade(150);
        });
    }
    @Test
    void testIsPassEdgeCase() {

        // Arrange
        Nguyen student = new Nguyen("Helen", "Tran", 24, 60, "CS");

        // Act
        boolean result = student.isPass();

        // Assert
        assertFalse(result);
    }
    @Test
    void constructorThrowsWhenGradeTooLow() {

        // Arrange + Act + Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Nguyen("Helen", "Tran", 24, -5, "CS");
        });
    }
    @Test
    void constructorThrowsWhenGradeTooHigh() {

        // Arrange + Act + Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Nguyen("Helen", "Tran", 24, 120, "CS");
        });
    }
    @Test
    void constructorThrowsWhenAgeNegative() {

        // Arrange + Act + Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Nguyen("Helen", "Tran", -1, 90, "CS");
        });
    }
    @Test
    void setGradeTooHighThrowsException() {

        Nguyen student = new Nguyen("Helen", "Tran", 24, 90, "CS");

        assertThrows(IllegalArgumentException.class, () -> {
            student.setGrade(200);
        });
    }
    @Test
    void setGradeTooLowThrowsException() {

        Nguyen student = new Nguyen("Helen", "Tran", 24, 90, "CS");

        assertThrows(IllegalArgumentException.class, () -> {
            student.setGrade(-10);
        });
    }
    @Test
    void constructorValidationThrowsException() {
        // Arrange
        int invalidAge = -5;

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Nguyen("John", "Smith", invalidAge, 80, "Math");
        });
    }

    @Test
    void testGettersAndSetters() {
        // Arrange
        Nguyen student = new Nguyen("Helen", "Tran", 24, 90, "CS");

        // Act
        student.setAge(30);
        student.setGrade(95);

        // Assert
        assertEquals(30, student.getAge());
        assertEquals(95, student.getGrade());
    }

    @Test
    void isPassHappyPath() {
        // Arrange
        Nguyen student = new Nguyen("Helen", "Tran", 24, 90, "CS");

        // Act
        boolean result = student.isPass();

        // Assert
        assertTrue(result);
    }

    @Test
    void isPassEdgeCase() {
        // Arrange
        Nguyen student = new Nguyen("Helen", "Tran", 24, 60, "CS");

        // Act
        boolean result = student.isPass();

        // Assert
        assertFalse(result);
    }
}