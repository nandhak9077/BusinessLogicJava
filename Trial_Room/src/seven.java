import java.util.Scanner;

class seven
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] a = new int[5]; 
		int[] count = new int[10];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.print("The entered array is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			count[a[i]]++;
		}
		System.out.println("");
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			System.out.println(i+"-->"+count[i]);
		}
		s.close();
	}
}