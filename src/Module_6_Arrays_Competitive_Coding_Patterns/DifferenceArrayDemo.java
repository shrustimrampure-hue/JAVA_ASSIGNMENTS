package Module_6_Arrays_Competitive_Coding_Patterns;

public class DifferenceArrayDemo {
    public static void main(String[] args) {

        int n = 5;
        int[] arr = {10, 20, 30, 40, 50};

        int[] diff = new int[n];
        diff[0] = arr[0];

        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        int L = 1;
        int R = 3;
        int val = 5;

        diff[L] += val;

        if (R + 1 < n) {
            diff[R + 1] -= val;
        }

        arr[0] = diff[0];

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }

        System.out.println("Updated Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

