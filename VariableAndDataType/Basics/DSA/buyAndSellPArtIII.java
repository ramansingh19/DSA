package DSA;

public class buyAndSellPArtIII {

    public static int buyAndSellIII(int[] prices){
        if (prices.length == 0) return 0;

        int n = prices.length;
        int[] leftProfit = new int[n];
        int[] rightProfit = new int[n];

        //left to right;
        int minPrice = prices[0];
        for (int i=1; i<n; i++){
            minPrice = Math.min(minPrice , prices[i]);
            leftProfit[i] = Math.max(leftProfit[i-1], prices[i] - minPrice);
        }
        //right to left
        int maxPrice = prices[n-1];
        for (int i=n-2; i>=0; i--){
            maxPrice = Math.max(maxPrice , prices[i]);
            rightProfit[i] = Math.max(rightProfit[i+1] , maxPrice - prices[i]);
        }
        //combination of both
        int maxProfit = 0;
        for (int i=0; i<n; i++){
            maxProfit = Math.max(maxProfit , leftProfit[i] + rightProfit[i]);
        }
        return  maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyAndSellIII(prices));
    }
}
