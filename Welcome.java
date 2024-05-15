import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Welcome extends JFrame implements ActionListener{
    JButton b1, b2, b3;
    JTextField t1, t2;
    JPanel p1;
     
        public Welcome(){
            // ImageIcon im1 = new ImageIcon("image-removebg-preview (4).png");
            // ImageIcon im2 = new ImageIcon("image-removebg-preview (7).png");
            // ImageIcon im3 = new ImageIcon("image-removebg-preview (6).png");
            // ImageIcon im4 = new ImageIcon("image-removebg-preview (10).png");

            this.setTitle("House Rental Management System");//sets the title of frame
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
            this.setResizable(false);//prevent from being rezised
            this.setSize(1024,768);//sets the x-dimension & y-dimension of application
            this.setVisible(true);//makes frame visible
            this.setLocationRelativeTo(null);

            ImageIcon img1=new ImageIcon("./images/wallpaper.png");
            ImageIcon img2=new ImageIcon("./images/LOGIN.png");
            ImageIcon img3=new ImageIcon("./images/forgetPass.png");
            ImageIcon img4=new ImageIcon("./images/TextField.png");

            
            JLabel l = new JLabel(); 
            l.setBounds(0,0,1024,768);
            l.setIcon(img1);

            //frame.getContentPane().setBackground(Color.black);//change color of background
            //l.setBackground(new Color(167,191,191));//customize color entering value from 0-255
        
          

        //    Font f1= new Font("Goudy Old Style", Font.BOLD, 48);
        //    Font f2= new Font("Goudy Old Style", Font.BOLD, 24);
        //    Font f3= new Font("Goudy Old Style", Font.BOLD, 32);

            //welcome
           JLabel l1 =new JLabel("WELCOME");
           l1.setFont(new Font("Bell MT", Font.PLAIN, 48));
           l1.setForeground(Color.BLACK);
           l1.setBounds(350, 41, 313, 53);
           l.add(l1);

           //to
           JLabel l2 =new JLabel("to");
           l2.setFont(new Font("Bell MT", Font.PLAIN, 48));
           l2.setForeground(Color.BLACK);
           l2.setBounds(460, 81, 103, 49);
           l.add(l2);
           
           //urban abode
           JLabel l3 =new JLabel("URBAN ABODE");
           l3.setFont(new Font("Bell MT", Font.BOLD, 48));
           l3.setForeground(Color.BLACK);
           l3.setBounds(307, 134, 410, 58);
           l.add(l3);

        //    JLabel l4 =new JLabel("Already Have An Account?");
        //    l4.setFont(new Font("Bell MT", Font.PLAIN, 24));
        //    l4.setForeground(Color.BLACK);
        //    l4.setBounds(205, 408, 332, 32);
        //    l.add(l4);

        //    JLabel l5 =new JLabel("New Here?");
        //    l5.setFont(new Font("Bell MT", Font.PLAIN, 24));
        //    l5.setForeground(Color.BLACK);
        //    l5.setBounds(632, 410, 143, 29);
        //    l.add(l5);

           JLabel l6 =new JLabel("Enter Password");
           l6.setFont(new Font("Bell MT", Font.PLAIN, 24));
           l6.setForeground(Color.BLACK);
           l6.setBounds(246, 410, 207, 36);
           l.add(l6);

           JLabel l7 =new JLabel("Enter Email Address");
           l7.setFont(new Font("Bell MT", Font.PLAIN, 24));
           l7.setForeground(Color.BLACK);
           l7.setBounds(247, 310, 234, 41);
           l.add(l7);

           //email er textfield
           t1 = new JTextField(); 
           t1.setBounds(247, 341, 317, 49);
           t1.setFont(new Font("Bell MT",Font.BOLD,24));
           t1.setBackground(new Color(0x488B8F));
           t1.setBorder(null);
           t1.setForeground(Color.WHITE);
           t1.setHorizontalAlignment(SwingConstants.CENTER);
           t1.setBorder(null);
           l.add(t1);
           JLabel tl1=new JLabel(img4);
           tl1.setBounds(247, 341, 317, 49);
           l.add(tl1);

           //pass er textfield
           t2 = new JPasswordField();
           t2.setBounds(247, 438, 317, 49);
           t2.setFont(new Font("Bell MT",Font.BOLD,24));
           t2.setBackground(new Color(0x488B8F));
           t2.setBorder(null);
           t2.setForeground(Color.WHITE);
           t2.setHorizontalAlignment(SwingConstants.CENTER);
           t2.setBorder(null);
           l.add(t2);
           JLabel tl2=new JLabel(img4);
           tl2.setBounds(247, 438, 317, 49);
           l.add(tl2);

           b1 = new JButton("Log In");
		   b1.setFont(new Font("Bell MT",Font.BOLD,26));
		   b1.setForeground(Color.BLACK);
		   b1.setFocusable(false);
		   b1.setBackground(new Color(0x54BAB9));
		   b1.setBounds(627, 341, 143, 49);
		   b1.setBorderPainted(false);
           b1.setOpaque(true);
		   b1.addActionListener(this);
		   l.add(b1);
           JLabel bl1 = new JLabel(img2);
           bl1.setBounds(627, 341, 143, 49);
           l.add(bl1);

        b2 = new JButton("Sign Up");
		b2.setFont(new Font("Bell MT",Font.BOLD,26));
		b2.setForeground(Color.BLACK);
		b2.setFocusable(false);
		b2.setBackground(new Color(0x54BAB9));
		b2.setBounds(627,438,143,49);
		b2.setBorderPainted(false);
        b2.setOpaque(true);
		b2.addActionListener(this);
		l.add(b2);
		JLabel bl2 = new JLabel(img2);
		bl2.setBounds(627,438,143,49);
		l.add(bl2);

           JButton b3 = new JButton("Forgot Password?");
		   b3.setFont(new Font("Bell MT",Font.PLAIN,20));
		   b3.setForeground(Color.BLACK);
		   b3.setFocusable(false);
		   b3.setBackground(new Color(0x54BAB9));
		   b3.setBounds(434,514,187,37);
		   b3.setBorderPainted(false);
		//    b3.addActionListener(this);
            b3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    setVisible(false);
                    ForgotPassword o = new ForgotPassword();
                    o.setVisible(true);
                }
            });
		   l.add(b3);
           JLabel bl3 = new JLabel(img2);
           bl3.setBounds(434,514,157,37);
           l.add(bl3);

            
           JLabel I5 = new JLabel(new ImageIcon("./images/3042-removebg-preview.png"));
           I5.setBounds(0, 470, 1024, 344);
           l.add(I5);

            this.add(l);
        }


        public void actionPerformed(ActionEvent ae) 
		{
			if(ae.getSource()==b1)
			{
				String userEmail =t1.getText();
				String userPassword = t2.getText();
				Account createAccount = new Account();
                if(userEmail.equals("admin") && userPassword.equals("admin")){
                    Admin f = new Admin(userEmail);
                    this.setVisible(false);
                    f.setVisible(true);
                }
			 	else if(createAccount.getAccount(userEmail, userPassword))
				{
					JOptionPane.showMessageDialog(null,"Login Successful");
					HomePage f = new HomePage(userEmail);
					this.setVisible(false);
					f.setVisible(true);
	
				}
				else{JOptionPane.showMessageDialog(null, "Check Email/Password");}
			
				
			}
            // if(ae.getSource()== b3 )
			// {
			// 	ForgotPassword f = new ForgotPassword();
			// 	this.setVisible(false);
			// 	f.setVisible(true);
			// }


			if(ae.getSource()==b2)
			{
				Sign_up f = new Sign_up();
				this.setVisible(false);
				f.setVisible(true);
			} 
}
}
