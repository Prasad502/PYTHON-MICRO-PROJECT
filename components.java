import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class components extends JFrame implements ActionListener
{
JFrame f1;
JPanel p1,p2;
JLabel l1,l2,l3,l4,l5,l6,l7;
ImageIcon i1,i2,i3,i4,i5;
JTextField t1;
JPasswordField t2;
JButton b1;
components()
{
f1=new JFrame(); 
p1=new JPanel();
p2=new JPanel();
f1.getContentPane();
i1=new ImageIcon("user.png");
i2=new ImageIcon("online-wallet.png");
i3=new ImageIcon("icon1.png");
i4=new ImageIcon("password.png");
i5=new ImageIcon("back.png");
l1=new JLabel(i1);
l2=new JLabel("User Login",i2,JLabel.CENTER);
l3=new JLabel(i3);
l4=new JLabel(i4);
l5=new JLabel(i5);
l6=new JLabel("Powered By Linkcode");
l7=new JLabel("Linkcode");
t1=new JTextField("Enter Username...");
t2=new JPasswordField();
b1=new JButton("Login");
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
t1.setBounds(650, 300, 305, size1.height);
p1.add(t1);
t2.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
//Dimension size3 = t2.getPreferredSize();
t2.setBounds(650, 400, 316, 60);
p1.add(t2);
b1.setFont(new Font("Verdana", Font.PLAIN, 20));
b1.setForeground(new Color(0,181,204));
b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
b1.setContentAreaFilled(false);
Dimension size3 = b1.getPreferredSize();
b1.setBounds(780, 480, size3.width, size3.height);
p1.add(b1);
b1.addActionListener(this);
Dimension size4 = l3.getPreferredSize();
l3.setBounds(970, 330, size4.width, size4.height);
p1.add(l3);
Dimension size5 = l4.getPreferredSize();
l4.setBounds(970, 427, size5.width, size5.height);
p1.add(l4);
l5.setBounds(-35,5,100,20);
p2.add(l5);
l5.addMouseListener(new MouseAdapter(){
public void mouseClicked(MouseEvent ea) {
new Application();
dispose();
}});
l7.setBounds(40,7, 300, 64);
l7.setFont(new Font("Verdana", Font.PLAIN, 40));
p2.add(l7);
l6.setBounds(1200,670,140,100);
p1.add(l6);
setSize(1729,800);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null); 
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(t1.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please Enter The Username");
}
else
{
if(t2.getText().equals(""))
{
JOptionPane.showMessageDialog(null,"Please Enter The Password");
}
else
{
String url="jdbc:mysql://localhost:3306/recharge";
String uname="root";
String pass="";
String query= "SELECT Username,Password FROM login WHERE username ='"+t1.getText()+"'"+"AND password='"+t2.getText()+"'";
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,uname,pass);
PreparedStatement st=con.prepareStatement(query);
ResultSet rs=st.executeQuery();
if(rs.next())
{
JOptionPane.showMessageDialog(null,"Login Sucessful");
clearfield2();
dashboard d1=new dashboard();
d1.setVisible(true);
dispose();
}
else
{
JOptionPane.showMessageDialog(null,"Incorrect Username or password");
}
} catch (Exception ex) {
JOptionPane.showMessageDialog(null,"Error while login"+ex); 
}
}		
}
}
public void clearfield2()
{
t1.setText("");
t2.setText("");
}
public static void main(String args[])
{
new components();
}
}





























