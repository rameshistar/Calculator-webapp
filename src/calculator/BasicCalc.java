package calculator;


public class BasicCalc
{
	// include variables a, b, c here
	 
	//include getters and setters method to access variables
	
	//include methods for operations
	double a,b,c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}
	

	public void setC(double c) {
		this.c = c;
	}
	//home...
	double add(){
		c=a+b;
		return (c);
		
	}
	
	double subtract(){
		c=a-b;
		return (c);
		
	}
	double multiply(){
		c=a*b;
		return (c);
		
	}
	double divide(){
		c=a/b;
		return (c);
		
	}
}