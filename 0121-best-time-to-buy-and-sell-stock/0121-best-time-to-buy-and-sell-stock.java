import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int minV= prices[0];

        for(int i=1;i<prices.length;i++){
          if(prices[i]<minV){
            minV=prices[i];
          }
          int profit=prices[i]-minV;

          maxP=Math.max(maxP,profit);

        }
        return maxP;
    }
}