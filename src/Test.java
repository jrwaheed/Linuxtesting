public class Test {
    public static void main(String[] args)  {

        Adder adder = new Adder();
        adder.dividNumber(4,4);


        try {
            double result = adder.addNumbers(4,-4);
            System.out.println("Result is " + result);
        } catch (UnableToAddException e) {
            System.out.println("This does not work because "+ e.getMessage());
        }

    }
}
