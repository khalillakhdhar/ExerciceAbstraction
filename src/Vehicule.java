
public abstract class Vehicule {
	private int roues; private String marque;


	public int getRoues() {
		return roues;
	}


	public void setRoues(int roues) {
		this.roues = roues;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}
	public abstract void rouler();
	public void stopper(int x, int y)
	{
		System.out.println("je stoppe à "+x+ " "+y);
	}
	public void demarrer()
	{
		System.out.println("on y va");
	}

}
