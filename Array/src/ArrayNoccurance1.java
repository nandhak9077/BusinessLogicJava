
public class ArrayNoccurance1 
{
	public static void main(String[] args) 
	{
		int ar[] = {28,48,28,52,9,6,9,52,28,13};
		int big = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(big<ar[i])
				big=ar[i];
		}
		int c[] = new int[big+1];
		for(int i=0;i<ar.length;i++)
		{
			c[ar[i]]++;
		}
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]!=0)
				System.out.println(i+" -> "+c[i]);
		}
	}
}