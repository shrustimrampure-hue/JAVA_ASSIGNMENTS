package Module_7_Searching_Sorting_Complexity;

public class SearchRotatedArray {

    public static int search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[low] <= arr[mid]) {

                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            else {

                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 1, 2, 3};
        int target = 2;

        int result = search(arr, target);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}

