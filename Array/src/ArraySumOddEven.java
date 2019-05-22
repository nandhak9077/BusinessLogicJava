import java.util.Scanner;

public class ArraySumOddEven 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int sume=0,sumo=0;
		System.out.println("Enter the value of n : ");
		int n = s.nextInt();	
		int ar[] = new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
			if(ar[i]%2==0)
				sume+=ar[i];
			else
				sumo+=ar[i];
		}
		System.out.println("The sum of even elements in the array is : "+sume);
		System.out.println("The sum of odd elements in the array is : "+sumo);
		s.close();
	}
}