package thiskeywords;

public class Thiskeywords2 {

	
		int x;
		// Constructor with a parameter
		public Thiskeywords2(int x) {
			System.out.println("Local variable x: "+x);
			System.out.println("Global variable x: "+this.x);
			this.x = x;
			System.out.println("Local variable x: "+x);
			System.out.println("Global variable x: "+this.x);
		}
 
		
		// Call the constructor
		public static void main(String[] args) {
			Thiskeywords2 myObj = new Thiskeywords2(45);
			System.out.println("Value of x = " + myObj.x);//		
		}
	}