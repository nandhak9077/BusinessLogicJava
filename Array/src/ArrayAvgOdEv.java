import java.util.Scanner;

public class ArrayAvgOdEv 
{
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			int sume=0,counte=0,sumo=0,counto=0;
			System.out.println("Enter the value of n : ");
			int n = s.nextInt();	
			int ar[] = new int[n];
			System.out.println("Enter the elements : ");
			for(int i=0;i<n;i++)
			{
				ar[i]=s.nextInt();
				if(ar[i]%2==0)
					{
						sume+=ar[i];
						counte++;
					}
				else
					{
						sumo+=ar[i];
						counto++;
					}
			}
			System.out.println("The sum of even elements in the array is : "+sume);
			System.out.println("The average of even elements in the array is : "+sume/counte);
			System.out.println("The sum of odd elements in the array is : "+sumo);
			System.out.println("The average of odd elements in the array is : "+sumo/counto);
			s.close();
		}
}