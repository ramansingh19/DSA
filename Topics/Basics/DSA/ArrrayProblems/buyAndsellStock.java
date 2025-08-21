package DSA.ArrrayProblems;

public class buyAndsellStock {

    public static int buyAndSellSTock(int prices[] ){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++){
            if (buyPrice < prices[i]){//Profit
                int profit = prices[i] - buyPrice;//today profit
                maxProfit = Math.max(maxProfit , profit);
            }else  {
                buyPrice = prices[i];
            }
        }
        return  maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("if we sell then profit will be :"+ buyAndSellSTock(prices));

    }
}
