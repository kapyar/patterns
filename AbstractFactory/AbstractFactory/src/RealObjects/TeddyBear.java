package RealObjects;

import InterfacesThings.Bear;

public class TeddyBear implements Bear {

	@Override
	public Bear getBear() {

		return new TeddyBear();
	}

	@Override
	public String toString() {

		return "I'm Teddy Bear hug me :*";
	}

}
