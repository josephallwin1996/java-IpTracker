import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class IpTracker implements ActionListener
{
JTextField t1,t2;
JButton b,b1;
JLabel l,l1;
IpTracker()
{
JFrame f=new JFrame("IPTRACKER");
t2=new JTextField();
t1=new JTextField();
b=new JButton("submit");
b1=new JButton("localhost");
l=new JLabel("enterWeb:");
l1=new JLabel("ip addrs:");
l.setBounds(0,40,90,20);
t1.setBounds(80,40,200,20);
l1.setBounds(0,70,70,20);
t2.setBounds(80,70,200,20);
b.setBounds(160,100,100,20);
b1.setBounds(50,100,100,20);
f.add(l);
t2.setEditable(false);
f.add(t1);
f.add(t2);
f.add(b);
f.add(l1);
f.add(b1);
b1.addActionListener(this);
b.addActionListener(this);
f.setSize(300,150);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
try
{
String web=t1.getText();
String ip=java.net.InetAddress.getByName(web).getHostAddress();
if(e.getSource()==b)
{
t2.setText(ip);
}
if(e.getSource()==b1)
{
web="localhost";
t1.setText("localhost");
t2.setText(ip);
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
public static void main(String a[])
{
IpTracker i=new IpTracker();
}
}
