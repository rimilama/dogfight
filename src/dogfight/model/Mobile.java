package dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile {
	
	// Ajout variables
	private int speed;

	// Différentes méthodes

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		
	}
	
	
	public Direction getDirection(){
		return null;
	}
	
	
	public void setDirection(Direction direction){
		
		
	}
	
	
	public Point getPosition(){
		return null;
		
		
	}
	
	
	public Dimension getDimension(){
		return null;
	}
	
	
	public int getSpeed(){
		return 1;
	}
	
	
	public int getWidth(){
		return 1;
	}
	
	public int getHeight(){
		return 1;
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
		return null;
		
	}

	
	
}
