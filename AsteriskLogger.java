package Week5;

import java.util.Scanner;

import Week5.App.Logger;

public class AsteriskLogger implements Logger {
	static Scanner x = new Scanner(System.in);
	static String userWord = x.next();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		

	}
	public void Log() {
		 System.out.println();
		 System.out.println("***" + userWord + "***");
		 System.out.println();
	}
	public void Error() {
		String sumAst = "*************";
		String asterisk = "*";
		for (int i = 0; i < userWord.length(); i++) {
			sumAst += asterisk;
		}
		System.out.println(sumAst);
		System.out.println();
		System.out.println("***Error: " + userWord + "***");
		System.out.println();
		System.out.println(sumAst);
		
		
	}
}
