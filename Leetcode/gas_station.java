package Leetcode;

import java.util.Currency;

public class gas_station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		int possible = gas_station(gas,cost);
		System.out.println(possible);

	}

	public static int gas_station(int[] gas, int[] cost) {
		// TODO Auto-generated method stub
		int total = 0;
		int curr = 0;
		int pos = 0;
		for (int i = 0; i < cost.length; i++) {
			curr += gas[i] -cost[i];
			total +=curr;
			if(curr<0) {
				pos++;
				curr=0;
			}
			
		}
		if(total>= 0)
			return pos;
		else
			return -1;
	}

}
