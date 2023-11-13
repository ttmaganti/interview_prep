package com.magnet.prep.core;

public class ChangeMakingDynamic {
	public static void main(String args[]) {
		int[] coins = {2, 4, 6};
		int amount = 17;
		
		int result = minCoins(coins, amount);
		System.out.println("Min. coins needed "+result);
	}
	
	static int minCoins(int[] coins, int amount) {
		int[] dp = new int[amount+1];
		
		for(int i=1; i<=amount;i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int coin : coins) {
				if((i-coin) >= 0 && dp[i-coin] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[i-coin]+1);
					System.out.println(i+ " = dp["+i+"] = "+dp[i]);
				}
			}
		}
		
		return dp[amount];
	}

}
