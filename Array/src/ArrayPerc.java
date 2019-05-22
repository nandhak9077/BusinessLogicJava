import java.util.Scanner;

public class ArrayPerc 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int counte=0,counto=0;
		System.out.println("Enter the value of n : ");
		int n = s.nextInt();	
		int ar[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
			if(ar[i]%2==0)
			{
				counte++;
			}
			else
			{
				counto++;
			}
		}
		System.out.println("The percentage of even elements in the array is : "+(double)counte/n*100+" %");
		System.out.println("The percentage of odd elements in the array is : "+(double)counto/n*100+" %");
		s.close();
	}
}