//寻找当前位置之前的最小值做差取最大
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        int min = prices[0], max = 0;
        for(int i = 0; i < prices.length; i++){
            max = Math.max(max, prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }
}

//循环查找最大差值
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length - 1; i++){
            for (int j = i + 1; j < prices.length; j++){
                if(prices[j] - prices[i] > max)
                    max = prices[j] - prices[i];
            }
        }
        return max;
    }
}