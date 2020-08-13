import java.util.Scanner;

public class CheckElement {
  // Head Recursion
  public static boolean checkElementIsPresent2(int input[], int n, int endIndex) {
    if (endIndex == -1) {
      return false;
    }
    boolean smallAns = checkElementIsPresent2(input, n, endIndex - 1);
    if (input[endIndex] == n) {
      return true;
    }
    return smallAns;
  }

  public static boolean checkElementIsPresent2(int input[], int n) {
    return checkElementIsPresent2(input, n, input.length - 1);
  }

  // Tail Recursion
  public static boolean checkElementIsPresent(int input[], int n, int startIndex) {
    if (startIndex == input.length) {
      return false;
    }
    if (input[startIndex] == n) {
      return true;
    }
    boolean smallAns = checkElementIsPresent(input, n, startIndex + 1);
    return smallAns;
  }

  public static boolean checkElementIsPresent(int input[], int n) {
    return checkElementIsPresent(input, n, 0);
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int input[] = { 2, 4, 2, 1, 3, 5 };
    int n = s.nextInt();
    boolean result = checkElementIsPresent2(input, n);
    System.out.println("Is " + n + " present in the given array? " + result);
    s.close();
  }
}