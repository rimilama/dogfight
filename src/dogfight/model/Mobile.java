package dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile {
	
	// Ajout variables
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private String image;
	private Image notreImage;
	
	// Différentes méthodes

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
		this.image = image;
	}
	
	
	public Direction getDirection(){
		return this.direction;
	}
	
	
	public void setDirection(Direction direction){
		this.direction = direction;
		
	}
	
	
	public Point getPosition(){
		return new Point();
		
		
	}
	
	
	public Dimension getDimension(){
		return this.dimension;
	}
	
	
	public int getSpeed(){
		return this.speed;
	}
	
	
	public int getWidth(){
		return this.dimension.getWidth();
	}
	
	public int getHeight(){
		return this.dimension.getHeight();
	}
	
	public void move(){
		
		
	}
	
	
	public void placeInArea(IArea area){
		
	}
	
	
	public boolean isPlayer(int player){
		return false;
		
	}
	// prends en
	
	private void moveUp(){
		
	}
	
	private void moveRight(){
		
	}	
	
	private void moveDown(){
		
	}	
	
	private void moveLeft(){
		
	}
	
	
	
	public Color getColor(){
		return null;
	}
	
	public IDogfightModel getDogfightModel(){
		return null;
	}
	
	public void setDogfightModel(IDogfightModel dogfightModel){
	}
	
	public boolean hit(){
		return false;
	}
	
	public boolean isWeapon(){
		return true;
	}
	
	public Image getImage(){
		return this.notreImage;
		
	}

	
	
}
