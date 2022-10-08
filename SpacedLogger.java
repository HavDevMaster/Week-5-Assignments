package Week5;

import java.util.Scanner;

import Week5.App.Logger;

public class SpacedLogger implements Logger{
	static Scanner x = new Scanner(System.in);
	static String userWord2 = x.next();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		

	}
	public void Log() {
		System.out.println();
		char character = 0;
		for (int i = 0; i < userWord2.length(); i++) { 
			character = userWord2.charAt(i);
			System.out.print(character + " ");
		}
			
		 System.out.println();
	}
	public void Error() {
		System.out.println();
		System.out.print("ERROR: ");
		char character = 0;
		for (int i = 0; i < userWord2.length(); i++) { 
			character = userWord2.charAt(i);
			System.out.print(character + " ");
		}
			
		 System.out.println();
		
		
	}
}
