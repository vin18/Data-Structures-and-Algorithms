public class BubbleSort {

  public static void bubbleSort(int arr[]) {
    if (arr.length == 0 || arr.length == 1)
      return;

    boolean isSorted;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        isSorted = true;
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
          isSorted = false;
        }
        if (isSorted)
          return;
      }
    }
  }

  private static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String args[]) {
    int arr[] = { 2, 3, 1, 6, 4, 5 };
    bubbleSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}