package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    String formno;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l12;
    JRadioButton a1,a2,a3,a4;
    JCheckBox C1,C2,C3,C4,C5,C6,C7;
    JButton sub,can;
    ButtonGroup buttonGroup;

    Signup3(String formno){

        super("APPLICATION FORM");
        this.formno =formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);



        l1 =new JLabel("Page 3:-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);


        l2 = new JLabel("Account Details-");
        l2.setBounds(300,60,600,30);
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        add(l2);


        l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD,19));
        l3.setBounds(100,150,150,30);
        add(l3);

        a1= new JRadioButton("Saving Account");
        a1.setFont(new Font("Raleway", Font.BOLD,16));
        a1.setBackground(new Color(197, 235, 236));
        a1.setBounds(105,190,150,30);
        add(a1);

        a2= new JRadioButton("Fixed Deposit Account");
        a2.setFont(new Font("Raleway", Font.BOLD,16));
        a2.setBackground(new Color(197, 235, 236));
        a2.setBounds(400,190,250,30);
        add(a2);

        a3= new JRadioButton("Current Account");
        a3.setFont(new Font("Raleway", Font.BOLD,16));
        a3.setBackground(new Color(197, 235, 236));
        a3.setBounds(105,230,150,30);
        add(a3);

        a4= new JRadioButton("Recurring Deposit Account");
        a4.setFont(new Font("Raleway", Font.BOLD,16));
        a4.setBackground(new Color(197, 235, 236));
        a4.setBounds(400,230,250,30);
        add(a4);

        buttonGroup =new ButtonGroup();
        buttonGroup.add(a1);
        buttonGroup.add(a2);
        buttonGroup.add(a3);
        buttonGroup.add(a4);

        l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD,19));
        l4.setBounds(100,310,150,30);
        add(l4);

        l5 = new JLabel("XXXX-XXXX-XXXX-7307");
        l5.setFont(new Font("Raleway", Font.BOLD,19));
        l5.setBounds(380,310,250,30);
        add(l5);

        l6 = new JLabel("(Your 16-digit Card number)");
        l6.setFont(new Font("Raleway", Font.BOLD,12));
        l6.setBounds(100,335,200,30);
        add(l6);

        l5 = new JLabel("It would appear on ATM Card/Cheque Book and Statement");
        l5.setFont(new Font("Raleway", Font.BOLD,12));
        l5.setBounds(380,335,350,30);
        add(l5);


        l6 = new JLabel("PIN:");
        l6.setFont(new Font("Raleway", Font.BOLD,19));
        l6.setBounds(100,390,150,30);
        add(l6);

        l7 = new JLabel("XXXX");
        l7.setFont(new Font("Raleway", Font.BOLD,19));
        l7.setBounds(380,390,250,30);
        add(l7);

        l8 = new JLabel("(4-digit password)");
        l8.setFont(new Font("Raleway", Font.BOLD,12));
        l8.setBounds(100,410,200,30);
        add(l8);

        l9 = new JLabel("Service Required:");
        l9.setFont(new Font("Raleway", Font.BOLD,19));
        l9.setBounds(100,480,250,30);
        add(l9);

        C1 = new JCheckBox("ATM CARD");
        C1.setFont(new Font("Raleway", Font.BOLD,16));
        C1.setBounds(100,530,200,30);
        C1.setBackground(new Color(197, 235, 236));
        add(C1);

        C2 = new JCheckBox("Internet Banking");
        C2.setFont(new Font("Raleway", Font.BOLD,16));
        C2.setBounds(380,530,200,30);
        C2.setBackground(new Color(197, 235, 236));
        add(C2);

        C3 = new JCheckBox("Mobile Banking");
        C3.setFont(new Font("Raleway", Font.BOLD,16));
        C3.setBounds(100,570,200,30);
        C3.setBackground(new Color(197, 235, 236));
        add(C3);

        C4 = new JCheckBox("EMAIL Alerts");
        C4.setFont(new Font("Raleway", Font.BOLD,16));
        C4.setBounds(380,570,200,30);
        C4.setBackground(new Color(197, 235, 236));
        add(C4);

        C5 = new JCheckBox("Cheque Book");
        C5.setFont(new Font("Raleway", Font.BOLD,16));
        C5.setBounds(100,610,200,30);
        C5.setBackground(new Color(197, 235, 236));
        add(C5);

        C6 = new JCheckBox("E-Statement");
        C6.setFont(new Font("Raleway", Font.BOLD,16));
        C6.setBounds(380,610,200,30);
        C6.setBackground(new Color(197, 235, 236));
        add(C6);

        C7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.");
        C7.setFont(new Font("Raleway", Font.BOLD,12));
        C7.setBounds(100,680,400,30);
        C7.setBackground(new Color(197, 235, 236));
        add(C7);

        l11 = new JLabel("Form no:");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(630,10,120,30);
        add(l11);

        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD,18));
        l12.setBounds(710,10,100,30);
        add(l12);

        sub = new JButton(" Submit");
        sub.setFont(new Font("Raleway", Font.BOLD, 14));
        sub.setForeground(Color.WHITE);
        sub.setBackground(Color.BLACK);
        sub.setBounds(250,730,100, 30);
        sub.addActionListener(this);
        add(sub);

        can = new JButton("Cancel");
        can .setFont(new Font("Raleway", Font.BOLD, 14));
        can .setForeground(Color.WHITE);
        can .setBackground(Color.black);
        can .setBounds(440,730,100, 30);
        can .addActionListener(this);
        add(can);

        setLayout(null);
        setSize(850,840);
        setLocation(450,20);
        getContentPane().setBackground(new Color(197, 235, 236));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String account = null;
        if(a1.isSelected()){
            account="Saving Account";

        } else if (a2.isSelected()) {

            account="Fixed Deposit Account";
        }else if (a3.isSelected()) {

            account="Current Account";
        }else if (a4.isSelected()) {

            account="Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 7307916600000000L;
        String cardno="" + Math.abs(first7);

        long first3 =(ran.nextLong() % 9000L) +1000L;
        String pin=""+Math.abs(first3);

        String services="";
        if (C1.isSelected()){
            services += "ATM CARD, ";
        }if (C2.isSelected()) {
            services +=  "Internet Banking, ";
        }if (C3.isSelected()) {
            services += "Mobile Banking, ";
        }if (C4.isSelected()) {
            services += "EMAIL Alerts, ";
        }if (C5.isSelected()) {
            services += "Cheque Book, ";
        }if (C6.isSelected()) {
            services += "E-Statement, ";
        }

        try {

            if(e.getSource()==sub){
                if (services.equals("")){
                    JOptionPane.showMessageDialog(null,"fill all the fields");
                }else {
                    connection con1 = new connection();
                    String q ="insert into signup3 values('"+formno+"','"+account+"','"+cardno+"','"+pin+"','"+services+"')";

                    String q2 ="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    con1.statement.executeUpdate(q);
                    con1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number :"+cardno+"\n Pin :" +pin);
                    new Deposit(pin);
                    setVisible(false);

                }
            }else if(e.getSource()==can){
                System.exit(0);

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Signup3("");
    }
}
