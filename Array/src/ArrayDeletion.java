public class ArrayDeletion 
{
	int[] Delete(int[] a,int index)
	{
		int[] b = new int[a.length-1];
		
		if(index<0||index>a.length-1)
		{
			System.out.println("Index is not in the range!!");
			return a;
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(i<index)
				b[i]=a[i];
			else
				b[i]=a[i+1];
		}
		
		System.out.print("The element at position "+index+" is deleted.");
		System.out.print("\nThe new array is : ");
		
		return b;
	}
}
