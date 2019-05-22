
public class ArrayInsertion 
{
	int[] Insert(int[] a,int index,int element)
	{
		int[] b = new int[a.length+1];
		if(index<0||index>a.length)
		{
			System.out.println("Index is not in the range!!");
			return a;
		}
		b[index]=element;
		for(int i=0;i<a.length;i++)
		{
			if(i<index)
				b[i]=a[i];
			else
				b[i+1]=a[i];
		}
		System.out.print("The array is added with "+element+ " at position "+index);
		System.out.print("\nThe new array is : ");
		
		return b;
	}
}
