package AWT;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Table extends JFrame implements ActionListener 
{
	JTable tbl;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;
	Vector head;
	DefaultTableModel tablemodel;
	
	Table()
	{
      	setVisible(true);
		setSize(500,700);
		setLocation(600,100);
		setTitle("City Demo");
		setLayout(new FlowLayout());
		setBackground(Color.pink);
		
		l1=new Label("Roll no:");
		l2=new Label("Name:");
		l3=new Label("Per");
		
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		
		b1=new Button("Add");
		b2=new Button("Remove");
		b3=new Button("Exit");
		
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(b1); add(b2);
		add(b3); 
		
	    tablemodel=new DefaultTableModel(new Object[] {"Roll no","Name","Per"},0 );
		
		  
		 tbl=new JTable(tablemodel);
		 JScrollPane jsp=new JScrollPane(tbl);
		 jsp.setBounds(50,50,50,50);
		 add(jsp);
		  
		  
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent ae) 
{
	if(ae.getSource()==b1)
	{
		String rno=t1.getText();
		String name=t2.getText();
		String per=t3.getText();
		tablemodel.addRow(new Object[] {rno,name,per});
		  
		   
	}
	 
	if(ae.getSource()==b2)
	{
		int row=tbl.getSelectedRow();
		tablemodel.removeRow(row);
	}
	if(ae.getSource()==b3)
	{
	  dispose();
	}
	
}
	public static void main(String[] args) 
	{
		new Table();
	}
}
