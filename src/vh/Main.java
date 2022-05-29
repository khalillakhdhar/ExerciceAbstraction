package vh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Velo v=new Velo();
		v.demarrer(" el Manzel");
		v.rouler();
		v.stopper(1200, 1000);
		Voiture vo=new  Voiture();
		vo.demarrer(" Sfax");
		vo.rouler();

	}

}
