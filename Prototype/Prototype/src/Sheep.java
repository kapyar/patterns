public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep is made");
	}

	@Override
	public Animal makecopy() {
		System.out.println("Sheep is been made");

		Sheep sheepClone = null;

		try {
			sheepClone = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sheepClone;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dolly is my hero baaaaaeeee";
	}
}