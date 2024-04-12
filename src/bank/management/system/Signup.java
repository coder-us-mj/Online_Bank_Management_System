package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

    public class Signup extends JFrame implements ActionListener {


     Random ran =new Random();
     long first4 =(ran.nextLong() % 9000L)+1000L;
     String first =""+ Math.abs(first4);
     JRadioButton r1,r2,r3,r4,r5;
     JTextField textName,textFname ,textEmail, textms,textaddress,textCity,textPincode,textState;
     JDateChooser dateChooser;
     JButton next;
    Signup(){

        super("APPLICATION FORM");

       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
       Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon i3 =new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(25,10,100,100);
       add(image);

       JLabel label1 = new JLabel("APPLICATION FORM NO. "+first);
       label1.setBounds(160,20,600,40);
       label1.setFont(new Font("Raleway", Font.BOLD,38));
       add(label1);


        JLabel label2 = new JLabel("PAGE 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway", Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details.");
        label3.setBounds(290,95,600,30);
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        add(label3);


        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD,20));
        labelName.setBounds(100,175,100,25);
        add(labelName);

        textName =new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD,14));
        textName.setBounds(300,175,400,30);
        add(textName);


        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD,20));
        labelfName.setBounds(100,225,200,25);
        add(labelfName);

        textFname =new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD,14));
        textFname.setBounds(300,225,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(100,310,200,25);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,310,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD,20));
        labelG.setBounds(100,270,200,30);
        add(labelG);

        r1= new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,270,60,30);
        add(r1);

        r2= new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,270,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail =new JLabel("Email :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,370,200,30);
        add(labelEmail);

        textEmail =new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(300,370,400,30);
        add(textEmail);

        JLabel labelms =new JLabel("Marital Status :");
        labelms.setFont(new Font("Raleway",Font.BOLD,20));
        labelms.setBounds(100,420,200,30);
        add(labelms);

        r3= new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,420,100,30);
        add(r3);

        r4= new JRadioButton("Un Married");
        r4.setFont(new Font("Raleway", Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,420,150,30);
        add(r4);

        r5 = new JRadioButton("Other's");
        r5.setFont(new Font("Raleway", Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(600,420,100,30);
        add(r5);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);
        buttonGroup1.add(r5);

        JLabel labeladd =new JLabel("Address :");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,480,200,30);
        add(labeladd);

        textaddress =new JTextField();
        textaddress.setFont(new Font("Raleway", Font.BOLD,14));
        textaddress.setBounds(300,480,400,30);
        add(textaddress);

        JLabel labelCity =new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity =new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPincode=new JLabel("Pin code :");
        labelPincode.setFont(new Font("Raleway",Font.BOLD,20));
        labelPincode.setBounds(100,600,200,30);
        add(labelPincode);

        textPincode =new JTextField();
        textPincode.setFont(new Font("Raleway", Font.BOLD,14));
        textPincode.setBounds(300,600,400,30);
        add(textPincode);

        JLabel labelState =new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,660,200,30);
        add(labelState);

        textState =new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD,14));
        textState.setBounds(300,660,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(620,710,80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setUndecorated(true);
        setVisible(true);

     }
    @Override
    public void actionPerformed(ActionEvent e) {
      try{
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "female";
        }
        String email=textEmail.getText();
        String ms=null;
        if(r3.isSelected()){
            ms="married";
        } else if (r4.isSelected()) {
            ms="un-married";
        }else {
            ms="others";
        }
        String address = textaddress.getText();
        String city = textCity.getText();
        String pin = textPincode.getText();
        String state = textState.getText();

        try{
            if (name.equals("")||fname.equals("")||dob.equals("")||gender.equals("")||email.equals("")||address.equals("")||ms.equals("")||city.equals("")||pin.equals("")||state.equals("")){

                JOptionPane.showMessageDialog(null,"fill all the fields ");

            }else{

                connection con1 = new connection();
                String q ="insert into Signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+ms+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }catch (Exception p){
         p.printStackTrace();
      }
    }
    public static void main(String[] args) {

        new Signup();
    }
}

