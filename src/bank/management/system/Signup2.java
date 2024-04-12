package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    String formno;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JComboBox comboBox,comboBox1,comboBox2,comboBox3,comboBox4;
    JTextField t1,t2;
    JRadioButton s1,s2,e1,e2;
    ButtonGroup buttonGroup,buttonGroup1;
    JButton next,clear;
    Signup2(String formno){


        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno =formno;

        l1 =new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);


        l2 = new JLabel("Additional Details-");
        l2.setBounds(300,60,600,30);
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        add(l2);


        l3 = new JLabel("Religion:");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,150,100,30);
         add(l3);

        String religion[]={"Hindu","Sikh","Jainism","Christian","Muslim"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox.setBounds(320,150,320,30);
        add(comboBox);

        l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,200,100,30);
        add(l4);

        String category[]={"GENERAL","MINORITY","OBC","SC","ST","Other"};
        comboBox1 = new JComboBox(category);
        comboBox1.setBackground(new Color(252,208,76));
        comboBox1.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox1.setBounds(320,200,320,30);
        add(comboBox1);


        l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,250,100,30);
        add(l5);

        String income[]={">10,00,000","10,00,000<8,00,000","8,00,000<5,00,000","5,00,000<3,00,000","<2,50,000"};
        comboBox2 = new JComboBox(income);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox2.setBounds(320,250,320,30);
        add(comboBox2);

        l6 = new JLabel("Educational:");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,300,400,30);
        add(l6);

        String Qualification[]={"Post-Graduate","Graduate","Higher-Secondary","Metric","Un-Qualified"};
        comboBox3 = new JComboBox(Qualification);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox3.setBounds(320,300,320,30);
        add(comboBox3);


        l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,350,200,30);
        add(l7);

        String Occupation[]={"Self-Employed","Businessman","Cleark","Salried","Government-Employee"};
        comboBox4 = new JComboBox(Occupation);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD,14));
        comboBox4.setBounds(320,350,320,30);
        add(comboBox4);


        l8 = new JLabel("PAN Number:");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,400,200,30);
        add(l8);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD,14));
        t1.setBounds(320,400,320,30);
        add(t1);


        l8 = new JLabel("Aadhaar Number:");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,450,200,30);
        add(l8);

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD,14));
        t2.setBounds(320,450,320,30);
        add(t2);


        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,500,200,30);
        add(l9);

        s1= new JRadioButton("Yes");
        s1.setFont(new Font("Raleway", Font.BOLD,14));
        s1.setBackground(new Color(252,208,76));
        s1.setBounds(320,500,60,30);
        add(s1);

        s2= new JRadioButton("No");
        s2.setFont(new Font("Raleway", Font.BOLD,14));
        s2.setBackground(new Color(252,208,76));
        s2.setBounds(450,500,90,30);
        add(s2);


        buttonGroup = new ButtonGroup();
        buttonGroup.add(s1);
        buttonGroup.add(s2);

        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,550,200,30);
        add(l10);

        e1= new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(320,550,60,30);
        add(e1);

        e2= new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450,550,90,30);
        add(e2);

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);


        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(550,600,80, 30);
        next.addActionListener(this);
        add(next);

        clear = new JButton("Clear");
        clear.setFont(new Font("Raleway", Font.BOLD, 14));
        clear.setForeground(Color.black);
        clear.setBackground(Color.WHITE);
        clear.setBounds(640,600,80, 30);
        clear.addActionListener(this);
        add(clear);

        l11 = new JLabel("Form no:");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(630,10,120,30);
        add(l11);

        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD,18));
        l12.setBounds(710,10,100,30);
        add(l12);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {


        String religion = (String) comboBox.getSelectedItem();
        String category = (String) comboBox1.getSelectedItem();
        String income = (String) comboBox2.getSelectedItem();
        String education = (String) comboBox3.getSelectedItem();
        String occupation = (String) comboBox4.getSelectedItem();
        String pan_no = t1.getText();
        String aadhar_no = t2.getText();

        String s_c = null;
        if (s1.isSelected()) {
            s_c = "Yes";
        } else if (s2.isSelected()) {
            s_c = "No";
        }
        String E_A = null;
        if (e1.isSelected()) {
            E_A = "Yes";
        } else if (e2.isSelected()) {
            E_A = "No";
        }

        try {

            if (religion.equals("") || category.equals("") || income.equals("") || education.equals("") || occupation.equals("") || pan_no.equals("") || aadhar_no.equals("") || s_c.equals("") || E_A.equals("")) {
                JOptionPane.showMessageDialog(null, "fill all the fields ");

            } else {

                connection con1 = new connection();
                String q = "insert into Signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan_no+"','"+aadhar_no+"','"+s_c+"','"+ E_A+"')";
                con1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }
        public static void main (String[]args){

            new Signup2("");
        }

    }







