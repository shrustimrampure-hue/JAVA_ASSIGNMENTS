package Module_6_Arrays_Competitive_Coding_Patterns;

public class NegativePositivePartition {

    public static void main(String[] args) {

        int[] arr = { -1, 3, -2, 4, -5, 6 };

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] < 0) {
                left++;
            }
            else if (arr[right] > 0) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Array after partition:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

