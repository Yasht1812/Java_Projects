package com.thinkitive.day2;

public class AddDifferently {

	public int add(int... a) {
		int ans = 0 ; 
		for(int x:a) {
			ans = ans+x;
		}
		return ans;
	}

}
