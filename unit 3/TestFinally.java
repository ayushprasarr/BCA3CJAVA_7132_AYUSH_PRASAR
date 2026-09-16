public class TestFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Vivaan opening database connection...");

            int data = 25 / 5;
            System.out.println("Data calculated: " + data);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());

        } finally {
            System.out.println("FINALLY BLOCK: Closing Vivaan's database connection guaranteed!");
        }
    }
}
