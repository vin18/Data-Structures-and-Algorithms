import java.util.Scanner;

public class SumOfDigits {
  public static int sumOfDigits(int n) {
    if (n == 0) {
      return 0;
    }
    int lastDigit = n % 10;
    int smallAns = sumOfDigits(n / 10);
    return smallAns + lastDigit;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int result = sumOfDigits(n);
    System.out.println("The sum of digits of " + n + " is: " + result);
    s.close();
  }
}