package dogfight.model;

public class Cloud extends Mobile {

	// Ajout variables
	private static final int SPEED = 1;
	private static final int WIDTH = 300;
	private static final int HEIGHT = 150;
	private static final String IMAGE = "cloud";
	private static Position position;


	// Différentes méthodes
	
	public Cloud(Direction direction, Dimension dimension){
		super(direction, position, dimension, SPEED, IMAGE);
	}
}
