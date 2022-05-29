package vh;

public class Velo extends Vehicule {
int hauteurChaise;
	@Override
	public void rouler() {
		// TODO Auto-generated method stub
		System.out.print("je roule à la pédale");

	}
	public int getHauteurChaise() {
		return hauteurChaise;
	}
	public void setHauteurChaise(int hauteurChaise) {
		this.hauteurChaise = hauteurChaise;
	}
	
	

}
