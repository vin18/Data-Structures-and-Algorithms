import java.util.Scanner;

public class CheckSorted {
  // Head recursion
  public static boolean checkSorted1(int input[]) {
    if (input.length <= 1) {
      return true;
    }
    int[] smallInput = new int[input.length - 1];
    for (int i = 1; i < input.length; i++) {
      smallInput[i - 1] = input[i];
    }
    boolean smallAns = checkSorted1(smallInput);
    if (input[0] > input[1]) {
      return false;
    }
    return smallAns;
  }

  // Tail recursion
  public static boolean checkSorted2(int input[]) {
    if (input.length <= 1) {
      return true;
    }
    int[] smallInput = new int[input.length - 1];
    for (int i = 1; i < input.length; i++) {
      smallInput[i - 1] = input[i];
    }
    if (input[0] > input[1]) {
      return false;
    }
    boolean smallAns = checkSorted2(smallInput);
    return smallAns;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int input1[] = { 4, 5, 2, 4, 1, 6, 3 };
    int input2[] = { 1, 2, 3, 4, 5 };
    // boolean result = checkSorted1(input1);
    boolean result = checkSorted1(input2);
    System.out.println("Is the array sorted? " + result);
    s.close();
  }
}