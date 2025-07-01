package AWT;
import javax.swing.*;

import java.awt.*;
import java.util.*;

public class TableDemo extends JFrame 
{
	JTable tbl;
	TableDemo()
	{
      	setVisible(true);
		setSize(500,500);
		setLocation(500,300);
		setTitle("City Demo");
		setLayout(new FlowLayout());
		setBackground(Color.pink);
		
		
		Vector head=new Vector();
		head.add("Rno");
		head.add("Name");
		head.add("Per");
		
		Vector data=new Vector();
		 Vector row1=new Vector();
		   row1.add("1");
		   row1.add("Om");
		   row1.add("65.21");
		   
		 Vector row2=new Vector();
		   row2.add("2");
		   row2.add("Sai");
		   row2.add("55.21");
		   
		 Vector row3=new Vector();
		   row3.add("3");
		   row3.add("Ram");
		   row3.add("60.21");
		
		  data.add(row1);
		  data.add(row2);
		  data.add(row3);
		
		  tbl=new JTable(data,head);
		  
		  JScrollPane jsp=new JScrollPane(tbl);
		  jsp.setBounds(100,100,300,200);
		  add(jsp);
	}
	public static void main(String[] args) 
	{
		new TableDemo();
	}
}
