import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  

public class Application extends JFrame implements ActionListener{
    JFrame f1;
    ImageIcon i1,i2;
    JLabel l1,l2,l3,l4,l5,l6;
    JPanel p1,p2;
    JButton b1,b2;
    Application()
    {
        f1=new JFrame("Home");
        p1=new JPanel();
        p2=new JPanel();
        b1=new JButton("Login");
        b2=new JButton("Register");
        i1=new ImageIcon("user.png");
        i2=new ImageIcon("online-wallet.png");
        l1=new JLabel("",i1,JLabel.CENTER);
        l2=new JLabel("Welcome To Online Payment",i2,JLabel.CENTER);
        l3=new JLabel("Do you already have an account?");
        l4=new JLabel("Don't have an account? Sign up");
	l5=new JLabel("Linkcode");
	l6=new JLabel("Powered By Linkcode");
        f1.getContentPane();  
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        add(p1);
        p2.setLayout(null);
        p2.setBounds(0,0,400,750);
        p2.setBackground(new Color(0,204,181));
        p1.add(p2);
        l1.setBounds(0,0,380,680);
        p2.add(l1);
        l2.setBounds(0,0,1750,100);
        l2.setFont(new Font("Verdana", Font.PLAIN, 50));
        p1.add(l2);
        l3.setBounds(750,150,400,200);
        l3.setFont(new Font("Verdana", Font.PLAIN, 20));
        p1.add(l3);
        l4.setBounds(762,280,400,200);
        l4.setFont(new Font("Verdana", Font.PLAIN, 20));
        p1.add(l4);
        b1.setBackground(new Color(0,204,181));
        b1.setBounds(850,300,150,30);
        p1.add(b1);
        b2.setBackground(new Color(0,204,181));
        b2.setBounds(850,440,150,30);
        p1.add(b2);
	l5.setBounds(110,-50,200,200);
	l5.setFont(new Font("Verdana", Font.PLAIN, 40));
        p2.add(l5);
	b1.addActionListener(this);
        b2.addActionListener(this);
	l6.setBounds(1200,670,140,100);
	p1.add(l6);
        setVisible(true);
        setSize(1729,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
	Object cmd = e.getSource();
        if(cmd==b1)
        {
            components c1=new components();
            this.setVisible(false);
        }
        else if(cmd==b2)
        {
	    comp c2=new comp();
	    c2.setVisible(true);
	    this.setVisible(false);				
        }
    }
	public static void main(String args[])
	{
		new Application();
	}
 }





