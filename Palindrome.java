package practice.copy;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,rev="";
		System.out.println("Enter the string");
		s=sc.nextLine();
		int length=s.length();
		for(int i=length-1;i>=0;i--);
		rev=rev+s.charAt(i);
		if(s.equals(rev)) 
		System.out.println(s+"it is a palindrome");
		else
			System .out.println(s+"It is not a palindrome");
		}
	
}