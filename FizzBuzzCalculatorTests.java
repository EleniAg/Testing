
import org.junit.Test;

public class FizzBuzzCalculatorTests {

    IFizzBuzzCalculator fizzBuzz;

    public FizzBuzzCalculatorTests() {
        fizzBuzz = new FizzBuzzCalculator();
    }

    @Test
    public void testOne() {
        assert(fizzBuzz.stringOf(1).equals("1"));
    }

    @Test
    public void testTwo() {
        assert(fizzBuzz.stringOf(2).equals("2"));
    }

    @Test
    public void testFour() {
        assert(fizzBuzz.stringOf(4).equals("4"));
    }

    @Test
    public void testSeven() {
        assert(fizzBuzz.stringOf(7).equals("7"));
    }

    @Test
    public void testMultOfThree() {

        for(int i = 3; i < 15; i += 3) {
            String result = fizzBuzz.stringOf(i);

            assert (result.equals("Fizz"));
        }
    }

    @Test
    public void testMultOfFive() {

        for(int i = 5; i < 15; i += 5) {
            String result = fizzBuzz.stringOf(i);

            assert (result.equals("Buzz"));
        }
    }

    @Test
    public void testMultOfFifteen() {

        for(int i = 15; i < 151; i += 15) {
            String result = fizzBuzz.stringOf(i);

            assert (result.equals("FizzBuzz"));
        }
    }


}
