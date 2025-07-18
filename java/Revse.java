// Given an integer num, reverse the number and return the answer using different approaches.

// approach 1: Using a while loop to reverse the number,
import java.util.Scanner;
 public class Revse {
		// public static void main(String[] args) {
		// Scanner d = new Scanner(System.in);
		// System.out.println("Enter a number to reverse:");
		// int n = d.nextInt();
		// int reversed = 0;

		// while(n != 0){
		// 	int num = n % 10;
		// 	reversed = reversed * 10 + num;
		// 	n = n / 10; 
		// }
		// System.out.println("Reversed number is:" + reversed);
		// d.close();
		// }

// appraoch 2: using an iterative method to reverse the number.

// 	public static int reverse(int num){
// 		int reversed = 0;
// 		while(num != 0){
// 			int digit = num % 10;
// 			reversed = reversed * 10 + digit;
// 			num = num / 10; 
// 		}
// 		return reversed;
// 	}


// approach 3: using recursion to reverse the number.
	public static int reverseNum(int num, int reversed){
		if(num == 0){
			return reversed;
		}
		int digit = num % 10;
		return reverseNum(num / 10, reversed * 10 + digit);
	}
	public  static int reverse(int  num){
		return reverseNum(num, 0);
	}

	// approach 4: using a main method to take input and call the reverse method.
			public static void main (String [] args){
			Scanner d = new Scanner(System.in);
			System.out.println("Enter a number to reverse:");
			int num = d.nextInt();
			System.out. println("Reversed number is: " + reverse(num));
			d.close();
		}

	}

