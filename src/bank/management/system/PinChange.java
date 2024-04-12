package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JLabel label,label1,label2,label3;
    JButton button1,button2;
    JPasswordField p1,p2;
    String pin;
    PinChange(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        label= new JLabel(i3);
        label.setBounds(0,0,1550,830);
        add(label);

        label1 = new JLabel("CHANGE YOUR PIN:");
        label1.setForeground(Color.white);
        label1.setFont(new Font("System",Font.BOLD, 16));
        label1.setBounds(430,180,400,35);
        label.add(label1);

        label2 = new JLabel("New PIN:");
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD, 16));
        label2.setBounds(430,225,150,35);
        label.add(label2);

        p1=new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setBounds(600,230,180,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        label.add(p1);

        label3 = new JLabel("Re-Enter New PIN:");
        label3.setForeground(Color.white);
        label3.setFont(new Font("System",Font.BOLD, 16));
        label3.setBounds(430,260,400,35);
        label.add(label3);

        p2=new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setBounds(600,265,180,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        label.add(p2);


        button1 = new JButton("CHANGE");
        button1.setFont(new Font("Raleway", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(65,125,128));
        button1.setBounds(700,362,150, 35);
        button1.addActionListener(this);
        label.add(button1);

        button2 = new JButton("BACK");
        button2.setFont(new Font("Raleway", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(65,125,128));
        button2.setBounds(700,406,150, 35);
        button2.addActionListener(this);
        label.add(button2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if (e.getSource()==button1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter new PIN");
                    return;
                }if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter new PIN");
                    return;
                }
                connection con = new connection();
                String q1 ="update bank set pin_no = '"+pin1+"'where pin_no = '"+pin+"'";
                String q2 ="update login set pin_no = '"+pin1+"'where pin_no = '"+pin+"'";
                String q3 ="update signup3 set pin_no = '"+pin1+"'where pin_no = '"+pin+"'";

                con.statement.executeUpdate(q1);
                con.statement.executeUpdate(q2);
                con.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN Change Successfully");
                setVisible(false);
                new main_class(pin);

            } else if (e.getSource()==button2) {
                new main_class(pin);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }







    }

    public static void main(String[] args) {
         new PinChange("");
    }


}
