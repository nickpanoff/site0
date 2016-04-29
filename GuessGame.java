public class GuessGame {
    Player p1;
    Player p2;
    Player p3; 

    public void startGame() {
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();

	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0; 

	boolean p1isright = false;
	boolean p2isright = false;
	boolean p3isright = false; 

	int targetNumber = (int) (Math.random() * 10);
	System.out.println("GREAT COSMIC BRAIN GUESS NUMBER");

	while(true) {
	    System.out.println("AND THIS NUMBER IS, - " + targetNumber);

	    p1.guess();
	    p2.guess();
	    p3.guess();

	    guessp1 = p1.number;
	    System.out.println("1-ST VICTIM THINK IT WAS " + guessp1);
	    guessp2 = p2.number;
	    System.out.println("2-ND VICTIM THINK IT WAS " + guessp2);
	    guessp3 = p3.number;
	    System.out.println("3-RD VICTIM THINK IT WAS " + guessp3);

	    if (guessp1 == targetNumber) {
		p1isright = true;
	    }
	    if (guessp2 == targetNumber) {
		p2isright = true;
	    }
	    if (guessp3 == targetNumber) {
		p3isright = true;
	    }
	    if (p1isright || p2isright || p3isright) {
		System.out.println("1 - " + p1isright + ", 2 - " + p2isright + ", 3 - " + p3isright);
		System.out.println("THIS.IS.THE.END.");
		break;

	    } else {
		System.out.println("YOU'RE WRONG! NEXT DYING VICTIMS!");
	    }
	}
    }
}

public class Player {
    int number = 0;
    public void guess() {
	number = (int) (Math.random() * 10);
	System.out.println("I SHALL ASSUME, YOUR HIGHNESS, THAT'S NUMBER IS " + number);
    }
}

public class GameLauncher {
    public static void main (String[] args) {
	GuessGame game = new GuessGame();
	game.startGame();
    }
}
