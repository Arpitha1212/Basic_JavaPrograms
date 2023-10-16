
public class CountNumberApp {
	public int CountNumber(int num) 
	{
		int count =0;
		while(num!=0)
		{
			num =num/10;
			count++;
		}
             return count;
	}
}
