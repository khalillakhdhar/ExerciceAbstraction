package vh;

public class Voiture extends Vehicule {
private int cylindre;
private int chevaux;

	@Override
	public void rouler() {
		// TODO Auto-generated method stub
		System.out.println("je roule grace au moteur");
		
	}

	public int getCylindre() {
		return cylindre;
	}

	public void setCylindre(int cylindre) {
		this.cylindre = cylindre;
	}

	public int getChevaux() {
		return chevaux;
	}

	public void setChevaux(int chevaux) {
		this.chevaux = chevaux;
	}
	

}
