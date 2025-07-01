package awt;
import java.awt.*;
import java.awt.event.*;

public class P1 extends Frame implements ItemListener 
{
	Checkbox c1,c2,c3,c4,ca1,ca2,ca3,ca4;
	CheckboxGroup cg1,cg2;
	
	P1()
	{
		setVisible(true);
		setBackground(Color.cyan);
		setSize(500,200);
		setLayout(new GridLayout(1,2));
		
		cg1=new CheckboxGroup();
		cg2=new CheckboxGroup();
		c1=new Checkbox("India",cg1,true);
		c2=new Checkbox("Nepal",cg1,false);
		c3=new Checkbox("China",cg1,false);
		c4=new Checkbox("France",cg1,false);
		
		ca1=new Checkbox("Katmandu",cg2,false);
		ca2=new Checkbox("Paris",cg2,false);
		ca3=new Checkbox("Delhi",cg2,false);
		ca4=new Checkbox("Beijing",cg2,false);
		
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,1));
	   	p.add(c1);	p.add(c2);	p.add(c3);	p.add(c4);
	   	

		Panel p2=new Panel();
		p2.setLayout(new GridLayout(4,1));
	   	p2.add(ca1);	p2.add(ca2);	p2.add(ca3);	p2.add(ca4);
	   	add(p);  add(p2);
	   	
	   	c1.addItemListener(this);
	   	c2.addItemListener(this);
	   	c3.addItemListener(this);
	   	c4.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			ca3.setState(true);
		}
		
		if(ie.getSource()==c2)
		{
			ca1.setState(true);
		}

		if(ie.getSource()==c3)
		{
			ca4.setState(true);
		}
		
	 if(ie.getSource()==c4)
	  {
		ca2.setState(true);
	  }

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P1();
	}

}
