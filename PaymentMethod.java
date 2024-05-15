import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PaymentMethod extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;
    JPanel l3;
    JLabel l,l1,l2,l4,bl1,bl2,bl3,bl4;
    String userEmail;
    
    public PaymentMethod(String userEmail){
        this.userEmail = userEmail;

        this.setTitle("Payment Method");//sets the title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false);//prevent from being rezised
        this.setSize(1024,768);//sets the x-dimension & y-dimension of application
        this.setVisible(true);//makes frame visible
        this.setLocationRelativeTo(null);

        
        ImageIcon img1=new ImageIcon("./images/wallpaper.png");
        ImageIcon img2=new ImageIcon("./images/payment.png");
        ImageIcon img4=new ImageIcon("./images/visa.png");
        ImageIcon img5=new ImageIcon("./images/mastercard.png");
        ImageIcon img6=new ImageIcon("./images/Back button.png");

        l=new JLabel();
        l.setBounds(0,0,1024,768);
        l.setIcon(img1);

        l1 = new JLabel("CHOOSE YOUR PAYMENT METHOD");
		l1.setFont(new Font("Poppins", Font.PLAIN, 38));
		l1.setForeground(Color.WHITE);
		l1.setBounds(189, 514,678, 42);
		l.add(l1);

        //payment
        l2=new JLabel();
        l2.setBounds(69,14,888,500);
        l2.setIcon(img2);
        l.add(l2);



        //bkash
        // b1=new JButton();
        // b1.setBounds(655,596,163,84);
        // b1.setOpaque(false);
        // b1.setFocusable(false);
        // b1.setBorderPainted(false);
        // b1.setBackground(new Color(0x54BAB9));
        // b1.addActionListener(this);
        // l.add(b1);
        // bl1 = new JLabel(img3);
        // bl1.setBounds(655, 596, 163, 84);
        // l.add(bl1);

        //visa
        b2=new JButton();
        b2.setBounds(578, 594, 139, 88);
        b2.setOpaque(false);
        b2.setFocusable(false);
        b2.setBorderPainted(false);
        b2.setBackground(new Color(0x54BAB9));
        b2.addActionListener(this);
        l.add(b2);
        bl2 = new JLabel(img4);
        bl2.setBounds(578, 594, 139, 88);
        l.add(bl2);

        //mastercard
        b3=new JButton();
        b3.setBounds(318, 593, 148, 89);
        b3.setOpaque(false);
        b3.setFocusable(false);
        b3.setBorderPainted(false);
        b3.setBackground(new Color(0x54BAB9));
        b3.addActionListener(this);
        l.add(b3);
        bl3 = new JLabel(img5);
        bl3.setBounds(318, 593, 148, 89);
        l.add(bl3);

        //back
        b4=new JButton();
        b4.setBounds(14, 13,72,72);
        b4.setOpaque(false);
        b4.setFocusable(false);
        b4.setBorderPainted(false);
        b4.setBackground(new Color(0x54BAB9));
        b4.addActionListener(this);
        l.add(b4);
        bl4 = new JLabel(img6);
        bl4.setBounds(14, 13, 72, 72);
        l.add(bl4);


         
        l3=new JPanel();
        l3.setBounds(31, 492, 940, 230);
        l3.setBackground(new Color(0x54BAB9));
        l.add(l3);

        this.add(l);


    }
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b2 || e.getSource()== b3){
                CardDetails f = new CardDetails(userEmail);
                this.setVisible(false);
                f.setVisible(true);
        
        }
        else if(e.getSource()==b4){
            Area b=new Area(userEmail);
            this.setVisible(false);
            b.setVisible(true);
           }
    }
}
