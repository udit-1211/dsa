public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
         int maxlen =0, left =0, right =0, n = a.length;
        long sum = a[0];
        while(right<n){
            while(left <=right && sum>k){
                sum -= a[left];
                left++;
            }
            if(sum == k)
            maxlen = Math.max(maxlen, right -left+1);
            right++;
            if(right<n)
                sum += a[right]; 
       }
       return maxlen;
    }
}