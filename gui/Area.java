package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import management.*;

public class Area extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;
    JLabel l,bl1,bl2,bl3,l1,l2,l3,bl4;
    
    Font font40 =new Font ("Bell MT",Font.BOLD,40);
    Font font35=new Font("Bell MT",Font.BOLD,35);

    String userEmail;

public Area (String userEmail){
  this.userEmail = userEmail;

    ImageIcon img1=new ImageIcon("./images/wallpaper.png");
    ImageIcon img2=new ImageIcon("./images/image 1.png");
    ImageIcon img3=new ImageIcon("./images/image 2.png");
    ImageIcon img4=new ImageIcon("./images/image 31.png");
    ImageIcon img5=new ImageIcon("./images/Back button.png");

    
    l=new JLabel();
    l.setBounds(0,0,1024,768);
    this.setTitle("Area Selection");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(1024,768);
    this.setLocationRelativeTo(null);
    l.setIcon(img1);
  
    l1=new JLabel();
    l1.setText("CHOOSE YOUR DESIRED AREA");
    l1.setBounds(215,36,630,60);
    l1.setFont(font40);
    l1.setForeground(Color.BLACK);
    l.add(l1);


    b1=new JButton("UTTARA");
    b1.setFont(new Font("Bell MT",Font.PLAIN,35));
		b1.setForeground(Color.BLACK);
    b1.setHorizontalAlignment(SwingConstants.CENTER);
    b1.setVerticalAlignment(SwingConstants.TOP);
    b1.setBounds(28,135,293,534);
    b1.setOpaque(false);
    b1.setFocusable(false);
    b1.setBorderPainted(false);
    b1.setBackground(Color.WHITE);
    b1.addActionListener(this);
     l.add(b1);
     bl1=new JLabel(img4);
     bl1.setBounds(28,135,293,534);
     l.add(bl1);


    b2=new JButton("BASUNDHARA");
    b2.setFont(new Font("Bell MT",Font.PLAIN,35));
		b2.setForeground(Color.BLACK);
    b2.setHorizontalAlignment(SwingConstants.CENTER);
    b2.setVerticalAlignment(SwingConstants.TOP);
    b2.setBounds(365,177,293,534);
    b2.setOpaque(false);
    b2.setFocusable(false);
    b2.setBorderPainted(false);
    b2.setBackground(Color.WHITE);
      b2.addActionListener(this);
      l.add(b2);
      bl2=new JLabel(img3);
      bl2.setBounds(365,177,293,534);
      l.add(bl2);
 
    b3=new JButton("GULSHAN");
    b3.setFont(new Font("Bell MT",Font.PLAIN,35));
		b3.setForeground(Color.BLACK);
    b3.setHorizontalAlignment(SwingConstants.CENTER);
    b3.setVerticalAlignment(SwingConstants.TOP);
    b3.setBounds(702,130,293,534);
    b3.setOpaque(false);
    b3.setBackground(Color.WHITE);
    b3.setFocusable(false);
    b3.setBorderPainted(false);
      b3.addActionListener(this);
      // b3.setIcon(img2);
      l.add(b3);
      bl3=new JLabel(img2);
      bl3.setBounds(702,130,293,534);
      l.add(bl3);
 

      //back BUTTON
      b4=new JButton();
      b4.setBounds(14,16,72,72);
      b4.setBackground(new Color(0x54BAB9));
      b4.setOpaque(false);
      b4.setFocusable(false);
      b4.setBorderPainted(false);
      b4.addActionListener(this);
      l.add(b4);
      bl4=new JLabel(img5);
      bl4.setBounds(14,16,72,72);
      l.add(bl4);


    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(l);
    this.setVisible(true);

}
public void actionPerformed(ActionEvent e){
  //Uttara Button [go to uttara page]
  if(e.getSource()==b1){
       UttaraFlat u=new UttaraFlat(userEmail);
       this.setVisible(false);
       u.setVisible(true);
     }
  if(e.getSource()==b2){
       BasundharaFlat b=new BasundharaFlat(userEmail);
       this.setVisible(false);
       b.setVisible(true);
     }
  if(e.getSource()==b3){
      GulshanFlat d=new GulshanFlat(userEmail);
      this.setVisible(false);
      d.setVisible(true);
     }
 //back button [go to Homepage]
  else if(e.getSource()==b4){
   HomePage b=new HomePage(userEmail);
   this.setVisible(false);
   b.setVisible(true);
  }
}
}