package AWT;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b1,b2;
	public Login() 
	{
		setVisible(true);
		setSize(444,444);
		setBackground(Color.cyan);
		setLocation(300,200);
		setTitle("Registration Form");
		setLayout(new FlowLayout());
		l1=new Label("Enter UserId:");
		l2=new Label("Enter Password:");
		 t1=new TextField(10);
		 t2=new TextField(10);
		 t2.setEchoCharacter('*');
		b1=new Button("Login");
		b2=new Button("Exit");
		
		add(l1); add(t1); add(l2); add(t2); add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String uid=t1.getText();
			String pass=t2.getText();
			if(uid.equals("Krushna") && pass.equals("Pass@123"))
			{
			 JOptionPane.showMessageDialog(this,"Login Successfully..");
			}
			else
				
			{
				JOptionPane.showMessageDialog(this, "Invalid User id or Password..");
			}
		}
		
		if(ae.getSource()==b2)
		{
			dispose();
		}
	}
	public static void main(String[] args) 
	{
		Login ob=new Login();
	}
}
