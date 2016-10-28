package pepparkaksFabrik;

public class PepparkaksFabrik {

	public static int antal;
	public static double utgift;
	public static double kassaTotal;
	
	// public static void main(String[] args) {
	public void salj (int antalAttSalja) {
		double vinst = (antalAttSalja * 6);
		if (antal>antalAttSalja){
			antal=antal - antalAttSalja;
			kassaTotal = kassaTotal + vinst;
		}	else
			System.out.println("Det finns bara " + antal + "pepparkakor kvar. Du får baka först!");
	}
	
		public void baka (int antalAttBaka) {
			antal = antal + antalAttBaka;
			utgift = antalAttBaka * 3.5;
			kassaTotal = kassaTotal - utgift;
		}
	}


