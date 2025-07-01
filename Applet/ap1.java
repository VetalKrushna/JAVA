
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class ap1 extends Applet 
{
	@Override
	public void init() 
	{
		start();
	}		
	@Override
	public void paint(Graphics g) 
	{
		
		g.drawString("HIII",100,20);
		g.drawOval(100, 100, 200, 200);
		g.drawLine(200, 100, 100,50);
		g.setColor(Color.cyan);
		g.fillRect(100, 400, 200, 100);
	}
}
