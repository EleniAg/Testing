
import org.jcheck.Implication;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.jcheck.runners.JCheckRunner.class)
public class FizzBuzzCalculatorCheckTests extends Implication {

    @Test
    public void testNotMultipleOfThreeOrFive(int someInt) {
        imply(someInt % 3 != 0 && someInt % 5 != 0);

        assert(new FizzBuzzCalculator().stringOf(someInt).equals(String.valueOf(someInt)));
    }

    @Test
    public void testMultipleOfThreeNotFive(int someInt) {
        imply(someInt > 0 && someInt % 3 == 0 && someInt % 5 != 0);

        assert(new FizzBuzzCalculator().stringOf(someInt).equals(String.valueOf("Fizz")));
    }

    @Test
    public void testMultipleOfFiveNotThree(int someInt) {
        imply(someInt > 0 && someInt % 5 == 0 && someInt % 3 != 0);

        assert(new FizzBuzzCalculator().stringOf(someInt).equals(String.valueOf("Buzz")));
    }

    @Test
    public void testMultipleOfThreeAndFive(int someInt) {
        imply(someInt > 0 && someInt % 3 == 0 && someInt % 5 == 0);

        assert(new FizzBuzzCalculator().stringOf(someInt).equals(String.valueOf("FizzBuzz")));
    }
}
