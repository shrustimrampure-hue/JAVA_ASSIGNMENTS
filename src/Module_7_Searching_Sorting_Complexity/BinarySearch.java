package Module_7_Searching_Sorting_Complexity;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};
        int key = 8;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            }

            else if (key < arr[mid]) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        System.out.println("Element not found");
    }
}

