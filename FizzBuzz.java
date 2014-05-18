

public class FizzBuzz {
    private IFizzBuzzCalculator fizzBuzzCalculator;

    public FizzBuzz(IFizzBuzzCalculator fizzBuzzCalculator) {
        this.fizzBuzzCalculator = fizzBuzzCalculator;
    }

    public String get(int i) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fizzBuzzCalculator.stringOf(1));
        for(int a = 2; a <= i; ++a) {
            stringBuilder.append(", ");
            stringBuilder.append(fizzBuzzCalculator.stringOf(a));
        }
        return stringBuilder.toString();
    }
}
