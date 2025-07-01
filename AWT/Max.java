package awt;
import java.awt.*;
import java.awt.event.*;


public class Max extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2;
	
	Max()
	{
		setVisible(true);
		setBackground(Color.CYAN);
		setSize(500,200);
		setLocation(500,500);
		setLayout(new FlowLayout());
		l1=new Label("Enter Ist no:");
		l2=new Label("Enter IInd no:");
		l3=new Label("Enter IIIrd no:");
		l4=new Label("Max no:");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		b1=new Button("Ok");
		b2=new Button("Exit");
		add(l1); add(t1); add(l2); add(t2); add(l3); add(t3);
		add(l4); add(t4); add(b1); add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=Integer.parseInt(t3.getText());
			if(a>b && a>c)
			{
				t4.setText(""+a);
			}
			else if(b>a && b>c)
			{
				t4.setText(""+b);
			}
			else if(c>a && c>b)
			{
				t4.setText(""+c);
			}
			
		}
		if(e.getSource()==b2)
		{
			dispose();
		}
	}
		public static void main(String[] args) {
			new Max();
		}
}
