
public class AmbulanceCar extends CarDecorator {

	public AmbulanceCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void go() {
		// TODO Auto-generated method stub
		super.go();
		System.out.println("Beep - beep");
	}

}
