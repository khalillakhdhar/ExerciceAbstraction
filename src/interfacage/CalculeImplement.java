package interfacage;

public class CalculeImplement implements CalculeInterface {
private int a,b;
	@Override
	public int somme() {
		// TODO Auto-generated method stub
		return this.a+this.b;
	}

	@Override
	public int produit() {
		// TODO Auto-generated method stub
		return this.a*this.b;
	}

	@Override
	public void divise() {
		// TODO Auto-generated method stub
		if(this.a%this.b==0)
		{
			System.out.println(this.b+" divise "+this.a);
			
		}
		else
		{
			System.out.println(this.b+" ne divise pas "+this.a);
			
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public CalculeImplement(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public CalculeImplement() {
		super();
	}

	@Override
	public String toString() {
		return "CalculeImplement [a=" + a + ", b=" + b + ", somme()=" + somme() + ", produit()=" + produit() + "]";
	}
	
	

}
