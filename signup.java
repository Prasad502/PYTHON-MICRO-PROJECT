import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class signup extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	ImageIcon i1,i2,i3,i4,i5;
	JTextField t1;
	JPasswordField t2,t3;
	JButton b1;
	signup()
	{    
	JFrame f1=new JFrame(); 
	p1=new JPanel();
	p2=new JPanel();
	f1.getContentPane();
	i1=new ImageIcon("user.png");
	i2=new ImageIcon("online-wallet.png");
	i3=new ImageIcon("icon1.png");
	i4=new ImageIcon("password.png");
	i5=new ImageIcon("back.png"); 
	l1=new JLabel(i1);
	l2=new JLabel("Sign Up for Free",i2,JLabel.CENTER);
	l3=new JLabel(i3);
	l4=new JLabel(i4);
	l5=new JLabel(i4);
	l9=new JLabel(i5);
	l10=new JLabel("Linkcode");
	l11=new JLabel("Powered by Linkcode");
	l6=new JLabel("Enter The Username :");
	l7=new JLabel("Password:");
	l8=new JLabel("Confirm Password:");
	t1=new JTextField();
	t2=new JPasswordField();
	t3=new JPasswordField();
	b1=new JButton("Sign Up");
	p2.setLayout(null);
	p1.setLayout(null);
	p1.setBackground(Color.WHITE);
	add(p1);
	p2.setBounds(0,0,280,800);
	p2.setBackground(new Color(0,181,204));
	p1.add(p2);
	Dimension size = l1.getPreferredSize();
	l1.setBounds(80, 300, size.width, size.height);
	p2.add(l1);
	l2.setFont(new Font("Verdana", Font.PLAIN, 40));
	Dimension size1 = l2.getPreferredSize();
	l2.setBounds(650, 0, size1.width, size1.height);
	p1.add(l2);
	t1.setFont(new Font("Verdana", Font.PLAIN, 20));
	t1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	Dimension size2 = t1.getPreferredSize();
	t1.setBounds(780, 200, 305, size1.height);
	p1.add(t1);
	t2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	//Dimension size3 = t2.getPreferredSize();
	t2.setBounds(780, 400, 316, 60);
	p1.add(t2);
	t3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	//Dimension size3 = t2.getPreferredSize();
	t3.setBounds(780, 300, 316, 60);
	p1.add(t3);
	
	l6.setFont(new Font("Verdana", Font.PLAIN, 20));
	l6.setBounds(540,-200,328,890);
	p1.add(l6);
	l7.setFont(new Font("Verdana", Font.PLAIN, 20));
	l7.setBounds(660,-100,328,890);
	p1.add(l7);
	l8.setFont(new Font("Verdana", Font.PLAIN, 20));
	l8.setBounds(580,3,328,890);
	p1.add(l8);
	
	b1.setFont(new Font("Verdana", Font.PLAIN, 20));
	b1.setForeground(new Color(0,181,204));
	b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	b1.setContentAreaFilled(false);
	Dimension size3 = b1.getPreferredSize();
	b1.setBounds(780, 480, size3.width, size3.height);
	p1.add(b1);
	b1.addActionListener(this);
	l9.setBounds(-35,5,100,20);
	//p2.add(l9);
	l9.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent ea) {
	//comp c1=new comp();
	//c1.setVisible(true);
	//dispose();
	}});
	Dimension size4 = l3.getPreferredSize();
	l3.setBounds(1085, 230, size4.width, size4.height);
	p1.add(l3);
	Dimension size5 = l4.getPreferredSize();
	l4.setBounds(1100, 427, size5.width, size5.height);
	p1.add(l4);
	Dimension size6 = l5.getPreferredSize();
	l5.setBounds(1100, 330, size6.width, size6.height);
	p1.add(l5);
	l10.setBounds(50,-70,200,200);
	l10.setFont(new Font("Verdana", Font.PLAIN, 40));
        p2.add(l10);
	l11.setBounds(1200,670,140,100);
	//l11.setFont(new Font("Verdana", Font.PLAIN, 10));
        p1.add(l11);
	setSize(1729,800);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null); 
	setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String url="jdbc:mysql://localhost:3306/recharge";
		String uname="root";
		String pass="";
		String query="INSERT INTO login(username,password) VALUES (?,?)";
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement ps=con.prepareStatement(query);
		if(t1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Username should not be empty");
		}
		else
		{	
			ps.setString(1,t1.getText());
			if(t3.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Password should not be empty");	
			}
			else
			{
				String str=t3.getText();
				if(t2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please confirm your password");
				}
				else
				{
					String str1=t2.getText();
					if(str.equals(str1))
					{
						ps.setString(2,t2.getText());
						ps.execute();
						clearfilled1();
						JOptionPane.showMessageDialog(null,"Sign up Successful");
						Application a1=new Application();
						a1.setVisible(true);
						dispose();
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Password does not matches");
					}
				}
			}
		}
	}
		catch(Exception ex){
	JOptionPane.showMessageDialog(null,"Error while entering the data"+ex); 
	}
	}
	public void clearfilled1(){
	t1.setText("");
	t2.setText("");
	t3.setText("");
	}
	public static void main(String args[])
	{
		new signup();
	}
}
