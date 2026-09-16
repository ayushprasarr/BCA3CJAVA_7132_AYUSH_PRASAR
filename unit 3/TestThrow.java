public class TestThrow {

    static void checkEligibility(int age, String studentName) {
        if (age < 18) {
            throw new ArithmeticException(
                studentName + " is not eligible to vote (Age must be 18+)."
            );
        } else {
            System.out.println(studentName + " is eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Checking registration for Vivaan...");
            checkEligibility(16, "Vivaan");

        } catch (ArithmeticException e) {
            System.out.println("Caught Explicit Exception: " + e.getMessage());
        }
    }
}
