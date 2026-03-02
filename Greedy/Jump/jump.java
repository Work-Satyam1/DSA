class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here
        int count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(count<i)
            {
                return false;
            }
            count=Math.max(count,i+arr[i]);
        }
        return true;
    }
}