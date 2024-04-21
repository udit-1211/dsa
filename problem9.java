import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;

        ArrayList<Integer> result = new ArrayList<>(n);

        for (int i = k; i < n; i++) {
            result.add(arr.get(i));
        }

        for (int i = 0; i < k; i++) {
            result.add(arr.get(i));
        }

        return result;
    }
}