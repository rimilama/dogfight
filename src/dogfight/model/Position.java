package dogfight.model;

public class Position {

	
	// Ajout variables
	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	
	
	// Différentes méthodes
	
	public Position (Position position){
		Position unePosition;
		unePosition = new Position(position);
		
		return;
	}
	
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}
	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}
	
	
	public Position(double x, double y, double maxX, double maxY){
		
	}
	
	

	
	
	
	
	
	
}
