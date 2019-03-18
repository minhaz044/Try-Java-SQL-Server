
public class Calculation {
	
	public double x,y;
	
	public Calculation(double x,double y) {
		this.x=x;
		this.y=y;
		
	}
	
	
	public double add() {
		return this.x+this.y;
	}
	public double sub() {
		return this.x-this.y;
	}
	public double mul() {
		return this.x*this.y;
	}
	public double div() {
		return this.x/this.y;
	}

}
