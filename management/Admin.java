package management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import gui.*;

public class Admin extends JFrame implements ActionListener{
    JButton b1,b2;
    JLabel l,l2,bl1,I1;
    String userEmail;
    String userPassword;
   

    public Admin(String userEmail, String userPassword){
        this.userEmail = userEmail;
        this.userPassword = userPassword;

        this.setTitle("Admin Panel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1024,768);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        ImageIcon img6=new ImageIcon("Back button.png");
        ImageIcon img2=new ImageIcon("ABCimage 35.png");
        ImageIcon img1=new ImageIcon("wallpaper.png");
        JLabel l = new JLabel();
        l.setBounds(0,0,1024,768);
        l.setIcon(img1);


        b1=new JButton("User Information");
        b1.setFont(new Font("Bell MT",Font.PLAIN,38));
        b1.setForeground(Color.BLACK);
        b1.setFocusable(false);
        b1.setBackground(new Color(72,139,143));
        b1.setBounds(365,550,351,72);
        b1.setBorderPainted(false);
        b1.addActionListener(this);
        l.add(b1);

        JLabel I1=new JLabel(img2);
        I1.setBounds(322,135,415,415);
        l.add(I1);


        //back button
        b2=new JButton();
        b2.setBounds(14,13,72,72);
        b2.setBackground(Color.WHITE);
        b2.setOpaque(false);
        b2.setFocusable(false);
        b2.setBorderPainted(false);
        b2.addActionListener(this);
        l.add(b2);
        bl1=new JLabel(img6);
        bl1.setBounds(14,13,72,72);
        l.add(bl1);
       





       
        this.add(l);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
       if(e.getSource()==b1){
        dispose();
        Information b1=new Information(userEmail,userPassword);
        b1.setVisible(true);
    }
    else if(e.getSource()==b2){
        dispose();
        Welcome b1=new Welcome();
        b1.setVisible(true);
    }
}
   
    }
