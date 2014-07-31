import ConcreateBuilders.BuisnessTripCompBuilder;
import ConcreateBuilders.GameCompBuilder;
import base.SalePerson;

public class Main {

	public static void main(String[] args) {
		SalePerson saler = new SalePerson();
		BuisnessTripCompBuilder tripBuilder = new BuisnessTripCompBuilder();
		GameCompBuilder gameBuilder = new GameCompBuilder();

		saler.setBuilder(gameBuilder);
		saler.buildComp();
		System.out.println(saler.getReadyLaptop());

		saler.setBuilder(tripBuilder);
		saler.buildComp();
		System.out.println(saler.getReadyLaptop());
	}

}
