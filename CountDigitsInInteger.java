import java.util.*;
public class CountDigitsInInteger {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		countdigits(n);
	}
	static void countdigits(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;// Remove the digit one after one
			count++;
		}
		System.out.println(count);
	}

}
