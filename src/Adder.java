import java.util.List;

public class Adder {
    private List<String> text;


    public double addNumbers (double a, double b) throws UnableToAddException {
        // an error can occur
        double sum = a + b;
        if (sum == 0) {
            throw new UnableToAddException("This sum is unacceptable");
        }
        return a + b;
    }

    public double dividNumber (double a, double b){
        try {
            System.out.println("OK");
            //text.add("hello");
        } catch (NullPointerException e) {
            System.out.println("Nope. Try again.");
        }
        return a/b;
    }
}
