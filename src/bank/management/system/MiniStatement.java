package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4;
    String pin;
    JButton b1;
    MiniStatement(String pin){
         this.pin=pin;
         l1=new JLabel();
         l1.setBounds(20,140,400,200);
         add(l1);

        l2=new JLabel("SINGHAI'S BANK");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setBounds(150,20,200,20);
        add(l2);

        l3=new JLabel();
        l3.setBounds(20,80,400,20);
        add(l3);

        l4=new JLabel();
        l4.setBounds(20,400,300,20);
        add(l4);

        try {
            connection con = new connection();
            ResultSet rs = con.statement.executeQuery("select * from login where pin_no = '"+pin+"'");
            while (rs.next()){
                l3.setText("Card Number:  "+rs.getString("card_no").substring(0,4)+"XXXXXXXX"+rs.getString("card_no").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            connection con = new connection();
            int balance=0;
            ResultSet rs = con.statement.executeQuery("select * from bank where pin_no='"+pin+"'");
            while(rs.next()){

                l1.setText(l1.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
           l4.setText("Your Total Balance is  Rs. "+balance);

        }catch (Exception e){
            e.printStackTrace();
        }
        b1 = new JButton("EXIT");
        b1.setBounds(20,500,100,25);
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        add(b1);


        setLayout(null);
        setSize(500,600);
        getContentPane().setBackground(new Color(255,204,204));
        setLocation(20,20);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       setVisible(false);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }

}
