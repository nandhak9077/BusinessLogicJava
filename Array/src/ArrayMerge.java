
public class ArrayMerge 
{
	int[] arrayMerge(int[] a, int[] b)
	{
		int c[] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
}