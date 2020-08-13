import java.util.Scanner;

public class LastIndex {
  public static int lastIndex(int input[], int n, int lastIndex) {
    if (lastIndex == -1) {
      return -1;
    }
    int smallAns = lastIndex(input, n, lastIndex - 1);
    if (input[lastIndex] == n) {
      return lastIndex;
    }
    return smallAns;
  }

  public static int lastIndex(int input[], int n) {
    return lastIndex(input, n, input.length - 1);
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int input[] = { 5, 5, 6, 5, 6 };
    int result = lastIndex(input, n);
    System.out.println("The first index where " + n + " is present is: " + result);
    s.close();
  }
}