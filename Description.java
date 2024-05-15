import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Description extends JFrame implements ActionListener {

    JPanel p1;
    JLabel b11;
    String userEmail;

    public Description(String userEmail) {
        this.userEmail = userEmail;
        this.setTitle("House Rental Mnagement System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1024, 768);
        this.setVisible(true);
        ImageIcon img3 = new ImageIcon("./images/Back button.png");

        ImageIcon img1 = new ImageIcon("./images/wallpaper.png");
        JLabel l = new JLabel();
        l.setBounds(0, 0, 1024, 768);
        l.setIcon(img1);

        JLabel l1 = new JLabel("Our URBAN ADOBE is exclusively tailored for tenants,providing a");
        l1.setFont(new Font("Bell MT", Font.PLAIN, 25));
        l1.setForeground(Color.BLACK);
        l1.setBounds(28, 358, 983, 41);
        l.add(l1);

        JLabel l2 = new JLabel("user-friendly platform to simplify rental process. With robust features ");
        l2.setFont(new Font("Bell MT", Font.PLAIN, 30));
        l2.setForeground(Color.BLACK);
        l2.setBounds(34, 407, 983, 41);
        l.add(l2);

        JLabel l3 = new JLabel("and intuitive tools for property search and transaction, we prioritize ");
        l3.setFont(new Font("Bell MT", Font.PLAIN, 30));
        l3.setForeground(Color.BLACK);
        l3.setBounds(34, 454, 983, 41);
        l.add(l3);

        JLabel l4 = new JLabel("tenant satisfaction. Backed by years of industrt experience, our platform ");
        l4.setFont(new Font("Bell MT", Font.PLAIN, 30));
        l4.setForeground(Color.BLACK);
        l4.setBounds(34, 501, 983, 41);
        l.add(l4);

        JLabel l5 = new JLabel("ensures a reliable and efficient rental experience, supported by our");
        l5.setFont(new Font("Bell MT", Font.PLAIN, 30));
        l5.setForeground(Color.BLACK);
        l5.setBounds(34, 548, 983, 41);
        l.add(l5);

        JLabel l6 = new JLabel("commitment to excellence. Our goal is to empower tenants with the  ");
        l6.setFont(new Font("Bell MT", Font.PLAIN, 30));
        l6.setForeground(Color.BLACK);
        l6.setBounds(34, 595, 983, 41);
        l.add(l6);

        JLabel l7 = new JLabel("resources the need to find their ideal rental property and enjoy a ");
        l7.setFont(new Font("Bell MT", Font.PLAIN, 30));
        l7.setForeground(Color.BLACK);
        l7.setBounds(34, 642, 983, 41);
        l.add(l7);

        JLabel l8 = new JLabel("seamless renting journey. ");
        l8.setFont(new Font("Bell MT", Font.PLAIN, 30));
        l8.setForeground(Color.BLACK);
        l8.setBounds(34, 689, 983, 41);
        l.add(l8);

        JButton b11 = new JButton();
        b11.setBounds(10, 8, 72, 72);
        b11.setBackground(Color.WHITE);
        b11.setOpaque(false);
        b11.setFocusable(false);
        b11.setBorderPainted(false);
        l.add(b11);
        JLabel bl1 = new JLabel(img3);
        bl1.setBounds(14, 13, 72, 72);
        l.add(bl1);
        b11.addActionListener(this);

        this.add(l);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b11) {
            Area f = new Area(userEmail);
            this.setVisible(false);
            f.setVisible(true);
        }

    }
}