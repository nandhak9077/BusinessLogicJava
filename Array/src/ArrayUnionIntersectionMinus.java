
public class ArrayUnionIntersectionMinus 
{
	int[] Union(int[] a, int[] b)
	{
		int[] u1 = new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			u1[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			int find=1;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==b[i])
				{	
					find=0;
					break;
				}
			}
			if(find==1)
			{
				u1[k++]=b[i];
			}
		}
		int[] u2 = new int[k];
		for(int i=0;i<k;i++)
		{
			u2[i]=u1[i];
		}
		return u2;
	}
	
	int[] Intersection(int[] a,int[] b)
	{
		int[] i1 = new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					i1[k]=a[i];
					k++;
					break;
				}
			}
		}
		
		int[] i2 = new int[k];
		for(int i=0;i<k;i++)
			i2[i]=i1[i];
		return i2;
	}
	
	int[] Minus(int[] a,int[] b)
	{
		int[] m1 = new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			int find=1;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					find = 0;
					break;
				}
			}
			if(find==1)
			{
				m1[k]=a[i];
				k++;
			}
		}
		
		int[] m2 = new int[k];
		for(int i=0;i<k;i++)
			m2[i]=m1[i];
		return m2;
	}
}