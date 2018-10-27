package qsp;

import java.util.Random;
import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class GuessGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the name of first player");
		String fname= s.next();
		System.out.println("Enter the name of second player");
		String sname= s.next();
		int fcount=0, scount=0;
		while(true) {
			System.out.println(fname + " enter any key from the keyboard");
			s.next();
		int fno=	r.nextInt(100);
		if (fcount<fno) 
			fcount= fcount+fno;
		
		if (fcount<=100)
			System.out.println(fcount + " Score");
			

		System.out.println("................................");
		
		
		System.out.println(sname + " enter any key from the keyboard");
		s.next();
	int sno=	r.nextInt(100);
	if (scount<sno) 
		scount= scount+sno;
	
	if (scount<=100)  
		System.out.println(scount + " Score");
	if (fcount>scount)
		System.out.println(fname + " won the match");
	else
		System.out.println(sname + " won the game");
	break;
	
		}
}

}
