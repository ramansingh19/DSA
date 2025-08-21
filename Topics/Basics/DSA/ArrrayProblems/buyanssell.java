package DSA.ArrrayProblems;

public class buyanssell {

    public static int buyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int  maxprofit = 0;

        for (int i=0; i<prices.length; i++){
            if (buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxprofit = Math.max(profit,maxprofit);
            }else {
                buyPrice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,3,2,6,5,1};

        System.out.println(buyAndSell(prices));

    }


}





