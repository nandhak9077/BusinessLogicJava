
public class PerfectNumberRange 
{
		boolean isPerfect(int n)
		{
			int i=0,sum=0;
			while(i<=n/2)
			{
				if(n%i==0)
				{
					sum += i;
				}
				i++;
			}
			return sum==n;		
		}
		
		public static void main(String[] args) 
		{
			int sum=0,count=0;
			PerfectNumber p = new PerfectNumber();
			System.out.print("The perfect numbers between 1 to 1000 are : ");
			for(int i = 2; i<=1000 ; i++) 
			{
				boolean r = p.isPerfect(i);
				if(r==true)
				{
					sum += i;
					count++;
					System.out.print(i+" ");
				}	
		    }
			System.out.println("\nCount is  : " +count);
			System.out.println("Sum of the perfect number is : " +sum);
		}
}