package algos;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3 };
        mergeSort(arr);
        printArr(arr);

        int[] arr2 = { 75, 23, 36, 8, 9 };
        mergeSort(arr2);
        printArr(arr2);
    }

    /**
     * Sort the given array in place.
     * 
     * @param arr The array to sort.
     */
    public static void mergeSort(int[] arr) {
        sortHelper(arr, 0, arr.length - 1);
    }

    /**
     * Sort the given portion of the array in place.
     * 
     * @param arr   The array containing the portion to sort.
     * @param start The start of the portion to sort, inclusive.
     * @param end   The end of the portion to sort, inclusive.
     */
    private static void sortHelper(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int middle = start + (end - start) / 2;
        sortHelper(arr, start, middle);
        sortHelper(arr, middle + 1, end);
        merge(arr, start, end);
    }

    /**
     * Merge two sorted halves in the given portion of the array. If the portion has
     * an odd length, then the extra element should be in the first half.
     * 
     * @param arr   The array containing the portion to merge.
     * @param start The start of the portion to merge, inclusive.
     * @param end   The end of the portion to merge, inclusive.
     */
    private static void merge(int[] arr, int start, int end) {
        int arrPtr = start;
        int modLen = end - start + 1;
        int[] first = new int[modLen / 2 + modLen % 2];
        for (int i = 0; i < first.length; i++) {
            first[i] = arr[arrPtr++];
        }
        int[] second = new int[modLen / 2];
        for (int i = 0; i < second.length; i++) {
            second[i] = arr[arrPtr++];
        }
        arrPtr = start;
        int firstPtr = 0;
        int secondPtr = 0;
        while (firstPtr < first.length && secondPtr < second.length) {
            arr[arrPtr++] = first[firstPtr] < second[secondPtr] ? first[firstPtr++] : second[secondPtr++];
        }
        while (firstPtr < first.length) {
            arr[arrPtr++] = first[firstPtr++];
        }
        while (secondPtr < second.length) {
            arr[arrPtr++] = second[secondPtr++];
        }
    }

    /**
     * Print the given array.
     * 
     * @param arr The array to print.
     */
    private static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
