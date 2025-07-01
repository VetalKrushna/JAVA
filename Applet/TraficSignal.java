
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.event.WindowAdapter;
public class TraficSignal extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	CheckboxGroup cg1;
	TextField t1,t2;
	Panel p1,p2;
	Label l1;
	int x1,y1,x2,y2;
	int r,gr,y;
	public void init() 
	{
		cg1=new CheckboxGroup();
		t1=new TextField(10);
		t2=new TextField(15);
		l1=new Label("Location:");
		c1=new Checkbox("RED",cg1,false);
		c2=new Checkbox("Yellow",cg1,false);
		c3=new Checkbox("Green",cg1,false);

		/*p1=new Panel();
		p2=new Panel();
		p2.setLayout(new GridLayout(1,1));
		p1.setLayout(new GridLayout(3,1));
		p1.setLocation(100, 200);
		p1.setSize(100,100);
		*/
		add(c1);add(c2);add(c3);add(t1);
		add(t1);
		add(l1);add(t2);
		
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		addMouseListener(new MouseAdapter()
	     {
		  public void mousePressed(MouseEvent me)
		  {
			  x1=me.getX();
			  y1=me.getY();
		  }
	     });
		addMouseListener(new MouseAdapter()
	     {
		  public void mouseReleased(MouseEvent me)
		  {
			  x2=me.getX();
			  y2=me.getY();
			  
			  t2.setText(""+x1+" "+y1+" "+(x2-x1)+" "+(y2-y1));
			  repaint();
		  }
	     });

	}
	 

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(c1.getState()==true)
		{
			t1.setText("Stop..");
			r=1;
		}
		else
			r=0;
		
		if(c2.getState()==true)
		{
			t1.setText("Ready..");
			y=1;
			
		}
		else
			y=0;
		
		if(c3.getState()==true)
		{
			t1.setText("GO..");
			gr=1;
		}
		else
			gr=0;
		repaint();
	}
	@Override
	public void paint(Graphics g) 
	{
		
		 g.fillRect(80,89,97,230);
		 g.fillRect(117,316,16,60);
		 g.fillRect(90, 367, 72,23);
		 
		 if(r==1)
		 {
            g.setColor(Color.red);
            g.fillOval(100, 100, 50, 50);
		 }
          else
          {
        	  g.setColor(Color.gray);
        	  g.fillOval(100, 100, 50, 50);
          }
		 
		 if(y==1)
		 {
            g.setColor(Color.yellow);
            g.fillOval(100, 175, 50, 50);
		 }
         else
         {
       	  g.setColor(Color.gray);
       	g.fillOval(100, 175, 50, 50);
         }
		 
		 if(gr==1)
		 {
            g.setColor(Color.green);
            g.fillOval(100, 250, 50, 50);
		 }
         else
         {
       	  g.setColor(Color.gray);
       	 g.fillOval(100, 250, 50, 50);
         }
	}
	
	
}
