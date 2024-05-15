import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    JButton b1,b4;
    JLabel l,l1,l2,bl4;
     
        public About(){
            this.setTitle("House Rental Management System");//sets the title of frame
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
            this.setResizable(false);//prevent from being rezised
            this.setSize(1024,768);//sets the x-dimension & y-dimension of application
            this.setVisible(true);//makes frame visible
            this.setLocationRelativeTo(null);

            
            ImageIcon img1=new ImageIcon("./images/wallpaper.png");
            ImageIcon img2=new ImageIcon("./images/about.png");
            ImageIcon img5=new ImageIcon("./images/Back button.png");
            JLabel l = new JLabel(); 
            l.setBounds(0,0,1024,768);
            l.setIcon(img1);

            l2=new JLabel("This project was developed by four students of AIUB, section CC under the guidance of Tanvir Ahmed sir");
            l2.setFont(new Font("Bell MT", Font.PLAIN, 17));
            l2.setForeground(Color.BLACK);
            l2.setBounds(169,708,740,17);
            this.add(l2);

            l1=new JLabel(img2);
            l1.setBounds(35,0,953,747);
            //l1.setIcon(img2);
            this.add(l1);

            //back BUTTON
            b4=new JButton();
            b4.setBounds(14,13,72,72);
            b4.setBackground(new Color(0x54BAB9));
            b4.setOpaque(false);
            b4.setFocusable(false);
            b4.setBorderPainted(false);
            // b4.addActionListener(this);
            b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                HomePage o = new HomePage("o");
                o.setVisible(true);
            }
        });
            l.add(b4);
            bl4=new JLabel(img5);
            bl4.setBounds(14,13,72,72);
            l.add(bl4);

            // JButton m = new JButton("Testing");
            // m.setBounds(100, 100, 300, 400);
            // m.setBackground(Color.black);
            // m.setForeground(Color.WHITE);

            // this.add(m);
            // JLabel m = new JLabel(new ImageIcon("./images/about.png"));
            // m.setBounds(35,0,953,747);
            // this.add(m);

            this.add(l);
            this.setVisible(true);
        }

            public void actionPerformed(ActionEvent ae) 
		{
			// if(ae.getSource()==b1)
			// {
			// 	String userEmail =t1.getText();
			// 	String userPassword = t2.getText();
			// 	Account createAccount = new Account();
            //     if(userEmail.equals("admin") && userPassword.equals("admin")){
            //         Admin f = new Admin(userEmail);
            //         this.setVisible(false);
            //         f.setVisible(true);
            //     }
			//  	else if(createAccount.getAccount(userEmail, userPassword))
			// 	{
			// 		JOptionPane.showMessageDialog(null,"Login Successful");
			// 		HomePage f = new HomePage(userEmail);
			// 		this.setVisible(false);
			// 		f.setVisible(true);
	
			// 	}
			// 	else{JOptionPane.showMessageDialog(null, "Check Email/Password");}
			
				
			// }
            // // if(ae.getSource()== b3 )
			// // {
			// // 	ForgotPassword f = new ForgotPassword();
			// // 	this.setVisible(false);
			// // 	f.setVisible(true);
			// // }


			// if(ae.getSource()==b2)
			// {
			// 	Sign_up f = new Sign_up();
			// 	this.setVisible(false);
			// 	f.setVisible(true);
	}		// } 

}


