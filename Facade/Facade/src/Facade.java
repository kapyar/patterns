public class Facade {

	private Bakery bakery = new Bakery();
	private SaladBar saladBar = new SaladBar();

	public double buyDinner() {
		return bakery.buy() + saladBar.buy();

	}

}
