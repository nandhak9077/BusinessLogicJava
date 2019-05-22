
public class Main1 
{
	public static void main(String[] args) 
	{
		Matrix mt = new Matrix();
		int a[][]= {{1,2,3,4},{5,6},{7,8,9}};
		int b[][]= {{1,2,3,4},{5,6},{7,8,9}};
		System.out.println("A elements : ");
		mt.dispMat(a);
		System.out.println("B elements : ");
		mt.dispMat(b);
	}
}