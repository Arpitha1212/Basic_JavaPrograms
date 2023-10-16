
public class PowerN {
	 int powern(int num1,int num2) 
	 {
		 int finalresult = 1;
		 for(int i=1;i<=num2;i++) 
		 {
	    	finalresult = finalresult*num1;
		 }
		 return finalresult;
	}
}
