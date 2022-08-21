package service;

public class CalculateSum {
	public int calculateSum(int n) {
		int sum=0;
		for(int i=0; i<=n; i++) {
			if(i%3==0 && i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
