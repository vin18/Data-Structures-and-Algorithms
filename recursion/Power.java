import java.util.Scanner;

public class Power {
  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int smallOutput = power(x, n - 1);
    return x * smallOutput;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int n = s.nextInt();
    int result = power(x, n);
    System.out.println("The result is: " + result);
    s.close();
  }
}