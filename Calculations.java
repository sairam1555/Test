package practice.copy;
import java.util.Scanner;
public class Calculations {

	public static void main(String[] args) {
		int x,y,c,d,e,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		c=x+y;
		d=x-y;
		e=x*y;
		f=y/x;
		System.out.println("THe addition value is:"+c);
		System.out.println("THe subtraction value is:"+d);
		System.out.println("THe multipication  value is:"+e);
		System.out.println("THe division value is:"+f);
	}

}
