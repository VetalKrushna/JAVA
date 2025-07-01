import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Gadi extends Applet implements ActionListener,Runnable,MouseListener
{
	Thread th;
	int x,y,x1,x2,y1,y2;
	Button b1,b2,b3,b4,b5,b6;
	Label l1,l2;
	@Override
	public void init() 
	{
		setLayout(new FlowLayout());
		 th=new Thread(this);
		 x=1;
		 y=200;

		
		 b2=new Button("Stop");
		 b1=new Button("Start");
	
		 add(b1);add(b2);
		 l1=new Label("Pressed pos of X and Y : ");
		 add(l1);
		 l2=new Label("Release pos of X and Y: ");
		 add(l2);	
			
	 addMouseListener(this);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		
	}
	@Override
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		
		
	}
	public void mouseEntered(MouseEvent me)
	{}
	public void mouseExited(MouseEvent me)
	{}
	public void mouseReleased(MouseEvent me)
	{
		 x2=me.getX();
		 y2=me.getY();
		 l2.setText("Released X="+x2+" and Y="+y2);
		  

	}
	public void mousePressed(MouseEvent me)
	{
		
		 x1=me.getX();
		 y1=me.getY();
		 l1.setText("Pressed  X="+x1+" and Y="+y1);
	}

	public void actionPerformed(ActionEvent ae)
	 {
		 if(ae.getSource()==b1)
		   {
		      th.start();
		   
		      repaint();
		   }
		 if(ae.getSource()==b2)
		   {
		      th.stop();
		   }
		
	 }
	public void run()
	 {
	  while(true)
	  {
		  try
		  {
			  th.sleep(10);
			  x=x+8;
			  repaint();
		  }catch(Exception e){}
	  }
	 }

	@Override
	public void paint(Graphics g) 
	{
		g.drawLine(3,258,1901,258);
		g.setColor(Color.yellow);
		g.fillOval(x+100,225,157,24);
		g.setColor(Color.red);
		 g.fillRect(x, y, 100, 50);
		 g.setColor(Color.black);
		 g.fillOval(x+10, y+40, 20, 20);
		 g.fillOval(x+60, y+40,20,20);

	}

}
