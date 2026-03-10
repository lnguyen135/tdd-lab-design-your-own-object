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