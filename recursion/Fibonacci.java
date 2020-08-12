import java.util.Scanner;

public class Fibonacci {
  public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int result = fibonacci(n - 1) + fibonacci(n - 2);
    return result;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int result = fibonacci(n);
    System.out.println("The fibonacci of n is: " + result);
    s.close();
  }
}