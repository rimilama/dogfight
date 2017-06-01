package dogfight.model;

public class Missile {
	
	// Ajout variables
	private static final int SPEED = 4;
	private static final int WIDTH = 30;
	private static final int HEIGHT = 10;
	private static final int MAX_DISTANCE_TRAVELED = 1400;
	private static final String IMAGE = "Missile";
	private int distanceTraveled = 0;

	
	
	
	// Différentes méthodes
	
	public Missile(Direction direction, Dimension dimension){
		dimension = new Dimension(dimension);
	}
	
	
	public static int getWidthWithADirection(Direction direction){
		return 0;
		
		
	}

	public static int getHeightWithADirection(Direction direction){
		return 0;
		
	}
	
	public void move(){
		
	}
	
	public boolean isWeapon(){
		
		return true;
	}
	
}
