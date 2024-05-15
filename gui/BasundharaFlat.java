package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import management.*;


public class BasundharaFlat extends JFrame implements ActionListener{
  JButton b11,b2,b3,b4,b5;
  JLabel l,l1,bl1,bl2,bl3,bl4,bl5,ba1,ba2,ba3,ba4,ba5,ba6,ba7,c1,c2,c3,c4,c5,c6,c7,d1,d2,d3,d4,d5,d6,d7,e1,e2,e3,e4,e5,e6,e7;
  String userEmail;
  Font font32b =new Font ("Bell MT",Font.BOLD,33);
  Font font32=new Font("Bell MT",Font.PLAIN,30);
  Font font16=new Font("Bell MT",Font.BOLD,16);
  Font font20=new Font("Bell MT",Font.BOLD,24);

  public BasundharaFlat(String userEmail){ 
    this.userEmail = userEmail;
//IMAGE SECTION   
   ImageIcon img1=new ImageIcon("./images/wallpaper.png");
   //ImageIcon img2=new ImageIcon("./images/Group 30.png ");
   ImageIcon img3=new ImageIcon("./images/basundhara1.png ");
   ImageIcon img4=new ImageIcon("./images/basundhara2.png");
   ImageIcon img5=new ImageIcon("./images/basundhara3.png ");
   ImageIcon img7=new ImageIcon("./images/basundhara4.png ");
   ImageIcon img6=new ImageIcon("./images/Back button.png");
//BACKROUND LABEL
l=new JLabel();
l.setBounds(0,0,1024,768);
l.setIcon(img1);
//TOP MIDDLE LABEL
   l1=new JLabel();
   l1.setText(" CHOOSE YOUR DESIRED APARTMENT");
   l1.setBounds(233,36,640,48);
   l1.setFont(font32b);
   l1.setForeground(Color.BLACK);
   l.add(l1);
//1ST TOP LEFT CORNER BOX
b2=new JButton("BUY NOW !");
b2.setFont(new Font ("Bell MT",Font.BOLD,18));
b2.setBounds(300,357,135,38);
b2.setBackground(new Color(0X54BAB9));
b2.setOpaque(true);
b2.setBorderPainted(false);
b2.setFocusable(false);
l.add(b2);
bl2=new JLabel(img3);
bl2.setBounds(73,120,405,286);
 l.add(bl2);

ba1=new JLabel();
ba1.setText("Flat Details");
ba1.setBounds(235,8,210,30);
ba1.setFont(font20);
bl2.add(ba1);
ba2=new JLabel();
ba2.setText("Area:2000 sqft");
ba2.setBounds(210,41,210,30);
ba2.setFont(font16);
bl2.add(ba2);
ba3=new JLabel();
ba3.setText("Bedroom: 4 beds ");
ba3.setBounds(210,69,210,30);
ba3.setFont(font16);
bl2.add(ba3);
ba4=new JLabel();
ba4.setText("Bathroom: 4 baths");
ba4.setBounds(210,97,210,30);
ba4.setFont(font16);
bl2.add(ba4);
ba5=new JLabel();
ba5.setText("Parking Spaces: 1");
ba5.setBounds(210,125,210,30);
ba5.setFont(font16);
bl2.add(ba5);
ba6=new JLabel();
ba6.setText("Address: Block B");
ba6.setBounds(210,153,210,30);
ba6.setFont(font16);
bl2.add(ba6);
ba7=new JLabel();
ba7.setText("Price: BDT 3.3 crore");
ba7.setBounds(210,181,210,30);
ba7.setFont(font16);
bl2.add(ba7);
 b2.addActionListener(this);  
//2ND R8 CORNER BOX
 b3=new JButton("BUY NOW !");
 b3.setFont(new Font ("Bell MT",Font.BOLD,18));
 b3.setBounds(759,357,135,38);
 b3.setBackground(new Color(0X54BAB9));
 b3.setOpaque(true);
 b3.setBorderPainted(false);
 b3.setFocusable(false);
 l.add(b3);
  bl3=new JLabel(img4);
  bl3.setBounds(532,120,411,286);

  c1=new JLabel();
     c1.setText("Flat Details");
     c1.setBounds(235,8,210,30);
     c1.setFont(font20);
     bl3.add(c1);
     c2=new JLabel();
     c2.setText("Area: 2410 sqft");
     c2.setBounds(210,41,210,30);
     c2.setFont(font16);
     bl3.add(c2);
     c3=new JLabel();
     c3.setText("Bedroom: 4 beds");
     c3.setBounds(210,69,210,30);
     c3.setFont(font16);
     bl3.add(c3);
     c4=new JLabel();
     c4.setText("Bathroom: 3 baths");
     c4.setBounds(210,97,210,30);
     c4.setFont(font16);
     bl3.add(c4);
     c5=new JLabel();
     c5.setText("Parking Spaces: 0");
     c5.setBounds(210,125,210,30);
     c5.setFont(font16);
     bl3.add(c5);
     c6=new JLabel();
     c6.setText("Address: Block D");
     c6.setBounds(210,153,210,30);
     c6.setFont(font16);
     bl3.add(c6);
     c7=new JLabel();
     c7.setText("Price: BDT 2.7 crore");
     c7.setBounds(210,181,210,30);
     c7.setFont(font16);
     bl3.add(c7);
   l.add(bl3);
 b3.addActionListener(this);
//3RD LEFT CORBER BOX
b4=new JButton("BUY NOW !");
b4.setFont(new Font ("Bell MT",Font.BOLD,18));
b4.setBounds(300,671,135,38);
b4.setBackground(new Color(0X54BAB9));
b4.setOpaque(true);
b4.setBorderPainted(false);
b4.setFocusable(false);
l.add(b4);
bl4=new JLabel(img5);
bl4.setBounds(73,437,419,286);

d1=new JLabel();
d1.setText("Flat Details");
d1.setBounds(235,8,210,30);
d1.setFont(font20);
bl4.add(d1);
d2=new JLabel();
d2.setText("Area: 1560 sqft");
d2.setBounds(210,41,210,30);
d2.setFont(font16);
bl4.add(d2);
d3=new JLabel();
d3.setText("Bedroom: 3 beds");
d3.setBounds(210,69,210,30);
d3.setFont(font16);
bl4.add(d3);
d4=new JLabel();
d4.setText("Bathroom: 1 baths");
d4.setBounds(210,97,210,30);
d4.setFont(font16);
bl4.add(d4);
d5=new JLabel();
d5.setText("Parking Spaces: 1");
d5.setBounds(210,125,210,30);
d5.setFont(font16);
bl4.add(d5);
d6=new JLabel();
d6.setText("Address: Block L");
d6.setBounds(210,153,210,30);
d6.setFont(font16);
bl4.add(d6);
d7=new JLabel();
d7.setText("Price: BDT 1.4 crore");
d7.setBounds(210,181,210,30);
d7.setFont(font16);
bl4.add(d7);
 l.add(bl4);
b4.addActionListener(this);
//4TH BOTTOM R8 CORNER BOX
 b5=new JButton("BUY NOW !");
 b5.setFont(new Font ("Bell MT",Font.BOLD,18));
 b5.setBounds(759,671,135,38);
 b5.setBackground(new Color(0X54BAB9));
 b5.setOpaque(true);
 b5.setBorderPainted(false);
 b5.setFocusable(false);
 l.add(b5);
  bl5=new JLabel(img7);
  bl5.setBounds(532,437,411,286);

  e1=new JLabel();
  e1.setText("Flat Details");
  e1.setBounds(235,8,210,30);
  e1.setFont(font20);
  bl5.add(e1);
  e2=new JLabel();
  e2.setText("Area: 1223 sqft");
  e2.setBounds(210,41,210,30);
  e2.setFont(font16);
  bl5.add(e2);
  e3=new JLabel();
  e3.setText("Bedroom: 3 beds");
  e3.setBounds(210,69,210,30);
  e3.setFont(font16);
  bl5.add(e3);
  e4=new JLabel();
  e4.setText("Bathroom: 3 baths");
  e4.setBounds(210,97,210,30);
  e4.setFont(font16);
  bl5.add(e4);
  e5=new JLabel();
  e5.setText("Parking Spaces: 1");
  e5.setBounds(210,125,210,30);
  e5.setFont(font16);
  bl5.add(e5);
  e6=new JLabel();
  e6.setText("Address: Block C");
  e6.setBounds(210,153,210,30);
  e6.setFont(font16);
  bl5.add(e6);
  e7=new JLabel();
  e7.setText("Price: BDT 1.15 crore");
  e7.setBounds(210,181,210,30);
  e7.setFont(font16);
  bl5.add(e7);
   l.add(bl5);
 b5.addActionListener(this);
//BACK BUTTON 
   b11=new JButton();
   b11.setBounds(10,8,72,72);
   b11.setBackground(Color.WHITE);
   b11.setOpaque(false);
   b11.setFocusable(false);
   b11.setBorderPainted(false);
   l.add(b11);
   bl1=new JLabel(img6);
   bl1.setBounds(10,8,72,72);
   l.add(bl1);
   b11.addActionListener(this);

   this.setTitle("BASUNDHARA APARTMENT");
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setResizable(false);
   this.setSize(1024,768);
   this.setLocationRelativeTo(null);
   this.add(l);
   this.setVisible(true);

  }
   public void actionPerformed(ActionEvent e){
     //for each[4] button[go to card payment]
     if(e.getSource()==b2||e.getSource()==b3||e.getSource()==b4||e.getSource()== b5){
        PaymentMethod f = new PaymentMethod(userEmail);
       this.setVisible(false);
       f.setVisible(true);
     }
    //back button[go to area page]
     else if(e.getSource()==b11){
           Area f = new Area(userEmail);
          this.setVisible(false);
          f.setVisible(true);
    }
}
}