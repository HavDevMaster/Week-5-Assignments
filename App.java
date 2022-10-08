package Week5;

public class App {
	
	

	interface Logger {
	public void Log();
	public void Error();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userInterface1();
		AsteriskLogger userWord = new AsteriskLogger();
		userWord.Log();
		userWord.Error();
		userInterface2();
		SpacedLogger userWord2 = new SpacedLogger();
		userWord2.Log();
		userWord2.Error();
	}
	public static void userInterface1() {
		System.out.println("Enter AsteriskLogger String:");
		}
	public static void userInterface2() {
		System.out.println("Enter SpacedLogger String:");		
	}
}

