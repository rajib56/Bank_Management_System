import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BMS implements ActionListener
{   
		JFrame f;
		JMenuBar mb;
		JMenu cust,acc,loan;
		JMenuItem w,d,t,v;
		JMenuItem a,uc,dl,vc;
		JMenuItem pl,c,vl;
		JPanel panel;
		
		BMS()
		{
			f=new JFrame("Customer Access");
			f.setContentPane(new JLabel (new ImageIcon("BMS1.jpg")));
			w=new JMenuItem("Withdraw");
			d=new JMenuItem("Deposit");    
			t=new JMenuItem("Transfer"); 
			v=new JMenuItem("View Account");    
			w.addActionListener(this);    
			d.addActionListener(this);    
			t.addActionListener(this);    
			v.addActionListener(this);   
			a=new JMenuItem("Add");    
			uc=new JMenuItem("Update");    
			dl=new JMenuItem("Delete");    
			vc=new JMenuItem("View Customer");    
			a.addActionListener(this);    
			uc.addActionListener(this);    
			dl.addActionListener(this);    
			vc.addActionListener(this);  
			pl=new JMenuItem("Payment");    
			c=new JMenuItem("Closing");    
			vl=new JMenuItem("View Loan Statement");    
			pl.addActionListener(this);    
			c.addActionListener(this);    
			vl.addActionListener(this);    
			mb=new JMenuBar();    
			cust=new JMenu("Customer");    
			acc=new JMenu("Account");    
			loan=new JMenu("Loan");    
			cust.add(a);cust.addSeparator();cust.add(uc);cust.addSeparator();cust.add(dl);cust.addSeparator();cust.add(vc);
			acc.add(w);acc.addSeparator();acc.add(d);acc.addSeparator();acc.add(t);acc.addSeparator();acc.add(v); 
			loan.add(pl);loan.addSeparator();loan.add(c);loan.addSeparator();loan.add(vl);
			mb.add(cust);mb.add(acc);mb.add(loan);
			JToolBar toolbar1 = new JToolBar();
            ImageIcon newi = new ImageIcon("new.png");
			ImageIcon open = new ImageIcon("open.png");
			ImageIcon save = new ImageIcon("save.png");
			ImageIcon exit = new ImageIcon("exit.png");


			JButton newb = new JButton(newi);
			newb.addActionListener((ActionEvent event) -> {
            new Add();
			});
			JButton openb = new JButton(open);
			newb.addActionListener((ActionEvent event) -> {
            new Add();
			});
			JButton saveb = new JButton(save);
			newb.addActionListener((ActionEvent event) -> {
            new Add();
			});
			JButton exitb = new JButton(exit);
			exitb.addActionListener((ActionEvent event) -> {
            System.exit(0);
			});

			toolbar1.add(newb);
			toolbar1.add(openb);
			toolbar1.add(saveb);
			toolbar1.add(exitb);
			
	        

			f.add(mb);
			f.setLayout(new FlowLayout(FlowLayout.LEFT));
			toolbar1.setFloatable(false);
			f.add(toolbar1);
			f.setJMenuBar(mb);
			f.setExtendedState(JFrame.MAXIMIZED_BOTH);   
			f.setVisible(true);    
		}     
		public void actionPerformed(ActionEvent e) 
		{    
			if(e.getSource()==w)
				{
			    new Withdraw();
				}
			if(e.getSource()==d)
				{
				new Deposite();
				}
			if(e.getSource()==t)
				{
				new Transfer();
				}
			if(e.getSource()==v)
				{}
			if(e.getSource()==a)
				{
				new Add();
				}
			if(e.getSource()==uc)
				{
				new  Update();
				}
			if(e.getSource()==dl)
				{
				new  Closing();
				}
			if(e.getSource()==vc)
				{}
			if(e.getSource()==pl)
				{
				new  Payment();
				}
			if(e.getSource()==c)
				{
				new  Closing();
				}

			if(e.getSource()==vc)
				{
				new Table1();
				}

			if(e.getSource()==v)
				{
				new Table2();
				}

			if(e.getSource()==vl)
				{
				new Table3();
				}
		}
		
public static void main(String[] args)
	{
	new BMS();
	}
}