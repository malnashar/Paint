package eg.edu.alexu.csd.oop.draw.cs21_cs44;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Line extends Shapes {
@Override
public void setPosition(Point position) {
	int diffX=position.x-getProperties().get("cX").intValue();
	int diffY=position.y-getProperties().get("cY").intValue();
	
	getProperties().put("cX",(double) position.x);
	getProperties().put("cY",(double) position.y);
	
	getProperties().put("pointAX", getProperties().get("pointAX")+diffX);
	getProperties().put("pointAY", getProperties().get("pointAY")+diffY);
	
	getProperties().put("pointBX", getProperties().get("pointBX")+diffX);
	getProperties().put("pointBY", getProperties().get("pointBY")+diffY);
}

@Override
	public void draw(Graphics canvas) {
	Map<String,Double>temp;
	temp=getProperties();
	
	Color color=new Color(temp.get("borderColor").intValue());
	canvas.setColor(color);
	canvas.drawLine(temp.get("pointAX").intValue(), temp.get("pointAY").intValue(), temp.get("pointBX").intValue(), temp.get("pointBY").intValue());
	}
}
