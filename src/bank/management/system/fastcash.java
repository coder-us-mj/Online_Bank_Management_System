package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastcash extends JFrame  implements ActionListener {

    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    String pin;
    fastcash(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1= new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        l2= new JLabel(" SELECT  WITHDRAWAL  AMOUNT");
        l2.setBounds(430,180,700,35);
        l2.setForeground(Color.white);
        l2.setFont(new Font("System",Font.BOLD,23));
        l1.add(l2);


        b1 = new JButton("RS. 100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("RS. 200");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        l1.add(b2);


        b3 = new JButton("RS. 500");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        b3.setBounds(410,318,150,35);
        l1.add(b3);

        b4 = new JButton("RS. 1000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
        l1.add(b4);

        b5 = new JButton("RS. 2000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        l1.add(b5);

        b6 = new JButton("RS. 3000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        l1.add(b6);

        b7 = new JButton("BACK");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,406,150,35);
        b7.addActionListener(this);
        l1.add(b7);


        b8 = new JButton("RS. 5000");
        b8.setForeground(Color.white);
        b8.setBackground(new Color(65,125,128));
        b8.setBounds(410,406,150,35);
        b8.addActionListener(this);
        l1.add(b8);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b7){
          setVisible(false);
          new main_class(pin);
      }else{
          String amount =((JButton)e.getSource()).getText().substring(4);
          connection con = new connection();
          Date date = new Date();
          try{
              ResultSet rs = con.statement.executeQuery("select * from bank where pin_no='"+pin+"'");
              int balance =0;
              while(rs.next()){
                  if (rs.getString("type").equals("Deposit")) {
                      balance += Integer.parseInt(rs.getString("amount"));
                  }
                  else {
                      balance -= Integer.parseInt(rs.getString("amount"));
                  }
              }
              if(e.getSource()!=b7 && balance < Integer.parseInt(amount)){
                  JOptionPane.showMessageDialog(null,"Insufficient Balance");
                  return;
              }
              con.statement.executeUpdate("Insert into bank values ('"+pin+"','"+date+"','Withdraw','"+amount+"')");
                  JOptionPane.showMessageDialog(null, "Rs. "+amount+"Debited Successfully");

          }catch (Exception E){
              E.printStackTrace();
          }
         setVisible(false);
         new main_class(pin);
      }
    }

    public static void main(String[] args) {
        new fastcash("");
    }
}
