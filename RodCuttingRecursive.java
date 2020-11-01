import java.util.Arrays;

class RodCuttingRecursive{
	public static void main(String[] args){
		int maxProfit = 0;

		System.out.println("Test case 1");
		int[] prices = {4, 3};
		int rodLength = 2; // max(4+4, 3)

		maxProfit = rodCutting(prices, rodLength);
		System.out.println("Maximum profit for rodLength: " + rodLength + " and prices: " + Arrays.toString(prices) + " is: " + maxProfit);

		System.out.println("Test case 2");
		prices[1] = 10;
		maxProfit = rodCutting(prices, rodLength); // max(4+4, 10)
		System.out.println("Maximum profit for rodLength: " + rodLength + " and prices: " + Arrays.toString(prices) + " is: " + maxProfit);
	}

	static int rodCutting(int[] prices, int rodLength){
		int maxProfit = 0;

		// iterate over the choices to make a cut
		// kIndex ==  rodLength means no cut!
		for(int kIndex = 1; kIndex <= rodLength; kIndex++) { // cutLength = 1; cutLength = 2; 
			maxProfit = Math.max(maxProfit, prices[kIndex-1] + rodCutting(prices, rodLength-kIndex));
		}

		return maxProfit;
	}
}
