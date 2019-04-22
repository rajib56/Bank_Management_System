import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class Deposite extends JFrame
{
  JFrame f;
  JLabel l1,l2,l3,l4,l5,l6;
  JTextField t1,t2,t3,t4,t5,t6;
  JButton b1,b2;
  JComboBox cb1;
  String s1;

  Deposite()
	{
   f=new JFrame("Deposite");
   f.setContentPane(new JLabel (new ImageIcon("Deposite_Back.jpg")));
   l1=new JLabel("Date :");  
   l1.setBounds(30,30, 200,30);
   l1.setFont(new Font("serif", Font.BOLD,15));
   l2=new JLabel("Account No :");    
   l2.setBounds(30,80, 200,30);
   l2.setFont(new Font("serif", Font.BOLD,15));
   l3=new JLabel("Customer Name :");
   l3.setBounds(30,130, 200,30);
   l3.setFont(new Font("serif", Font.BOLD,15));
   l4=new JLabel("Previous Balance :");
   l4.setBounds(30,180, 200,30);
   l4.setFont(new Font("serif", Font.BOLD,15));
   l5=new JLabel("Transaction Mode :");
   l5.setBounds(30,230, 200,30);
   l5.setFont(new Font("serif", Font.BOLD,15));
   l6=new JLabel("Deposite Amount :"); 
   l6.setBounds(30,280, 200,30);
   l6.setFont(new Font("serif", Font.BOLD,15));
   t1=new JTextField("DD/MM/YYYY");
   t1.setBounds(170,30, 250,30); 
   t2=new JTextField();
   t2.setBounds(170,80, 250,30); 
   t4=new JTextField();
   t4.setBounds(170,180, 250,30); 
   t5=new JTextField();
   t5.setBounds(170,280, 250,30);
   t6=new JTextField();
   t6.setBounds(170,130, 250,30);
   b1=new JButton("Cancel");
   b1.setBounds(70,340,120,30);
   b1.setContentAreaFilled(false);
   b1.setOpaque(false);
   b1.setBorderPainted(true);
   b2=new JButton("Save Transaction");
   b2.setBounds(225,340,165,30);
   b2.setContentAreaFilled(false);
   b2.setOpaque(false);
   b2.setBorderPainted(true);
   String s1[]={"Cash","Cheque","Debit Card","Demand Draft"};
   cb1=new JComboBox(s1);
   cb1.setBounds(170,230,250,30);

   b1.addActionListener((ActionEvent event) -> {
            f.setVisible(false);
			});

	b2.addActionListener((ActionEvent event) -> {
			JOptionPane.showMessageDialog(f,"Amount of Money has been Diposited !!!","Diposite",JOptionPane.PLAIN_MESSAGE);
			});

   f.add(l1);
   f.add(l2);
   f.add(l3);
   f.add(l4);
   f.add(l5);
   f.add(l6);
   f.add(t1);
   f.add(t2);
   f.add(t4);
   f.add(t5);
   f.add(t6);
   f.add(b1);
   f.add(b2);
   f.add(cb1);
   f.setSize(465,440);
   f.setUndecorated(true);
   f.setLocationRelativeTo(null);
   f.setLayout(null);  
   f.setVisible(true);  
    }
	public static void main(String[] args)
	{
		new Deposite();
	}
}