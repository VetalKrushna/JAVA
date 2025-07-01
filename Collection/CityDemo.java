package Map;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CityDemo extends Frame implements ActionListener
{
	Hashtable ht=new Hashtable();
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	CityDemo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,300);
		setTitle("City Demo");
		setLayout(new FlowLayout());
		setBackground(Color.pink);
		
		l1=new Label("City Name:");
		l2=new Label("STD Code:");
		
		t1=new TextField(10);
		t2=new TextField(10);
		
		b1=new Button("Add");
		b2=new Button("Remove");
		b3=new Button("Search");
		b4=new Button("Exit");
		add(l1); add(t1);
		add(l2); add(t2);
		add(b1); add(b2);
		add(b3); add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b1)
		{
			String key=t1.getText();
			String value=t2.getText();
			ht.put(key, value);
			JOptionPane.showMessageDialog(this,"Added Successfully....");
		}
		
		if(ae.getSource()==b2)
		{
			String key=t1.getText();
			if(ht.containsKey(key))
			{
				ht.remove(key);
				JOptionPane.showMessageDialog(this,"Remove Successfully....");
			}
			else
				JOptionPane.showMessageDialog(this,"Record not found....");
			
		}
		if(ae.getSource()==b3)
		{
			String key=t1.getText();
			if(ht.containsKey(key))
			    t2.setText(""+ht.get(key));
			else
				JOptionPane.showMessageDialog(this,"Record not found....");
			
		}
		if(ae.getSource()==b4)
		{
			dispose();
		}
	}
	public static void main(String[] args) 
	{
			new CityDemo();
	}
}	
