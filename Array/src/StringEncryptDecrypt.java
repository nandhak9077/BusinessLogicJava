import java.util.Scanner;

public class StringEncryptDecrypt 
{
	String Encrypt(String st)
	{
		char c[] = st.toCharArray();
		st="";
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			while(i<c.length && c[i]==c[i+1])
			{
				count++;
				i++;
				break;
			}
			st = st+count+c[i];
		}
		return st;
	}
	
	String Decrypt(String st)
	{
		char c[] = st.toCharArray();
		st="";
		for(int i=0;i<c.length;i++)
		{
			int no=0;
			while(i<c.length && c[i]>=44 && c[i]<=57)
			{
				no=no*10+(c[i]-48);
				i++;
			}
			while(no>0)
			{
				st=st+c[i];
				no--;
			}
		}
		return st;
	}
	
	public static void main(String[] args) 
	{
		StringEncryptDecrypt sed = new StringEncryptDecrypt();
		System.out.print("Enter the string : ");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String e = sed.Encrypt(st);
		String d = sed.Decrypt(e);
		System.out.println("Original string : "+st);
		System.out.println("Encrypted string : "+e);
		System.out.println("Decrypted string : "+d);
		s.close();
	}
}