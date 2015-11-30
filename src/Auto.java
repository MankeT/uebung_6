
public class Auto {
	public double kilometerstand;
	public double tankinhalt = 40;
	public double benzinverbrauch;
	public double weite;

	public void fahre(double kilometer) {
		
		benzinverbrauch = kilometer * 0.1;
		weite = (tankinhalt/benzinverbrauch)*kilometer;
		
		System.out.println("Reichweite des Autos mit dem Tank: " + weite + " km.");
		System.out.println("Benzinverbrauch für die zu fahrenden Kilometer: " + benzinverbrauch);
		
		if(tankinhalt >= 0) {
			kilometerstand = kilometerstand + kilometer;
			double resttank = tankinhalt - benzinverbrauch;
			double restkilometer = weite - kilometer;
			System.out.println("Ihr restlicher Tank beträgt " + resttank + " Liter. Sie können noch " + restkilometer + " km fahren.");}
		
			else {kilometerstand = weite; 
			double resttank = benzinverbrauch - tankinhalt; 
			double restkilometer = kilometer - weite;
			System.out.println("Sie können maximal " + kilometerstand + " km fahren.");
			System.out.println("Bitte tanken sie " + resttank + " Liter nach, um Strecke von " + restkilometer + " km zurücklgen zu können.");
			
		}
		
		tankinhalt = tankinhalt - (kilometer * 0.1);
	
		
		/*if(resttank <= 0) {
			tanken(liter);
		}*/
	}
	
	/*public void tanken(int liter) {
		
		double tankinhalt = tankinhalt + liter;
		
	}*/
		

	public static void main(String[] args) {
		Auto testauto = new Auto();
		for (int i = 0; i < 3; i++) {
			testauto.fahre(Zufall.getZufallInt(1, 1000));
		System.out.println("Zu fahrene Strecke des Autos A sind " + testauto.kilometerstand + " km.");}
		System.out.println("    a ");
		
	}

}
