public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        int xor = 0;
        for(int num: arr) xor ^= num;
        return xor;
    }
}