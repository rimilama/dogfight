package gameframe;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

import dogfight.view.GraphicsBuilder;

public interface IGraphicsBuilder {

	public void applyModelToGraphic(Graphics graphics, ImageObserver observer);
	
	public int getGlobalWidth();
	
	public int getGlobalHeight();
	
}
