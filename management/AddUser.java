package management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import gui.*;

public class AddUser extends JFrame implements ActionListener{
    JButton b1,b2;
    RoundedJTextField t1, t2, t3, t4,t5,t6;
    JPanel p1;
    JLabel l,l1,l2,l3,l4,l5,l6;
		String Email;
        String password;
     
        public AddUser(String Email,String password){
            
		this.Email = Email;
        this.password = password;

            this.setTitle("House Rental Management System");//sets the title of frame
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
            this.setResizable(false);//prevent from being rezised
            this.setSize(1024,768);//sets the x-dimension & y-dimension of application
            this.setVisible(true);//makes frame visible
			this.setLocationRelativeTo(null);

            JLabel l = new JLabel();
            //frame.getContentPane().setBackground(Color.black);//change color of background
            //l.setBackground(new Color(167,191,191));//customize color entering value from 0-255
			ImageIcon img1=new ImageIcon("./images/wallpaper.png");

			l=new JLabel();
			l.setBounds(0,0,1024,768);
			l.setIcon(img1);

        l1 = new JLabel("AddUser");
		l1.setFont(new Font("Bell MT", Font.PLAIN, 48));
		l1.setForeground(Color.BLACK);
		l1.setBounds(260, 11, 526, 60);
		l.add(l1);

        l2 = new JLabel("Enter Name");
		l2.setFont(new Font("Bell MT", Font.PLAIN, 25));
		l2.setForeground(Color.BLACK);
		l2.setBounds(493, 124, 250,30);
		l.add(l2);

        l3 = new JLabel("Enter Email");
		l3.setFont(new Font("Bell MT", Font.PLAIN, 25));
		l3.setForeground(Color.BLACK);
		l3.setBounds(493, 213, 230, 30);
		l.add(l3);

        l4 = new JLabel("Enter Mobile Number");
		l4.setFont(new Font("Bell MT", Font.PLAIN, 25));
		l4.setForeground(Color.BLACK);
		l4.setBounds(493, 308, 380, 32);
		l.add(l4);

        l5 = new JLabel("Enter NID No");
		l5.setFont(new Font("Bell MT", Font.PLAIN, 25));
		l5.setForeground(Color.BLACK);
		l5.setBounds(490, 400, 270, 32);
		l.add(l5);

        l6 = new JLabel("Create a Password");
		l6.setFont(new Font("Bell MT", Font.PLAIN, 25));
		l6.setForeground(Color.BLACK);
		l6.setBounds(490, 489, 253, 32);
		l.add(l6);

        //Enter Name
		t1 = new RoundedJTextField(19); 
		t1.setBounds(490, 149, 441, 49);
		t1.setFont(new Font("Bell MT", Font.BOLD, 26));
		t1.setForeground(Color.WHITE);
        t1.setBackground(new Color(0x488B8F));
        t1.setBorder(null);
		t1.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
		t1.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
		t1.setHorizontalAlignment(RoundedJTextField.CENTER);
		l.add(t1);

        //Email
        t2 = new RoundedJTextField(19);
		t2.setBounds(490, 238, 441, 49);
		t2.setFont(new Font("Bell MT", Font.BOLD, 26));
		t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(0x488B8F));
        t2.setBorder(null);
		t2.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
		t2.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		l.add(t2);
		
        //mobile number
        t3 = new RoundedJTextField(19);
		t3.setBounds(489, 334, 441, 49);
		t3.setFont(new Font("Bell MT", Font.BOLD, 26));
		t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(0x488B8F));
        t3.setBorder(null);
		t3.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
		t3.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		l.add(t3);

        //nid
        t4 = new RoundedJTextField(19);
		t4.setBounds(489, 426, 441, 49);
		t4.setFont(new Font("Bell MT", Font.BOLD, 26));
		t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(0x488B8F));
        t4.setBorder(null);
		t4.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
		t4.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		l.add(t4);

        //create pass
        t5 = new RoundedJTextField(19);
		t5.setBounds(489, 515, 441, 49);
		t5.setFont(new Font("Bell MT", Font.BOLD, 26));
		t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(0x488B8F));
        t5.setBorder(null);
		t5.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
		t5.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		l.add(t5);

        b1 = new JButton("Add User");
        b1.setFont(new Font("Bell MT",Font.BOLD,30));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.setBackground(new Color(0x54BAB9));
        b1.setBounds(533, 640, 150, 46);
        b1.setBorderPainted(false);
        b1.addActionListener(this);
        l.add(b1);

        b2 = new JButton("Previous");
        b2.setFont(new Font("Bell MT",Font.BOLD,30));
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.setBackground(new Color(0x54BAB9));
        b2.setBounds(773, 628, 170, 46);
        b2.setBorderPainted(false);
        b2.addActionListener(this);
        l.add(b2);

        
        JLabel I1 = new JLabel(new ImageIcon("./images/signup1-removebg-preview.png"));
        I1.setBounds(109, 74, 213, 213);
        l.add(I1);

        JLabel I2 = new JLabel(new ImageIcon("./images/image 39.png"));
        I2.setBounds(0, 261, 411, 411);
        l.add(I2);

        // p1 = new JPanel();
        // p1.setBackground(new Color(0xA7C6BF));
        // p1.setBounds(0,0,1024,768);
        // l.add(p1);
         this.add(l);
        }

        
		public void actionPerformed(ActionEvent ae) 
		{
			if(ae.getSource()==b1)
			{
				String userFullName= t1.getText();
                String userEmail = t2.getText();
                String MobileNum = t3.getText();
				String usernID = t4.getText();
				String userPassword = t5.getText();
                

		
	
				if( userFullName.isEmpty() || userEmail.isEmpty() || MobileNum.isEmpty() || userPassword.isEmpty() ||usernID.isEmpty() )
				{
					JOptionPane.showMessageDialog(null, "Please fill all of the box");
				}
				else
				{
					Account createAccount = new Account(userFullName, usernID, userEmail, MobileNum, userPassword);
					createAccount.addAccount();
					JOptionPane.showMessageDialog(null, "Account Added");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					
					Information f = new Information(Email,password);
					this.setVisible(false);
					f.setVisible(true);
	
				}
        }else if(ae.getSource()==b2)//previous
			{
				Information f = new Information(Email,password);
				this.setVisible(false);
				f.setVisible(true);
			}
            
    }
}