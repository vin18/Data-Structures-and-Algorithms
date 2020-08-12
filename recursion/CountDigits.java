import java.util.Scanner;

public class CountDigits {
  public static int countDigits(int n) {
    if (n == 0) {
      return 0;
    }
    int smallAns = countDigits(n / 10);
    return smallAns + 1;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = countDigits(n);
    System.out.println("The total number of digits in " + n + " is: " + count);
    s.close();
  }
}