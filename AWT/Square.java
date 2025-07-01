package awt;
import java.awt.*;
import java.awt.event.*;
public class Square extends Frame implements ActionListener
{ 
	    Label l1,l2;
		TextField t1,t2;
		
		Button b1,b2;
	Square()
	{
	  b1=new Button("Square");
      b2=new Button("Exit");
	  l1=new Label("Enter No:");
	  l2=new Label("Result:");
	  t1=new TextField(3);
	  t2=new TextField(7);
	  
	  setVisible(true);
	  setTitle("Square");
	  setSize(500,500);
	  setLocation(500,200);
	  setLayout(new FlowLayout());
	  add(l1); add(t1); add(l2); add(t2); add(b1); add(b2);
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	}
	  public void actionPerformed(ActionEvent ae)
	  {
		if(ae.getSource()==b1)
		  {
			  String s=t1.getText();
			  int n=Integer.parseInt(s);
			 
			  s=Integer.toString(n*n);
			  t2.setText(s);
		  }
		if(ae.getSource()==b2) {
			dispose();
	  }
	  }
public static void main(String[] args) 
{
	new Square();
}
}
