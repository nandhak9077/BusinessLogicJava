import java.util.Scanner;

public class HappyNumberRange 
{
		int countHappy(int n)
		{
			int count=0;
			for(int i =0;i<=n;i++)
			{
				if(isHappy(i))
					count++;
			}
			return count;
		}
		
		void printHappy(int n)
		{
			for(int i =0;i<=n;i++)
			{
				if(isHappy(i))
					System.out.print(i+" ");
			}
		}
		
		boolean isHappy(int n)
		{
			while(n>9)
			{
				int sum=0;
				while(n!=0)
				{
					int r=n%10;
					n=n/10;
					sum=sum+r*r;
				}n=sum;
			}
			return n==1||n==7;
		}
		
		public static void main(String[] args) 
		{
			HappyNumberRange h = new HappyNumberRange();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int n = s.nextInt();
			s.close();
			boolean r =h.isHappy(n);
			if(r)
				System.out.println(n+" is happy number :)");
			else
				System.out.println(n+" is sad number :( ");
			
			System.out.print("Range : ");
			h.printHappy(100);
			
			int co = h.countHappy(100);
			System.out.print("\nCount : ");
			System.out.print(co);
			
		}
}