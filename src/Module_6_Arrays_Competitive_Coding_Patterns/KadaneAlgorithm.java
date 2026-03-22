package Module_6_Arrays_Competitive_Coding_Patterns;

public class KadaneAlgorithm {
    public static int maxSubArraySum(int arr[]) {
        int current_sum = arr[0];
        int max_sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i], current_sum + arr[i]);
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
}
