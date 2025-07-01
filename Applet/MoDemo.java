import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
public class MoDemo extends Frame implements MouseListener
{
	Label l1,l2,l3;
	int x,y,x1,x2,y1,y2;
	MoDemo()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		l1=new Label("Possition of X and Y: ");
		add(l1);
		l2=new Label("Press of X and Y: ");
		add(l2);
		//l3=new Label("Released of X and Y: ");
		
		
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		l1.setText("Pos of X="+x+" and Y="+y);
		
	}
	public void mouseEntered(MouseEvent me)
	{}
	public void mouseExited(MouseEvent me)
	{}
	public void mouseReleased(MouseEvent me)
	{
		 x2=me.getX();
		 y2=me.getY();
		  repaint();

	}
	public void mousePressed(MouseEvent me)
	{
		
		 x1=me.getX();
		 y1=me.getY();

	}
	public static void main(String[] args) {
		new MoDemo();
	}

}
