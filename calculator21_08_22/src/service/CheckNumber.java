package service;

public class CheckNumber {
	
	//Check Number if it is Increasing.
	public boolean checkIncreasing(int n) {
		//Getting length of Number.
		int length = 0;
		int temp1=0, temp2=0;
		
		while(n != 0)  
		{  
		n = n / 10;  
		length = length + 1;  
		}  
		
		for(int i=1; i<=length; i++) {
			temp1 = n%10;
			n=n/10;
			temp2=n%10;
			if(temp1<temp2) {
				break;
			}
			if(i==length) {
				return true;
			}	
		}
		return false;
	}
	
	
//	Check if Number Is power of 2
	public boolean checkPowOfTwo(int n) {
		int result=2;
		boolean ans=false;
//		do{
//			result=result*2;
//			if(result==n) {
//				ans=true;
//				break;
//			}
//		}while(result<=n);\
		if(n<0) {
			return ans;
		}
		while(result<=n) {
			if(result==n) {
				ans=true;
				break;
			}
			result=result*2;
		}
		return ans;
	}
}
