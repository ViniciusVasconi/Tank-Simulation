package tank;
import java.util.Scanner;

public abstract class Organism {
	
	public static final int MAX_SPEED = 10;
	public static final int MAX_ACEL = 5; // tem que ser múltiplo de MAX_SPEED
	public static final int MAX_DAMAGE = 20; 
	
	protected boolean alive = true;
	Coordinate position;
	int energy;
	String nome;
	
	public Organism() {
		Scanner scan = new Scanner(System.in);
		position.setX(scan.nextInt());
		position.setY(scan.nextInt());
		this.energy = 100;
		scan.close();
	}
	
	protected abstract void die();
	
}
