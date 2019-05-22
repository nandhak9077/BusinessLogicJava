import java.util.Scanner;

public class Date 
{
	int dd,mm,yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%4==0&&yy%100!=0||yy%400==0)
			month[2]=29;
	}
	int countNumberOfDays()
	{
		int days=0;
		int y =yy-1;
		days=y*365;
		days=days+(y/4-y/100+y/400);
		for(int i=1;i<mm;i++)
		{
			days=days+month[i];
		}
		days=days+dd;
		return days;
	}
	static Date readDate()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("[dd mm yy] ");
		int dd = s.nextInt();
		int mm = s.nextInt();
		int yy = s.nextInt();
		return new Date(dd,mm,yy);
	}
	@Override
	public String toString() 
	{
		return " [" + dd + "/" + mm + "/" + yy + "] ";
	}
	
}