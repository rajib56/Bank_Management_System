import javax.swing.*;
public class Table3
		{
        JFrame f;
        Table3(){
        f=new JFrame("Loan Statement");
        String data[][]={ {"1","25/03/2014","67000","Home","8%","800/month","12400"},{"2","14/04/2015","7800","Study","3.2%","200/month","4000"}};
        String column[]={"Sl No.","Date of issue","Amount","Loan Type","Rate","EMI","Due Amount"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(1200,650);
		f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
		{
        new Table3();
		}
    }