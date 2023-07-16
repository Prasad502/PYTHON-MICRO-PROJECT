import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class comp extends JFrame implements ActionListener {
	String str[]={"Uttar Pradesh","Maharastra","Gujarat","Karnataka","Andhra Pradesh","Tamil Nadu","Rajasthan","Kerala","West Bengal","Delhi","Odisha","Punjab","Jammu Kashmir","Bihar","Madhya Pradesh","Assam","Telangana","Jharkhand","Haryana","Chhattisgarth","Uttarakhand","Goa","Himachal Pradesh","Arunachal Pradesh","Tripura","Nagaland","Meghalay","Mizoram","Sikkim","Manipur"};
	JFrame f1;
	ButtonGroup bg; 
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	ImageIcon i1,i2;
	JTextField t1,t2,t3,t4;
	JList li;
	JComboBox c1;
	JTextArea ta;
	JCheckBox cb;
	JButton b1;
	JRadioButton r1,r2;
	comp()
	{
	f1=new JFrame();
	p1=new JPanel();
	p2=new JPanel();
	c1=new JComboBox(str);
	bg=new ButtonGroup();
	f1.getContentPane();
	i1=new ImageIcon("online-wallet.png");
	i2=new ImageIcon("back.png");
	l1=new JLabel("User Information",i1,JLabel.CENTER);
	l2=new JLabel("Name:-");
	l3=new JLabel("Gender:-");
	l4=new JLabel("States:-");
	l6=new JLabel(i2);
	l7=new JLabel("Linkcode");
	l8=new JLabel("Powered By Linkcode");
	r1=new JRadioButton("Male",false);
	r2=new JRadioButton("Female",false);
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	li=new JList(str);
	l5=new JLabel("Address:-");
	l9=new JLabel("Mobile No:-");
	l10=new JLabel("Email-id:-");
	ta=new JTextArea();
	cb=new JCheckBox("Agree & Continue");
	b1=new JButton("Next");
	p2.setLayout(null);
	p1.setLayout(null);

	p1.setBackground(Color.WHITE);
	add(p1);

	p2.setBackground(new Color(0,181,204));
	p2.setBounds(0,0,1380,80);
	p1.add(p2);

	l1.setBounds(510,10, 300, 64);
	l1.setFont(new Font("Verdana", Font.PLAIN, 20));
	p2.add(l1);

	l2.setBounds(500, 120,100,20);
	l2.setFont(new Font("Verdana", Font.PLAIN, 20));
	l2.setForeground(new Color(0,181,204));
	p1.add(l2);

	t1.setBounds(600,110,200,30);
	t1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	p1.add(t1);


	l3.setBounds(500, 180,100,20);
	l3.setFont(new Font("Verdana", Font.PLAIN, 20));
	l3.setForeground(new Color(0,181,204));
	p1.add(l3);

	r1.setBounds(600, 180,100,20);
	r1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.WHITE));
	r1.setFont(new Font("Verdana", Font.PLAIN, 20));
	r1.setForeground(Color.BLACK);
	r1.setBackground(Color.WHITE);
	bg.add(r1);
	p1.add(r1);


	r2.setBounds(700, 180,100,20);
	r1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.WHITE));
	r2.setFont(new Font("Verdana", Font.PLAIN, 20));
	r2.setForeground(Color.BLACK);
	r2.setBackground(Color.WHITE);
	bg.add(r2);
	p1.add(r2);

	l4.setBounds(500, 240,100,20);
	l4.setFont(new Font("Verdana", Font.PLAIN, 20));
	l4.setForeground(new Color(0,181,204));
	p1.add(l4);

	c1.setBounds(602,240,200,30);
	p1.add(c1);

	l5.setBounds(500,330,100,20);
	l5.setFont(new Font("Verdana", Font.PLAIN, 20));
	l5.setForeground(new Color(0,181,204));
	p1.add(l5);

	l9.setBounds(480,450,140,20);
	l9.setFont(new Font("Verdana", Font.PLAIN, 20));
	l9.setForeground(new Color(0,181,204));
	p1.add(l9);

	l10.setBounds(500,520,140,20);
	l10.setFont(new Font("Verdana", Font.PLAIN, 20));
	l10.setForeground(new Color(0,181,204));
	p1.add(l10);

	
	ta.setBounds(602,330,200,100);
	ta.setBackground(Color.WHITE);
	ta.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
	p1.add(ta);


	t3.setBounds(602,450,200,30);
	t3.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	p1.add(t3);

	t4.setBounds(602,515,200,30);
	t4.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
	p1.add(t4);

	cb.setBounds(680,550,130,20);
	cb.setBackground(Color.WHITE);
	p1.add(cb);
	//cb.addActionListener(this);

	l6.setBounds(-35,5,100,20);
	p2.add(l6);
	Dimension size3 = b1.getPreferredSize();
	b1.setBounds(600, 580,150,40 );
	b1.setBackground(Color.WHITE);
	b1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.WHITE));
	b1.setFont(new Font("Verdana", Font.PLAIN, 20));
	b1.setForeground(new Color(0,181,204));
	p1.add(b1);
	b1.addActionListener(this);
	l6.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent ea) {
	new Application();
	dispose();
	}});

	l7.setBounds(40,7, 300, 64);
	l7.setFont(new Font("Verdana", Font.PLAIN, 40));
	p2.add(l7);

	l8.setBounds(1200,670,140,100);
	p1.add(l8);

	setSize(1729,800);
	setLocationRelativeTo(null); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	String url="jdbc:mysql://localhost:3306/recharge";
	String uname="root";
	String pass="";
	String query="INSERT INTO ragister(Name,Gender,States,Address,Mobile,Email) VALUES (?,?,?,?,?,?)";
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
	if(r1.isSelected())
	{
		String gender="Male";
		ps.setString(2,gender);
	}
	else if(r2.isSelected())
	{
		String gender="Female";
		ps.setString(2,gender);
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Please select the gender");
	}
	String value =c1.getSelectedItem().toString();
	ps.setString(3,value);
	if(ta.getText().equals(""))
	{
		JOptionPane.showMessageDialog(null,"Address should not be empty");
	}
	else
	{
		ps.setString(4,ta.getText());
		if(t3.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Mobile no should not be empty");
		}	
		else
		{
			ps.setString(5,t3.getText());
			if(t4.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Email id no should not be empty");
			}
			else
			{
				ps.setString(6,t4.getText());
				if(cb.isSelected())
				{
					ps.execute();
					clearfield();
		            		JOptionPane.showMessageDialog(null,"Entry Added Successfully");
					signup s1=new signup();
					s1.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(f1,"Please select agree and continue");
				}
			}
		
		}
	}
	}
	
	}
	catch(Exception ex){
	JOptionPane.showMessageDialog(null,"Error while entering the data"+ex); 
	}
	}
	public void clearfield()
	{
		t1.setText("");
		bg.clearSelection();
		c1.setSelectedIndex(0);
		ta.setText("");
		t3.setText("");
		t4.setText("");
		cb.setSelected(false);
	}
	public static void main(String args[])
	{
	new comp();
	}

	

}
