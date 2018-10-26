package qsp;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the name of first player");
		String fname= s.next();
		System.out.println(fname + " Please enter any key to start the game");
		s.next();
		int fno= r.nextInt(6)+1;
		
		

	}

}
