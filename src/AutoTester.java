
public class AutoTester {

	public static void main(String[] args) {
		Auto autoA = new Auto();
		Auto autoB = new Auto();
		for (int i = 0; i < 3; i++) {
			autoA.fahre(Zufall.getZufallInt(1, 100));
			autoB.fahre(Zufall.getZufallInt(1, 100));
			System.out.println("Gefahrene Strecke des Autos A " + autoA.kilometerstand + " km"+ ", nach Fahrt " + i);
			System.out.println("Gefahrene Strecke des Autos B " + autoB.kilometerstand + " km"+ ", nach Fahrt " + i);
		}
		
		
	}
}
