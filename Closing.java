import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class Closing extends JFrame
{
  JFrame f;
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
  JTextField t1,t2,t4,t5,t6,t7,t8,t9,t10,t11;
  JButton b1,b2;
  JComboBox cb1,cb2;
  String s1,s2;

  Closing()
	{
   f=new JFrame("Closing");
   f.setContentPane(new JLabel (new ImageIcon("Closing_back.jpg")));
   l1=new JLabel("Date :");  
   l1.setBounds(30,30, 200,30);
   l1.setFont(new Font("serif", Font.BOLD,15));
   l2=new JLabel("Loan No :");    
   l2.setBounds(30,80, 200,30);
   l2.setFont(new Font("serif", Font.BOLD,15));
   l3=new JLabel("Loan Type :");
   l3.setBounds(30,130, 200,30);
   l3.setFont(new Font("serif", Font.BOLD,15));
   l4=new JLabel("Amount :");
   l4.setBounds(30,180, 200,30);
   l4.setFont(new Font("serif", Font.BOLD,15));
   l5=new JLabel("Rate :");
   l5.setBounds(30,230, 200,30);
   l5.setFont(new Font("serif", Font.BOLD,15));
   l6=new JLabel("Term(month) :"); 
   l6.setBounds(30,280, 200,30);
   l6.setFont(new Font("serif", Font.BOLD,15));
   l7=new JLabel("EMI Amount :");
   l7.setBounds(30,330,200,30);
   l7.setFont(new Font("serif", Font.BOLD,15));
   l8=new JLabel("No.Of EMI :");
   l8.setBounds(30,380,200,30);
   l8.setFont(new Font("serif", Font.BOLD,15));
   l9=new JLabel("Paid Amount :");
   l9.setBounds(30,430,200,30);
   l9.setFont(new Font("serif", Font.BOLD,15));
   l10=new JLabel("Due Amount :");
   l10.setBounds(30,480,200,30);
   l10.setFont(new Font("serif", Font.BOLD,15));
   t1=new JTextField();
   t1.setBounds(170,30, 250,30); 
   t2=new JTextField();
   t2.setBounds(170,80, 250,30); 
   t4=new JTextField();
   t4.setBounds(170,180, 250,30); 
   t5=new JTextField();
   t5.setBounds(170,230, 250,30); 
   t6=new JTextField();
   t6.setBounds(170,280, 250,30); 
   t7=new JTextField();
   t7.setBounds(170,330, 250,30); 
   t8=new JTextField();
   t8.setBounds(170,380, 250,30);
   t9=new JTextField();
   t9.setBounds(170,430, 250,30);
   t10=new JTextField();
   t10.setBounds(170,480, 250,30);
   b1=new JButton("Continue");
   b1.setBounds(50,550,120,30);
   b2=new JButton("Close");
   b2.setBounds(255,550,120,30);
   String s1[]={"Home","Education","Vehicle","Personal"};
   cb1=new JComboBox(s1);
   cb1.setBounds(170,130, 250,30);

   b2.addActionListener((ActionEvent event) -> {
            f.setVisible(false);
			});

	b1.addActionListener((ActionEvent event) -> {
			JOptionPane.showMessageDialog(f,"Information has been Updated!!!","Update",JOptionPane.PLAIN_MESSAGE);
			});

   f.add(l1);
   f.add(l2);
   f.add(l3);
   f.add(l4);
   f.add(l5);
   f.add(l6);
   f.add(l7);
   f.add(l8);
   f.add(l9);
   f.add(l10);
   f.add(t1);
   f.add(t2);
   f.add(t4);
   f.add(t5);
   f.add(t6);
   f.add(t7);
   f.add(t8);
   f.add(t9);
   f.add(t10);
   f.add(b1);
   f.add(b2);
   f.add(cb1);
   f.setSize(470,650);
   f.setUndecorated(true);
   f.setLocationRelativeTo(null);
   f.setLayout(null);  
   f.setVisible(true);  
    }
	public static void main(String[] args)
	{
		new  Closing();
	}
}