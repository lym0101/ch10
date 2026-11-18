public class Fraction {
	//instance variable (attributes, fields)
	private int numerator, denominator;
	
	//Constructor
	public Fraction () { //default
		setNum(1);
		setDenom(1);
	}
	
	public Fraction (String s) {
		int index = s.indexOf("/") + 1;
		setNum(Integer.parseInt(s.substring(0,index)));
		setDenom(Integer.parseInt(s.substring(index + 1)));
		System.out.println("Fraction Created: " + numerator + "/" + denominator);
	}
	
	public Fraction (Fraction f) {
		numerator = f.numerator;
		denominator = f.denominator;
	}
	
	
	public Fraction (int n, int d) { // parameterized constructor
		numerator = n;
		if (d != 0) 
			denominator = d;
		else {
			denominator = 1;
			System.out.println("Error: Denominator can't be zero");
		}
	}
	
	//Behaviour methods(accessor,mutator, helper)
	public int getNum() {
		return numerator;
	}
	public int getDenom() {
		return denominator;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	public double toDouble(){
		return (int)numerator / denominator;
	}
	
	//mutator methods
	public void setNum(int n) {
		numerator = n;
	}
	public void setDenom(int d) {
		if (d != 0) 
			denominator = d;
		else {
			denominator = 1;
			System.out.println("Error: Denominator can't be zero");
		}
	}
}
