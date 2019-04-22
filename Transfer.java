import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class Transfer extends JFrame

{
  JFrame f;
  JLabel l1,l2,l3,l4,l5,l6,l7;
  JTextField t1,t2,t3,t4,t5,t6,t7;
  JButton b1,b2;
  String s1;
 Transfer()
	{
   f=new JFrame("Transfer");
   f.setContentPane(new JLabel (new ImageIcon("Transfer_Back.jpg")));
   l1=new JLabel("Date :");  
   l1.setBounds(30,30, 200,30);  
   l2=new JLabel("Account No :");    
   l2.setBounds(30,80, 200,30);
   l3=new JLabel("Customer Name :");
   l3.setBounds(30,130, 200,30);
   l4=new JLabel("Previous Balance :");
   l4.setBounds(30,180, 200,30);
   l5=new JLabel("Destination A/C No :");
   l5.setBounds(30,230, 200,30);
   l6=new JLabel("Transfer Amount :"); 
   l6.setBounds(30,280, 200,30);
   l7=new JLabel("Transfer Amount :"); 
   l7.setBounds(30,280, 200,30);
   t1=new JTextField("DD/MM/YYYY");
   t1.setBounds(170,30, 250,30); 
   t2=new JTextField();
   t2.setBounds(170,80, 250,30); 
   t3=new JTextField();
   t3.setBounds(170,80, 250,30);
   t4=new JTextField();
   t4.setBounds(170,180, 150,30); 
   t5=new JTextField();
   t5.setBounds(170,230, 250,30);
   t6=new JTextField();
   t6.setBounds(170,130, 250,30);
   t7=new JTextField();
   t7.setBounds(170,280, 150,30);
   b1=new JButton("Cancel");
   b1.setBounds(50,340,120,30);
   b2=new JButton("Save Transaction");
   b2.setBounds(230,340,160,30);
   
   b1.addActionListener((ActionEvent event) -> {
            f.setVisible(false);
			});

	b2.addActionListener((ActionEvent event) -> {
			JOptionPane.showMessageDialog(f,"Money has been Transferred!!!","Transfer",JOptionPane.PLAIN_MESSAGE);
			});
   f.add(l1);
   f.add(l2);
   f.add(l3);
   f.add(l4);
   f.add(l5);
   f.add(l6);
   f.add(t1);
   f.add(t2);
   f.add(t3);
   f.add(t4);
   f.add(t5);
   f.add(t6);
   f.add(t7);
   f.add(b1);
   f.add(b2);
   f.setSize(470,450);
   f.setUndecorated(true);
   f.setLocationRelativeTo(null);
   f.setLayout(null);  
   f.setVisible(true);  
    }
	public static void main(String[] args)
	{
		new Transfer();
	}
}