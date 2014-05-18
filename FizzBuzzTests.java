
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class FizzBuzzTests {

    Mockery context = new Mockery();
    IFizzBuzzCalculator mockFizzBuzzCalculator;

    FizzBuzz fizzBuzz;

    public FizzBuzzTests() {
        mockFizzBuzzCalculator = context.mock(IFizzBuzzCalculator.class);

        fizzBuzz = new FizzBuzz(mockFizzBuzzCalculator);
    }

    @Test
    public void testClass() {
        context.checking(new Expectations() {{
            oneOf(mockFizzBuzzCalculator).stringOf(1); will(returnValue("a"));
            oneOf(mockFizzBuzzCalculator).stringOf(2); will(returnValue("b"));
            oneOf(mockFizzBuzzCalculator).stringOf(3); will(returnValue("c"));
            oneOf(mockFizzBuzzCalculator).stringOf(4); will(returnValue("d"));
            oneOf(mockFizzBuzzCalculator).stringOf(5); will(returnValue("e"));
            oneOf(mockFizzBuzzCalculator).stringOf(6); will(returnValue("f"));
            oneOf(mockFizzBuzzCalculator).stringOf(7); will(returnValue("g"));
            oneOf(mockFizzBuzzCalculator).stringOf(8); will(returnValue("h"));
            oneOf(mockFizzBuzzCalculator).stringOf(9); will(returnValue("i"));
            oneOf(mockFizzBuzzCalculator).stringOf(10); will(returnValue("j"));
        }});

        String result = fizzBuzz.get(10);
        context.assertIsSatisfied();

        assert result.equals("a, b, c, d, e, f, g, h, i, j");
    }
}
