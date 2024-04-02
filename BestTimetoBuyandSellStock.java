class Solution {
    public int maxProfit(int[] prices) {
        
        int l = prices.length;
        int min = prices[0];
        int prof = 0;
        
        for(int i=1;i<l;i++)
        {
            if(prices[i]<min)        
                min = prices[i];
            else
            {
                int curr_prof = prices[i]-min;
                if(curr_prof > prof)
                    prof=curr_prof;
            }
        }

        return prof;
    }
}