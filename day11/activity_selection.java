package day11;

public class activity_selection {

	    public static void main(String[] args) {

	        char[] job = {'A', 'B', 'C', 'D', 'E'};
	        int[] deadline = {2, 1, 2, 1, 3};
	        int[] profit = {100, 19, 27, 25, 15};

	        // Sort according to profit
	        for (int i = 0; i < job.length - 1; i++) {

	            for (int j = i + 1; j < job.length; j++) {

	                if (profit[i] < profit[j]) {

	                    int temp = profit[i];
	                    profit[i] = profit[j];
	                    profit[j] = temp;

	                    temp = deadline[i];
	                    deadline[i] = deadline[j];
	                    deadline[j] = temp;

	                    char c = job[i];
	                    job[i] = job[j];
	                    job[j] = c;
	                }
	            }
	        }

	        int count = 0;
	        int totalProfit = 0;

	        System.out.println("Selected Jobs:");

	        for (int i = 0; i < job.length && count < 2; i++) {

	            System.out.println("Job " + job[i] +
	                               " Profit = " + profit[i]);

	            totalProfit = totalProfit + profit[i];
	            count++;
	        }

	        System.out.println("Total Profit = " + totalProfit);
	    }
	}

