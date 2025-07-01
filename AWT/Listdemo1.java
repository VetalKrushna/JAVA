package AWT;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Listdemo1 extends Frame implements ActionListener 
{
	Label l1,l2;
	TextField t1;
	Button b1,b2,b3;
	List lst;
	
	Listdemo1()
	{
	
		setVisible(true);
		setSize(500,500);
		setLayout(new GridLayout(4,2));
		l1=new Label("Product name:");
		l2=new Label("List:");
		lst=new List(10);
		t1=new TextField(10);
		b1=new Button("Add");
		b2=new Button("Remove");
		b3=new Button("Clear");
		
		add(l1);add(t1);add(l2);add(lst);
		add(b1);add(b2);add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

public void actionPerformed(ActionEvent ae) 
{
	if(ae.getSource()==b1)
	{
		String s=t1.getText();
		lst.add(s);
	}
	if(ae.getSource()==b2)
	{
		int n=lst.getSelectedIndex();
		lst.remove(n);
	}
	if(ae.getSource()==b3)
	{
		lst.clear();
	}
}
public static void main(String[] args) {
	new Listdemo1();
}
}
