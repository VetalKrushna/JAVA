package  awt;
import java.awt.*;
import java.awt.event.*;

public class list1 extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3,b4;
	List lst;
	list1()
	{
		setVisible(true);
		setSize(500,200);
		setBackground(Color.CYAN);
		setLayout(new FlowLayout());
		
		l1=new Label("Enter Product:");
		l2=new Label("Product List:");
		t1=new TextField(10);
		lst=new List();
		b1=new Button("Add");
		b2=new Button("Remove");
		b3=new Button("Clear");
		b4=new Button("Exit");
		add(l1); add(t1); add(l2); add(lst); 
		add(b1); add(b2); add(b3); add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
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
			lst.remove(lst.getSelectedItem());
		}
		if(ae.getSource()==b3)
		{
			lst.clear();
		}
		if(ae.getSource()==b4)
		{
			dispose();
		}
	}
  
	public static void main(String[] args)
	{
		new list1();
	}

}
