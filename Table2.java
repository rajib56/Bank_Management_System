import javax.swing.*;
public class Table2
		{
        JFrame f;
        Table2(){
        f=new JFrame("View Account");
        String data[][]={ {"1","76767676899","Savings","28/03/2017","27000.00"},{"2","99786776564","Current","03/04/2017","10400.00"},{"3","54546566878","Savings","26/01/2017","7000.00"}};
        String column[]={"Sl No","Account no.","Account Type","Last date of Transaction","Amount"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(1000,600);
		f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args)
		{
        new Table2();
		}
    }