package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdraw extends JFrame implements ActionListener {

    JLabel l3,label1,label2;
    JButton button1,button2;
    TextField t1;
    String pin;
    withdraw(String pin){

       this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l3= new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        label1 = new JLabel("MAXIMUM WITHDRAW LIMIT IS RS.10000");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD, 16));
        label1.setBounds(460,180,700,35);
        l3.add(label1);

        label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD, 16));
        label2.setBounds(460,220,700,35);
        l3.add(label2);


        t1= new TextField();
        t1.setBackground(new Color(65,125,128));
        t1.setForeground(Color.white);
        t1.setBounds(460,260,320,35);
        t1.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(t1);

        button1 = new JButton("WITHDRAW");
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
        if (e.getSource() == button1) {
            try {

                String amount = t1.getText();
                Date date = new Date();
                if (t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    connection con1 = new connection();
                    ResultSet resultSet = con1.statement.executeQuery("select * from bank where pin_no = '" + pin + "' ");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    } else {
                        con1.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdraw','" + amount + "')");
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited successfully");
                        setVisible(false);
                        new main_class(pin);
                    }

                }

            } catch (Exception T) {
                T.printStackTrace();
            }
        } else if (e.getSource()==button2) {
            setVisible(false);
            new main_class(pin);
        }
    }
    public static void main(String[] args) {
        new withdraw("");
    }
}
