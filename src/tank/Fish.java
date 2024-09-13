package tank;

public abstract class Fish extends Organism {
	
	protected int max_speed;
	protected int aceleration;
	protected int current_speed;
	protected int hungerLevel;
	
	public Fish() {
		super();
		this.max_speed = (int) (Organism.MAX_SPEED*Math.random());	// random speed in instantiation 
		this.aceleration = (int) (Organism.MAX_ACEL*Math.random());	// random acel in instantiation 
		this.hungerLevel = 0; //MAX 100;
	}
	
	protected void die() {
		if(this.energy == 0) {
			this.alive = false;
			System.out.println(this.nome + " morreu :(");
		}
	}
	
	protected void acelerate() {
		if(this.current_speed == 0) {
			while (this.current_speed < max_speed) {
				this.current_speed+=aceleration;
			}
		}
	}
	
	protected void swim(float direction) {
		int dx = (int) (this.current_speed*Math.cos(direction));
		int dy = (int) (this.current_speed*Math.sin(direction));
		this.position.move(dx, dy);
	}
	
	protected abstract void hunt();
}
