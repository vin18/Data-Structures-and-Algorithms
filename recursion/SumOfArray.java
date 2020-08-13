
public class SumOfArray {

  // Tail Recursion
  public static int sumOfArray2(int input[], int endIndex) {
    if (endIndex == -1) {
      return 0;
    }
    int sum = input[endIndex];
    int smallAns = sumOfArray2(input, endIndex - 1);
    return sum + smallAns;
  }

  public static int sumOfArray2(int input[]) {
    return sumOfArray2(input, input.length - 1);
  }

  // Head Recursion
  public static int sumOfArray1(int input[], int startIndex) {
    if (startIndex == input.length) {
      return 0;
    }
    int smallAns = sumOfArray1(input, startIndex + 1);
    int sum = input[startIndex];
    return sum + smallAns;
  }

  public static int sumOfArray1(int input[]) {
    return sumOfArray1(input, 0);
  }

  public static void main(String args[]) {
    int input[] = { 1, 2, 3, 4, 5 };
    int sum = sumOfArray1(input);
    System.out.println("The sum of elements in given array is: " + sum);
  }
}