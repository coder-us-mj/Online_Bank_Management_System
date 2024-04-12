package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
      JLabel l3,label1;
      JButton button1,button2;
      TextField t1;
      String pin;
     Deposit(String pin){

              this.pin=pin;
              ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
              Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
              ImageIcon i3 = new ImageIcon(i2);
              l3= new JLabel(i3);
              l3.setBounds(0,0,1550,830);
              add(l3);

              label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
              label1.setForeground(Color.white);
              label1.setFont(new Font("System",Font.BOLD, 16));
              label1.setBounds(460,180,400,35);
              l3.add(label1);

              t1= new TextField();
              t1.setBackground(new Color(65,125,128));
              t1.setForeground(Color.white);
              t1.setBounds(460,230,320,35);
              t1.setFont(new Font("Raleway",Font.BOLD,22));
              l3.add(t1);



             button1 = new JButton("DEPOSIT");
             button1.setFont(new Font("Raleway", Font.BOLD, 14));
             button1.setForeground(Color.WHITE);
             button1.setBackground(new Color(65,125,128));
             button1.setBounds(700,362,150, 35);
             button1.addActionListener(this);
             l3.add(button1);

              button2 = new JButton("BACK");
              button2.setFont(new Font("Raleway", Font.BOLD, 14));
              button2.setForeground(Color.WHITE);
              button2.setBackground(new Color(65,125,128));
              button2.setBounds(700,406,150, 35);
              button2.addActionListener(this);
              l3.add(button2);


              setLayout(null);
              setSize(1550,1080);
              setLocation(0,0);
              setUndecorated(true);
              setVisible(true);

     }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
         String amount=t1.getText();
         Date date = new Date();
          if (e.getSource()==button1){
              if (t1.getText().equals("")){
                  JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
              }else {

                  connection con1 = new connection();
                  con1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                  JOptionPane.showMessageDialog(null,"Rs. "+amount+"Deposit Successful");
                  setVisible(false);
                  new main_class(pin);
              }

           } else if (e.getSource()==button2)
           {
               new main_class(pin);
              setVisible(false);

           }

         }catch (Exception T){
                T.printStackTrace();
         }
     }

    public static void main(String[] args) {
        new Deposit("");
    }

}
