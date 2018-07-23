import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd_twoPositiveNumbers() {
        // Given
        double predictedAnswer = 5.0;

        // When
        double returnedAnswer = calculator.add(2.0, 3.0);

        // Then
        Assert.assertEquals("The numbers are not being added correctly",
                predictedAnswer, returnedAnswer, 0);
    }

    @Test
    public void testAdd_twoNegativeNumbers() {
        // Given
        double predictedAnswer = -8.0;

        // When
        double returnedAnswer = calculator.add(-5.0, -3.0);

        // Then
        Assert.assertEquals("The numbers are not being added correctly",
                predictedAnswer, returnedAnswer, 0);
    }

    @Test
    public void testSubtract_twoPositiveNumbers() {
        // Given
        double predictedAnswer = 5.0;

        // When
        double returnedAnswer = calculator.subtract(11.0, 6.0);

        // Then
        Assert.assertEquals("The numbers are not being subtracted correctly",
                predictedAnswer, returnedAnswer, 0);
    }


}
