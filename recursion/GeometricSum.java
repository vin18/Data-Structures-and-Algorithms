import java.util.Scanner;
import java.lang.Math;

public class GeometricSum {
  public static double geometricSum(double k) {
    if (k == 0) {
      return 1;
    }
    double smallAns = geometricSum(k - 1);
    return smallAns + 1.0 / Math.pow(2, k);
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double k = s.nextInt();
    double result = geometricSum(k);
    System.out.println("The geometric sum of " + k + " is: " + result);
    s.close();
  }
}