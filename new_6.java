package day06;

public class new_6 {


	    public static void main(String[] args) {

	        int[] Profit = {5, 3, -1, 4, -10, 6, 2};

	        int currentProfit = 0;
	        int bestProfit = 0;

	        for (int i = 0; i < Profit.length; i++) {

	            currentProfit = currentProfit + Profit[i];

	            if (currentProfit < 0) {
	                currentProfit = 0;
	            }

	            if (currentProfit > bestProfit) {
	                bestProfit = currentProfit;
	            }
	        }

	        System.out.println("Best Profit = " + bestProfit);
	    }
	}

