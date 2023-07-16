import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class dashboard extends JFrame implements ActionListener
{
    JFrame f1;
    JPanel p1,p2,p3,p4,p5;
    JLabel l1,l2,l3,l4,l5;
    ImageIcon i1,i2,i3,i4;
    JTabbedPane t1; 
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    dashboard()
    {
        f1=new JFrame();
        f1.getContentPane();
        p1=new JPanel();
	p2=new JPanel();
	p4=new JPanel();
	p5=new JPanel();
	p3=new JPanel();
	i1=new ImageIcon("online-wallet.png");
	i2=new ImageIcon("logout.png");
	l1=new JLabel(i1);
	l2=new JLabel(i2);
	l3=new JLabel("Linkcode Payment Systems");
	b1=new JButton("Home");
        b2=new JButton("Recharge");
	b3=new JButton("Check Balance");
        b4=new JButton("Add Money To Wallet");
	b5=new JButton("Send Money From Wallet");
	b6=new JButton("Change Password");
	b7=new JButton("Logout");
	b8=new JButton("About");
	l3.setBounds(200,10, 600, 64);
	l3.setFont(new Font("Verdana", Font.PLAIN, 40));
	l1.setBounds(80,0,60,60);
	p1.setLayout(null);
	p2.setLayout(null);
	p3.setLayout(null);
	p4.setLayout(null);
	p5.setLayout(null);
        p1.setBackground(Color.WHITE);
        add(p1);
        p2.setBackground(new Color(0,181,204));
	p2.setBounds(203,0,939,83);
	p1.add(p2);
	l2.setBounds(1290,10,100,30);
	p2.add(l2);
	p3.setBackground(new Color(67,150,209));
	p3.setBounds(0,0,200,694);
	p1.add(p3);
	p3.add(l1);
	p4.setBackground(new Color(0,181,204));
	p4.setBounds(0,698,1366,44);
	p1.add(p4);
	p5.setBackground(new Color(67,150,209));
	p5.setBounds(1146,0,220,694);
	p1.add(p5);
	l2.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent ea) {
	//new Application();
	dispose();
	}});
	t1=new JTabbedPane();
	t1.setBounds(203,59,939,635);
	t1.add("Home",new Home());
	t1.add("Recharge",new recharge());
	t1.add("Check Balance",new Bal());
	t1.add("Add Money",new money());
	t1.add("Send Money",new send());
	t1.add("Change Pass",new change());
	t1.add("About",new about());
	p1.add(t1);
	p2.add(l3);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1729,800);
	b1.setBackground(new Color(0,181,204));
	b1.setBounds(0,82,200,40);
	p3.add(b1);
	b1.addActionListener(this);
	b2.setBackground(new Color(0,181,204));
	b2.setBounds(0,150,200,40);
	p3.add(b2);
	b2.addActionListener(this);
	b3.setBackground(new Color(0,181,204));
	b3.setBounds(0,220,200,40);
	p3.add(b3);
	b3.addActionListener(this);
	b4.setBackground(new Color(0,181,204));
	b4.setBounds(0,290,200,40);
	p3.add(b4);
	b4.addActionListener(this);
	//b5.setBackground(new Color(0,181,204));
	//b5.setBounds(0,290,200,40);
	//p3.add(b5);
	//b5.addActionListener(this);
	b6.setBackground(new Color(0,181,204));
	b6.setBounds(0,360,200,40);
	p3.add(b6);
	b6.addActionListener(this);
	b7.setBackground(new Color(0,181,204));
	b7.setBounds(0,432,200,40);
	p3.add(b7);
	b7.addActionListener(this);
	b8.setBackground(new Color(0,181,204));
	b8.setBounds(0,505,200,40);
	p3.add(b8);
	b8.addActionListener(this);
	i3=new ImageIcon("megaphone.png");
	l4=new JLabel(i3);
	l4.setBounds(90,0,70,60);
	p5.add(l4);
	
	i4=new ImageIcon("ads.jpg");
	l5=new JLabel(i4);
	l5.setBounds(30,84,160,600);
	p5.add(l5);
	
    }
	public void actionPerformed(ActionEvent ae)
	{
		if(b1==ae.getSource())
		{
			t1.setSelectedIndex(0);
		}
		else if(b2==ae.getSource())
		{
			t1.setSelectedIndex(1);
		}
		else if(b3==ae.getSource())
		{
			t1.setSelectedIndex(2);
		}
		else if(b4==ae.getSource())
		{
			t1.setSelectedIndex(3);
		}
		//else if(b5==ae.getSource())
		//{
			//t1.setSelectedIndex(4);
		//}
		else if(b6==ae.getSource())
		{
			t1.setSelectedIndex(5);
		}
		else if(b7==ae.getSource())
		{
			//t1.setSelectedIndex(6);
			 Application a1=new Application();
			 a1.setVisible(true);
			 dispose();
		}
		else if(b8==ae.getSource())
		{
			t1.setSelectedIndex(6);
			
		}	
	}
	
public static void main(String args[])
    {
        new dashboard();
    }
}
	class Home extends JPanel
  	 {
		ImageIcon i1;
		JLabel l1;
		public Home()
		{
			setBackground(Color.WHITE);
			i1=new ImageIcon("Home.jpg");
			l1=new JLabel(i1);
			add(l1);
			l1.setBounds(0,0,939,635);
	 		setLayout(null);
		} 	
	}
	class recharge extends JPanel implements ActionListener
  	 {
		JButton b1;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField t1,t2;
		JComboBox c1,c2;
		String str[]={"Jio","Idea","Vodafone","Airtel","Bsnl","Uninor","Telinor"};
		String str1[]={"PostPaid","PrePaid"};
		public recharge()
		{
			l1=new JLabel("Transaction Id:-");
			l1.setBounds(300,40,170,40);
			l1.setFont(new Font("Verdana", Font.PLAIN, 20));
			l1.setForeground(new Color(0,181,204));
			//add(l1);

			l2=new JLabel("Transaction Time:-");
			l2.setBounds(274,100,200,40);
			l2.setFont(new Font("Verdana", Font.PLAIN, 20));
			l2.setForeground(new Color(0,181,204));
			add(l2);
			
			l3=new JLabel("Transaction Date:-");
			l3.setBounds(274,160,200,40);
			l3.setFont(new Font("Verdana", Font.PLAIN, 20));
			l3.setForeground(new Color(0,181,204));
			add(l3);

			l4=new JLabel("Auto-Generated");
			l4.setBounds(465,40,170,40);
			l4.setFont(new Font("Verdana", Font.PLAIN, 15));
			l4.setForeground(Color.BLACK);
			//add(l4);

			l5=new JLabel("Auto-Generated");
			l5.setBounds(465,100,170,40);
			l5.setFont(new Font("Verdana", Font.PLAIN, 15));
			l5.setForeground(Color.BLACK);
			add(l5);

			l6=new JLabel("Auto-Generated");
			l6.setBounds(465,160,170,40);
			l6.setFont(new Font("Verdana", Font.PLAIN, 15));
			l6.setForeground(Color.BLACK);
			add(l6);

			l7=new JLabel("Mobile No:-");
			l7.setBounds(347,220,200,40);
			l7.setFont(new Font("Verdana", Font.PLAIN, 20));
			l7.setForeground(new Color(0,181,204));
			add(l7);

			t1=new JTextField();
			t1.setBounds(465,226,170,30);
			t1.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t1);

			l8=new JLabel("Service Provider:-");
			l8.setBounds(280,280,200,40);
			l8.setFont(new Font("Verdana", Font.PLAIN, 20));
			l8.setForeground(new Color(0,181,204));
			add(l8);
			
			c1=new JComboBox(str);
			c1.setBounds(465,286,170,30);
			add(c1);

			l9=new JLabel("Amount:-");
			l9.setBounds(366,340,200,40);
			l9.setFont(new Font("Verdana", Font.PLAIN, 20));
			l9.setForeground(new Color(0,181,204));
			add(l9);
			
			t2=new JTextField();
			t2.setBounds(465,346,170,30);
			t2.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t2);

			l10=new JLabel("Plan:-");
			l10.setBounds(400,400,200,40);
			l10.setFont(new Font("Verdana", Font.PLAIN, 20));
			l10.setForeground(new Color(0,181,204));
			add(l10);

			c2=new JComboBox(str1);
			c2.setBounds(465,406,170,30);
			add(c2);

	 		b1=new JButton("Recharge");
	 		b1.setFont(new Font("Verdana", Font.PLAIN, 20));
			b1.setForeground(new Color(0,181,204));
			b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
			b1.setContentAreaFilled(false);
			Dimension size3 = b1.getPreferredSize();
			b1.setBounds(420, 466, size3.width, size3.height);
			add(b1);
			b1.addActionListener(this);
	 		setBackground(Color.WHITE);
	 		setLayout(null);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String value="",value1="";
			String url="jdbc:mysql://localhost:3306/recharge";
			String uname="root";
			String pass="";
			String query="UPDATE finalpay SET Transaction_Time = ?,Transaction_Date = ?,Service_Provider=?,Amount=(Amount-(?)),Plan=? WHERE Mobile_No = ?";
			try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps=con.prepareStatement(query);
			
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery("select Mobile_No from finalpay where Mobile_No like '"+'%'+t1.getText()+'%'+"'");	
			
			if(rs.next())
			{
				java.util.Date date=new java.util.Date();
      			java.sql.Date sqlDate=new java.sql.Date(date.getTime());
       			java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
       			ps.setTimestamp(1,sqlTime);
				ps.setDate(2,sqlDate);
			if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please enter the mobile no"); 
			}
			else
			{
				ps.setString(6,t1.getText());
				value=c1.getSelectedItem().toString();
				ps.setString(3,value);
				if(t2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter amount of recharge"); 
				}
				else
				{
					int num=Integer.parseInt(t2.getText());
					ps.setInt(4,num);
					value1=c2.getSelectedItem().toString();
					ps.setString(5,value1);
					//ps.execute();
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null,"Recharge successful Check your balance"); 
					clearfield4();
					
				}
			}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please enter the valid mobile no"); 
			}
			}catch(SQLException ex){
				JOptionPane.showMessageDialog(null,"Error while executing the transaction"+ex); 
			}catch(Exception se){
     				JOptionPane.showMessageDialog(null,"Error while executing the transaction"+se); 
     			}	 
		} 
		public void clearfield4()
		{
			t1.setText("");
			c1.setSelectedIndex(0);
			t2.setText("");
			c2.setSelectedIndex(0);
		}	
	}
	class Bal extends JPanel implements ActionListener
  	 {
		JButton b1,b2;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
		JTextField t1;
		public Bal()
		{
			l1=new JLabel("Enter Mobile No:-");
			l1.setBounds(280,40,200,40);
			l1.setFont(new Font("Verdana", Font.PLAIN, 20));
			l1.setForeground(new Color(0,181,204));
			add(l1);

			t1=new JTextField();
			t1.setBounds(470,44,170,30);
			t1.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t1);

	 		b1=new JButton("Click Here");
			b1.setFont(new Font("Verdana", Font.PLAIN, 20));
			b1.setForeground(new Color(0,181,204));
			b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
			b1.setContentAreaFilled(false);
			Dimension size3 = b1.getPreferredSize();
			b1.setBounds(420, 80, size3.width, size3.height);
	 		add(b1);
			b1.addActionListener(this);
			
			l2=new JLabel("Transaction Time:-");
			l2.setBounds(274,140,200,40);
			l2.setFont(new Font("Verdana", Font.PLAIN, 20));
			l2.setForeground(new Color(0,181,204));
			add(l2);

			l3=new JLabel("Transaction Date:-");
			l3.setBounds(274,210,200,40);
			l3.setFont(new Font("Verdana", Font.PLAIN, 20));
			l3.setForeground(new Color(0,181,204));
			add(l3);
			
			l4=new JLabel("Mobile No:-");
			l4.setBounds(347,280,200,40);
			l4.setFont(new Font("Verdana", Font.PLAIN, 20));
			l4.setForeground(new Color(0,181,204));
			add(l4);

			l5=new JLabel("Service Provider:-");
			l5.setBounds(280,350,200,40);
			l5.setFont(new Font("Verdana", Font.PLAIN, 20));
			l5.setForeground(new Color(0,181,204));
			add(l5);
			
			l6=new JLabel("Amount:-");
			l6.setBounds(366,420,200,40);
			l6.setFont(new Font("Verdana", Font.PLAIN, 20));
			l6.setForeground(new Color(0,181,204));
			add(l6);

			l7=new JLabel("Plan:-");
			l7.setBounds(400,490,200,40);
			l7.setFont(new Font("Verdana", Font.PLAIN, 20));
			l7.setForeground(new Color(0,181,204));
			add(l7);
			
			l8=new JLabel("");
			l8.setFont(new Font("Verdana", Font.PLAIN, 15));
			l8.setForeground(Color.BLACK);
			l8.setBounds(480,140,200,40);
			add(l8);

			l9=new JLabel("");
			l9.setFont(new Font("Verdana", Font.PLAIN, 15));
			l9.setForeground(Color.BLACK);
			l9.setBounds(480,210,200,40);
			add(l9);
			
			l10=new JLabel("");
			l10.setFont(new Font("Verdana", Font.PLAIN, 15));
			l10.setForeground(Color.BLACK);
			l10.setBounds(480,280,200,40);
			add(l10);
			
			l11=new JLabel("");
			l11.setFont(new Font("Verdana", Font.PLAIN, 15));
			l11.setForeground(Color.BLACK);
			l11.setBounds(480,350,200,40);
			add(l11);
			
			l12=new JLabel("");
			l12.setFont(new Font("Verdana", Font.PLAIN, 15));
			l12.setForeground(Color.BLACK);
			l12.setBounds(480,420,200,40);
			add(l12);
			
			l13=new JLabel("");
			l13.setFont(new Font("Verdana", Font.PLAIN, 15));
			l13.setForeground(Color.BLACK);
			l13.setBounds(480,490,200,40);
			add(l13);
			
			b2=new JButton("Ok");
			b2.setFont(new Font("Verdana", Font.PLAIN, 20));
			b2.setForeground(Color.WHITE);
			b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
			b2.setContentAreaFilled(true);
			b2.setBackground(new Color(0,181,204));
			Dimension size4 = b2.getPreferredSize();
			b2.setBounds(450,530, size4.width, size4.height);
			//add(b2);
			 
	 		setBackground(Color.WHITE);
	 		setLayout(null);
		} 
		public void actionPerformed(ActionEvent ae)
		{
			String url="jdbc:mysql://localhost:3306/recharge";
			String uname="root";
			String pass="";
			String query="select Transaction_Time,Transaction_Date,Mobile_No,Service_Provider,Amount,Plan from finalpay where Mobile_No='"+t1.getText()+"'";
			if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please Enter Mobile No.");
			}
			else
			{
				try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,uname,pass);

				Statement st1 = con.createStatement();
				ResultSet rs1=st1.executeQuery("select Mobile_No from finalpay where Mobile_No like '"+'%'+t1.getText()+'%'+"'");	
			
				if(rs1.next())
				{
				
				
				PreparedStatement st=con.prepareStatement(query);
				ResultSet rs=st.executeQuery();
				while(rs.next())
				{
					l8.setText(rs.getString(1));
					l9.setText(rs.getString(2));
					l10.setText(rs.getString(3));
					l11.setText(rs.getString(4));
					l12.setText(rs.getString(5));
					l13.setText(rs.getString(6));
				}
				JOptionPane.showMessageDialog(null, "Retrieved data succesfully.");
			}else
			{
				JOptionPane.showMessageDialog(null,"Please Enter The Valid Number");
			}
				}catch (Exception ex) {
				JOptionPane.showMessageDialog(null,"Error while login"+ex); 
			}
			}
		}	
	}
	class money extends JPanel implements ActionListener
  	 {
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2,t4,t5,t6;
		JPasswordField t3;
		JButton b1;
		JComboBox c1;
		String str3[]={"Visa","Chase Freedom","Citi Cash Card","Mastercard","Bank of America","Citi Simplicity","Citibank","American Express"," Capital One",""};
		public money()
		{
			l1=new JLabel("Mobile No:-");
			l1.setBounds(347,50,200,40);
			l1.setFont(new Font("Verdana", Font.PLAIN, 20));
			l1.setForeground(new Color(0,181,204));
			add(l1);
				
			t1=new JTextField();
			t1.setBounds(470,55,170,30);
			t1.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t1);

			l2=new JLabel("Credit/Debit Card No:-");
			l2.setBounds(240,100,230,40);
			l2.setFont(new Font("Verdana", Font.PLAIN, 20));
			l2.setForeground(new Color(0,181,204));
			add(l2);
			
			t2=new JTextField();
			t2.setBounds(470,105,170,30);
			t2.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t2);
			
			l3=new JLabel("CVV:-");
			l3.setBounds(410,150,100,40);
			l3.setFont(new Font("Verdana", Font.PLAIN, 20));
			l3.setForeground(new Color(0,181,204));
			add(l3);
			
			t3=new JPasswordField();
			t3.setBounds(470,155,170,30);
			t3.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t3);

			l4=new JLabel("Card Date:-");
			l4.setBounds(350,200,150,40);
			l4.setFont(new Font("Verdana", Font.PLAIN, 20));
			l4.setForeground(new Color(0,181,204));
			add(l4);
			
			t4=new JTextField();
			t4.setBounds(470,205,170,30);
			t4.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t4);
			
			l5=new JLabel("Card Name:-");
			l5.setBounds(330,250,150,40);
			l5.setFont(new Font("Verdana", Font.PLAIN, 20));
			l5.setForeground(new Color(0,181,204));
			add(l5);
			
			c1=new JComboBox(str3);
			c1.setBounds(470,255,170,30);
			add(c1);

			l6=new JLabel("Amount:-");
			l6.setBounds(370,300,150,40);
			l6.setFont(new Font("Verdana", Font.PLAIN, 20));
			l6.setForeground(new Color(0,181,204));
			add(l6);
			
			t5=new JTextField();
			t5.setBounds(472,305,170,30);
			t5.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t5);

	 		b1=new JButton("Click Here");
			b1.setFont(new Font("Verdana", Font.PLAIN, 20));
			b1.setForeground(new Color(0,181,204));
			b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
			b1.setContentAreaFilled(false);
			Dimension size3 = b1.getPreferredSize();
			b1.setBounds(420, 350, size3.width, size3.height);
	 		add(b1);
			b1.addActionListener(this);
	 		setBackground(Color.WHITE);
	 		setLayout(null);
		} 
	public 	void actionPerformed(ActionEvent ae)
	{
		String url="jdbc:mysql://localhost:3306/recharge";
		String uname="root";
		String pass="";
		String query="INSERT INTO finalpay(Mobile_No,card_number,cvv,card_date,type_card,Amount) VALUES (?,?,?,?,?,?)";
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement ps=con.prepareStatement(query);
		if(t1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Enter the mobile no"); 
		}
		else
		{
			ps.setString(1,t1.getText());
			if(t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Enter the Credit/Debit card no"); 	
			}
			else
			{
				ps.setString(2,t2.getText());
				if(t3.getText().equals(""))
				{
				 	JOptionPane.showMessageDialog(null,"Enter the CVV"); 
				}
				else
				{
					ps.setString(3,t3.getText());
					if(t4.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Enter card date"); 
					}
					else
					{
						ps.setString(4,t4.getText());
						String value=c1.getSelectedItem().toString();
						ps.setString(5,value);
						if(t5.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null,"Enter Amount for transfer"); 
						}
						else
						{
							ps.setString(6,t5.getText());
							ps.execute();
							JOptionPane.showMessageDialog(null,"Amount Successfully Transfered"); 
							clearfield6();
						}
					}
				}	
			}
		}
		}catch(Exception ex)
		{
		  JOptionPane.showMessageDialog(null,"Error while entering the data"+ex); 
		}
	}
	public void clearfield6()
	{
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		c1.setSelectedIndex(0);
		t5.setText("");
	}
	}
	class send extends JPanel
  	 {
		JButton b1;
		public send()
		{
	 		b1=new JButton("Click Here");
	 		add(b1);
	 		setBackground(Color.WHITE);
	 		setLayout(null);
		} 	
	}
	class change extends JPanel implements ActionListener
  	 {
		JLabel l1,l2,l3,l4;
		JTextField t1;
		JPasswordField t3,t2,t4; 
		JButton b1;
		public change()
		{
	 		l1=new JLabel("Current Username:-");
			l1.setBounds(300,40,220,40);
			l1.setFont(new Font("Verdana", Font.PLAIN, 20));
			l1.setForeground(new Color(0,181,204));
			add(l1);

			l2=new JLabel("Current Password:-");
			l2.setBounds(310,100,220,40);
			l2.setFont(new Font("Verdana", Font.PLAIN, 20));
			l2.setForeground(new Color(0,181,204));
			add(l2);

			l3=new JLabel("Set New Password:-");
			l3.setBounds(300,160,220,40);
			l3.setFont(new Font("Verdana", Font.PLAIN, 20));
			l3.setForeground(new Color(0,181,204));
			add(l3);

			l4=new JLabel("Confirm Password:-");
			l4.setBounds(304,220,220,40);
			l4.setFont(new Font("Verdana", Font.PLAIN, 20));
			l4.setForeground(new Color(0,181,204));
			add(l4);

			t1=new JTextField();
			t1.setBounds(510,45,170,30);
			t1.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t1);

			t2=new JPasswordField();
			t2.setBounds(510,105,170,30);
			t2.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t2);

			t3=new JPasswordField();
			t3.setBounds(510,165,170,30);
			t3.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t3);

			t4=new JPasswordField();
			t4.setBounds(510,225,170,30);
			t4.setFont(new Font("Verdana", Font.PLAIN, 20));
			//l1.setForeground(new Color(0,181,204));
			add(t4);

			b1=new JButton("Submit");
	 		b1.setFont(new Font("Verdana", Font.PLAIN, 20));
			b1.setForeground(new Color(0,181,204));
			b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
			b1.setContentAreaFilled(false);
			Dimension size4 = b1.getPreferredSize();
			b1.setBounds(480,285, size4.width, size4.height);
			add(b1);
			b1.addActionListener(this);
	 		setBackground(Color.WHITE);
	 		setLayout(null);
		} 
		public void actionPerformed(ActionEvent ae)
		{
			if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please Enter The Current Username"); 
			}
			else
			{
				if(t2.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter The Current Password"); 
				}
				else
				{
					if(t3.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Enter The New Password"); 
					}
					else
					{	String p=t3.getText();
						if(t4.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null,"Please Confirm The New Password"); 	
						}
						else
						{
							String p1=t4.getText();
							if(p.equals(p1))
							{
							try{
							String value="",value1="";
							String url="jdbc:mysql://localhost:3306/recharge";
							String uname="root";
							String pass="";
							String query="Update login set Password=? where Username='"+t1.getText()+"' "+"and Password='"+t2.getText()+"'";
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection(url,uname,pass);
							PreparedStatement ps=con.prepareStatement(query);
							
							Statement st = con.createStatement();
							ResultSet rs=st.executeQuery("select Username,Password from login where Username like '"+'%'+t1.getText()+'%'+"'"+" and Password like '"+'%'+t2.getText()+'%'+"'");
							if(rs.next()){
							//JOptionPane.showMessageDialog(null,"Already Exists");
							//}
							ps.setString(1,t4.getText());
							ps.executeUpdate();
							JOptionPane.showMessageDialog(null,"Password Changed Successfully!");
							clearfield8();
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Old Username Or Password Is Incorrect!");
							}
							}catch(Exception ex)
								{
									JOptionPane.showMessageDialog(null,"Error while updating password"+ex);	
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Entered New Password Does Not Matches");	
							}
						}
					}
				}
			}
		}
		public void clearfield8()
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}	
	}
	class about extends JPanel
  	 {
		JButton b1;
		ImageIcon i1;
		JLabel l1;
		public about()
		{
	 		setBackground(Color.WHITE);
	 		setLayout(null);
			setBackground(Color.WHITE);
			i1=new ImageIcon("rsz_final_wallpaper.jpg");
			l1=new JLabel(i1);
			add(l1);
			l1.setBounds(0,0,939,635);
		} 	
	}




//"UPDATE finalpay SET Transaction_Time = ?," + "Transaction_Date = ?,"+"Service_Provider=?,"+"Amount=(Amount-?),"+"Plan=?"+ "WHERE Mobile_No = ?";














