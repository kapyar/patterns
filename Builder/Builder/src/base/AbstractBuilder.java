package base;
public abstract class AbstractBuilder {

	protected Laptop laptop;

	public void createLaptop() {
		laptop = new Laptop();
	}

	public Laptop getMyLaptop() {
		return laptop;
	}

	public abstract void setCpus();

	public abstract void setName();

}