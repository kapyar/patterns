package base;

public class Laptop {

	private int cpus;
	private String name;

	public int getCpus() {
		return cpus;
	}

	public void setCpus(int cpus) {
		this.cpus = cpus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "New computer " + name + " is ready: cpus - " + cpus;
	}

}