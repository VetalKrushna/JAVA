package AWT;
import java.awt.*;
import java.awt.event.*;
public class TraficSig extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	CheckboxGroup cg1;
	TextField t1;
	public TraficSig() 
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		cg1=new CheckboxGroup();
		t1=new TextField(10);
		c1=new Checkbox("RED",cg1,false);
		c2=new Checkbox("Yellow",cg1,false);
		c3=new Checkbox("Green",cg1,false);

		add(c1);	add(c2);	add(c3);	add(t1);
		c1.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(c1.getState()==true)
		{
			t1.setText("Ready..");
		}
		if(c2.getState()==true)
		{
			t1.setText("Ready..");
		}
		if(c3.getState()==true)
		{
			t1.setText("Ready..");
		}
	}
}
