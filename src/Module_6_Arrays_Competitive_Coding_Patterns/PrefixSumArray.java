package Module_6_Arrays_Competitive_Coding_Patterns;

public class PrefixSumArray {

    public static void main(String[] args) {

        int arr[] = {2, 4, 1, 3, 6};
        int n = arr.length;

        //  Construct Prefix Array
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }


        int L = 1, R = 3;

        int rangeSum;
        if (L == 0)
            rangeSum = prefix[R];
        else
            rangeSum = prefix[R] - prefix[L - 1];

        System.out.println("Range Sum: " + rangeSum);
    }
}

