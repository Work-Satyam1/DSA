class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<Integer>result=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        helper(0,arr,result,ans);
        return ans;
    }
    
    public static void helper(int start, int []arr,ArrayList<Integer>result,ArrayList<ArrayList<Integer>>ans)
    {
        ans.add(new ArrayList<>(result));
        
        for(int i=start;i<arr.length;i++)
        {
            result.add(arr[i]);
            helper(i+1,arr,result,ans);
            result.remove(result.size()-1);
        }
    }
}