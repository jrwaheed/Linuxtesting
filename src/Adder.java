public class Adder {

    public double addNumbers (double a, double b) throws UnableToAddException {
        // an error can occur
        double sum = a + b;
        if (sum == 0) {
            throw new UnableToAddException("This sum is unacceptable");
        }
        return a + b;
    }

    public double dividNumber (double a, double b){
        return a/b;
    }
}
