public class FractionDriver {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 4);
		Fraction f2 = new Fraction(1, 2);

		System.out.println(f1);
		System.out.println(Fraction.mult(f1, f2));

		System.out.println(Fraction.add(f1, f2));
		System.out.println(Fraction.divide(f1, f2));
		System.out.println(Fraction.subtract(f1, f2));

		Fraction a = new Fraction(); 
		Fraction b = new Fraction("3/4"); 
		System.out.println(b); 
		System.out.println(a);
		Fraction c = new Fraction(f1); 
		Fraction z = new Fraction(1, 0); 
		System.out.println(c);
		System.out.println(z);
		System.out.println(f1.toDouble());
		f1.setNum(6);
		f1.setDenom(8);
		f1.reduce();
		System.out.println(f1); // expect 3/4
		f1.setDenom(0); // expect error message
		System.out.println(f1.GCF(12, 18)); // expect 6
		System.out.println(Fraction.mult(new Fraction(2, 4), new Fraction(2, 3))); // shows the missing reduce
		System.out.println(Fraction.add(new Fraction(-1, 2), new Fraction(1, 3))); // negative numbers
	}
}
