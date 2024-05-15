import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Admin extends JFrame implements ActionListener{
    JButton b1;
    JPanel p1;

    public Admin(){

        this.setTitle("Admin Panel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1024,768);
        this.setVisible(true);

        ImageIcon img1=new ImageIcon("./images/wallpaper.png");
        JLabel l = new JLabel();
        l.setBounds(0,0,1024,768);
        l.setIcon(img1);


        JPanel p=new JPanel();
        p.setLayout(null);


        JLabel l1=new JLabel("Admin Panel");
        l1.setFont(new Font("Bell MT",Font.BOLD,45));
        l1.setForeground(Color.BLACK);
        l1.setBounds(370,55,351,60);
        l.add(l1);



        b1=new JButton("User Information");
        b1.setFont(new Font("Bell MT",Font.PLAIN,45));
        b1.setForeground(Color.BLACK);
        b1.setFocusable(false);
        b1.setBackground(new Color(72,139,143));
        b1.setBounds(290,550,441,85);
        b1.setBorderPainted(false);
        b1.addActionListener(this);
        l.add(b1);

        JLabel I1=new JLabel(new ImageIcon("./images/ABCimage 35.png"));
        I1.setBounds(328,161,415,415);
        l.add(I1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
       if(e.getSource()==b1){
        dispose();
        Information b1=new Information();
        b1.setVisible(true);
    }
}
   
    }
