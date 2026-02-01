
import java.util.*;
public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		checkpalindrome(n);
	
	}
	static void checkpalindrome(int n)
	{
		
		int originalnumber = n;
		int reversednumber = 0;
		while(n!=0)  // or while(n>0)
		{
			int digit = n%10;
			reversednumber = reversednumber*10+digit;
			n /=  10;
		}
		if(originalnumber == reversednumber)
		{
			System.out.println(originalnumber + " is a palindrome number");
		}
		else
		{
			System.out.println(originalnumber + " is not a palindrome number");
		}
	}
}
