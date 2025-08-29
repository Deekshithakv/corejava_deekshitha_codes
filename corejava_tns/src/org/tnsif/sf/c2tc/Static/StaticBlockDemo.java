package org.tnsif.sf.c2tc.Static;
class Game{
	static int maxlevel;
	static {
		System.out.println("initializing the game settings");
		maxlevel = 100;
	}
	void levelshowinfo() {
		System.out.println("game has   "+ maxlevel+" levels");
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g1 = new Game();
		g1.levelshowinfo();

	}

}
