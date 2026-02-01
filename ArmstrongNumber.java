package com.rakhi;
import java.util.*;
/*
 * Armstrong Number is a number that equals the sum 
 * of its own digits to the power of the Number of digits.\
 *
 * -->153 is an Armstrong number because
 * 1 power 3 + 5 power 3 + 3 power 3 = 1 + 125 + 27 = 153
 * 
 * --> 12 is Not
 * 1 power 2 + 2 power 2 = 1 + 4 = 5 Not Equal 12
 * 
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		if(CheckArmStrongNumber(n))
		{
			System.out.println(n + " is a Armstrong Number");
		}
		else
		{
			System.out.println(n + " is a Not Armstrong Number");
		}
	}
	static boolean CheckArmStrongNumber(int n)
	{
		int original = n;
		int digits = String.valueOf(n).length();// Count digits
		int sum=0;
		
		while(n>0)
		{
			int digit = n%10; // Extract The last digit
			//sum += digit * digit * digit; // Cube for simplicity (assumes 3 digits)
			sum += Math.pow(digit, digits); // // Add digit^digits to sum
			n/=10;                       // Remove the last Digit
		}
		return sum==original;  // Check if sum equals original number
	}

}
