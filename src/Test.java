public class Test {
    public static void main(String[] args)  {

        Adder adder = new Adder();

        double result = 0;
        try {
            result = adder.addNumbers(4,8);
            System.out.println("Result is " + result);
        } catch (UnableToAddException e) {
            System.out.println("This does not work because "+ e.getMessage());
        }

    }
}
