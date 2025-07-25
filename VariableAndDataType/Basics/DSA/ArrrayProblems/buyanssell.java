package DSA.ArrrayProblems;

import java.util.*;
public class buyanssell {

    public static int buyAndSEll(int prices[]) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i <= prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
            return profit;
        }
    }

   public static void main(String[] args) {
        int prices[] = {7,1,2,4,5,6,1};

        System.out.println(buyAndSEll(prices));

      }




