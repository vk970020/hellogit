package workflow;

public class ram {
	
		public static void main(String[] args) {
			printTwo();
			printTwo();
			printThree();
		}

		public static void printTwo() {
			System.out.println("Hello World");
		}

		public static void printThree() {
			printTwo();
			printTwo();
		}
	}

