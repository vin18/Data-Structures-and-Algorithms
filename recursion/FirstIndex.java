import java.util.Scanner;

public class FirstIndex {
  public static int firstIndex(int input[], int n, int startIndex) {
    if (startIndex == input.length) {
      return -1;
    }
    if (input[startIndex] == n) {
      return startIndex;
    }
    int smallAns = firstIndex(input, n, startIndex + 1);
    return smallAns;
  }

  public static int firstIndex(int input[], int n) {
    return firstIndex(input, n, 0);
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int input[] = { 5, 5, 6, 5, 6 };
    int result = firstIndex(input, n);
    System.out.println("The first index where " + n + " is present is: " + result);
    s.close();
  }
}