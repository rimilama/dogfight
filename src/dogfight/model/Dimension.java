package dogfight.model;

public class Dimension {
	
	
	// Ajout variables

	private int width;
	private int height;
	
	
	
	// Diff�rentes m�thodes

	public Dimension(Dimension dimension) {
		dimension = new Dimension(dimension);
	}
	
	
	public int getWidth() {
		width = 1;
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		height = 1;
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	public Dimension(int width, int height) {

	}
	

	

}
