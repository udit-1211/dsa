public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int i=0, j;
        for(j = i; j<n; j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}