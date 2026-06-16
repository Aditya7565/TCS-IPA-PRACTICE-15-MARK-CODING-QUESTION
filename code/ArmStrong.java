/*
Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/

import java.util.*;
class ArmStrong {
	public static void checkArmStrong(int number){
		int num=number;
		int n=String.valueOf(num).length();
		int nn=0;
		while(num>0){
			int dig=num%10;
			nn+=Math.pow(dig,n);
			num/=10;

		}
		if(nn==number){
			System.out.println("Yes, the number is an Armstrong number.");
		}
		else{
			System.out.println("No, the number is not an Armstrong number.");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number ");
		int n=sc.nextInt();
		checkArmStrong(n);

	}
}