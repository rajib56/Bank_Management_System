import javax.swing.*;
public class Table1
		{
        JFrame f;
        Table1(){
        f=new JFrame("View Customer");
        String data[][]={{"1", "Mihir Parida", "734848494948", "Savings", "mihir432@gmail.com" ,"9876565445", "78000.00"},
			{"2", "Sangram Senapati" ,"5465678687089", "Current", "sangrambunty765@gmail.com" ,"7896543677" ,"65980.00"},
			{"3" ,"Ajit Kumar Behera", "76465476678909", "Savings" ,"ajitbehera@gmail.com" ,"8990765125", "87650.00"},
			{"4" ,"Laxman Tudu" ,"24455678768979", "Savings", "tudulaxman@gmail.com", "9987654567", "67660.00"},
			{"5" ,"Yasobanta Sharma" ,"754495475759", "Diposit", "shramayash@gmail.com" ,"8987653444", "45670.00"},
			{"6", "Anil Kumar Dhal", "74238943748", "Savings", "anilkissan@gmail.com" ,"9870063541", "87640.00"},
			{"7", "Rajesh Kumar Singh", "23982947364", "Current", "rajeshku123@gmail.com", "97785342432", "78650.00"},
			{"8" ,"Bibhuti Bhusana Singh", "27383494040" ,"Savings", "bibhutis@gmail.com", "993745327398", "87340.00"}};
        String column[]={"Sl No","Name","Account No.","Account Type","E-mail ID","Mobile No","Balance"};
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
        new Table1();
		}
    }