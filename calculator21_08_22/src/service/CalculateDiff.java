package service;

public class CalculateDiff {
	public int calculateDifference(int n) {
		int sumOfn=0;
		int sumSquare=0;
		//sum of n natural number
		sumOfn=(n*(n+1))/2;
		//square of sumOfn.
		int sumSqr=sumOfn*sumOfn;
		//sum of square of each natural number.
		for (int i=0; i<=n; i++) {
			sumSquare=sumSquare+(i*i);
		}
		//Difference
		int diff=sumSquare-sumSqr;
		
		//if diff is negative
		if(diff<0) {
			return -diff;
		}else {
			return diff;
		}
	}
}
