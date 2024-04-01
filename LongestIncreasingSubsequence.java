class Solution {
    public int lengthOfLIS(int[] nums) {      
        int n=nums.length;
        int D[]=new int[n];
        int max=1;
        for(int i=0;i<n;i++)
        {
            D[i]=1;
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j] && D[i]<=D[j])
                {
                    D[i]=D[j]+1;
                }
            }
            if(D[i]>max)
                max=D[i];
        }
        return max;
    }
}