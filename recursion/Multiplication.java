import java.util.Scanner;

public class Multiplication {
  public static int multiplication(int m, int n) {
    if (n == 0) {
      return n;
    }
    int smallAns = multiplication(m, n - 1);
    return smallAns + m;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    int n = s.nextInt();
    int result = multiplication(m, n);
    System.out.println("The multiplication of " + m + " and " + n + " is: " + result);
    s.close();
  }
}