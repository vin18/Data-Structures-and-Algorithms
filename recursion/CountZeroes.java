import java.util.Scanner;

public class CountZeroes {
  public static int countZeroes(int n) {
    if (n == 0) {
      return n;
    }
    int smallAns = countZeroes(n / 10);
    int lastDigit = n % 10;
    if (lastDigit == 0) {
      return smallAns + 1;
    } else {
      return smallAns;
    }
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int result = countZeroes(n);
    System.out.println("The number of zeroes in " + n + " is: " + result);
    s.close();
  }
}