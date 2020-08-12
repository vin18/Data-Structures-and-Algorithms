import java.util.Scanner;

public class Factorial {

  public static int factorial(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int smallOutput = factorial(n - 1);
    return n * smallOutput;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int result = factorial(n);
    System.out.println("The factorial of " + n + " is: " + result);
    s.close();
  }
}