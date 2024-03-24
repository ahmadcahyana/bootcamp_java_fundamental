public class Factorial {
    // Recursive method to calculate factorial
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Factorial of 5 is: " + fact.factorial(5));
    }
}