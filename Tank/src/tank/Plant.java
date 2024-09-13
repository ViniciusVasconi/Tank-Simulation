package tank;

import java.util.Scanner;

public class Plant extends Organism{
	
	int growRate;
	
	public Plant(int gR) {
		Scanner scan = new Scanner(System.in);
		position.setX(scan.nextInt());
		position.setY(0);
		this.energy = 100;
		scan.close();
		this.growRate = gR;
	}
	
	public void grow() {
		for (int i = 0; i < 100 - growRate; i++) {
			if(this.energy >= 80) System.out.println("Im growing!!");
		}
	}
	
	public void photosynthesize() {
	        this.energy += 10;  
	        System.out.println("Energia após fotossíntese: " + this.energy);
	}
	
	protected void die() {
		if(this.energy == 0) {
			this.alive = false;
			System.out.println(this.nome + " morreu :(");
		}
	}
}
