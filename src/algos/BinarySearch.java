package algos;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 5, 6, 8, 10, 13, 17, 19 };
    System.out.println(binarySearch(arr, 12));
    System.out.println(binarySearch(arr, 13));
  }

  /**
   * Return the index of the target in the array, if present.
   * 
   * @param arr    The array to search.
   * @param target The element to look for in arr.
   * @return The index of the target, or -1 if the target is not present.
   */
  public static int binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    int middle = 0;
    while (low < high) {
      middle = (high + low) / 2;

      if (arr[middle] == target) {
        return middle;
      } else if (arr[middle] > target) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
    }
    return -1;
  }
}
