/*Java program to create a screen which contain three checkboxes(.net,php,java)and 
 display the selected item in a texbox.. */

package GUI;
import java.awt.*;
import java.awt.event.*;

public class chbox extends Frame implements ItemListener
{
	Checkbox c1,c2,c3,c4;
	TextField t;
	
	chbox()
	{
		setVisible(true);
		setBackground(Color.CYAN);
		setSize(500,200);
		setLayout(new FlowLayout());
		CheckboxGroup cg=new CheckboxGroup();
		c1=new Checkbox(".net",cg,false);
		c2=new Checkbox("php",cg,false);
		c3=new Checkbox("java",cg,false);
		c4=new Checkbox("Exit",cg,false);
		t=new TextField(10);
		add(c1); add(c2); add(c3); add(c4); add(t);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			String s=c1.getLabel();
			t.setText(""+s);
		}
		if(ie.getSource()==c2)
		{
			t.setText(c2.getLabel());
		}
		if(ie.getSource()==c3)
		{
			t.setText(c3.getLabel());
		}
		if(ie.getSource()==c4)
		{
			dispose();
		}
		
	}
	
	
	public static void main(String[] args)
	{
		new chbox();
	}
}
