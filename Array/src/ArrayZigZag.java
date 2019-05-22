
public class ArrayZigZag 
{
	int[] zigzag(int[] a,int[] b)
	{
		int[] c = new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length && i<b.length)
		{
			c[k] = a[i];
			k++;
			c[k] = b[i];
			i++;
			k++;
		}
		while(i<a.length)
		{
			c[k++] = a[i++];
		}
		while(i<b.length)
		{
			c[k++] = b[i++];
		}
		return c;
	}

}
