package qsp;

import java.util.Scanner;

public class De {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to find it is even or not: ");
		int n=input.nextInt();
		if(n%2==0) {
			System.out.println(n+" is even number.");
		}
		else {
			System.out.println(n+" is odd number.");
		}
		System.exit(0);

	}

}
