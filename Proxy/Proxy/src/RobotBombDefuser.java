public class RobotBombDefuser implements IRobot {

	private int robotConfiguredWave = 42;
	private boolean isConnected = false;

	public void connectWireless(int waveLenght) {
		if (waveLenght == 42) {
			isConnected = true;
		}
	}

	public boolean isConnected() {
		return isConnected;
	}

	public void walkStreight(int steps) {
		System.out.println("Did" + steps + "steps forward...");
	}

	public void turnLeft() {
		System.out.println("Turned left...");
	}

	public void turnRight() {
		System.out.println("Turned right...");
	}

	public void defuseBomb() {
		System.out.println("Cut wire...and BOOO");
	}

}