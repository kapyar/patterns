public class CarDecorator extends Car {
	protected Car decoratedCar;

	public CarDecorator(Car car) {
		decoratedCar = car;
	}

	@Override
	public void go() {
		decoratedCar.go();
	}

}
