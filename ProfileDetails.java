import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ProfileDetails extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1, t2;
    JPanel p1;
    JLabel l1, l2, bl1, bl2, Im;
    String fullName, MobileNum, Email, nID, userPassword;
    String userEmail;
    int lineNumber;
    String filePath = "bin/files/Users.txt.txt";


    public ProfileDetails(String userEmail){
        this.userEmail= userEmail;
        this.setTitle("House Rental Management System");//sets the title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false);//prevent from being rezised
        this.setSize(1024,768);//sets the x-dimension & y-dimension of application
        this.setVisible(true);//makes frame visible
        this.setLocationRelativeTo(null);

        JLabel l = new JLabel();

        String searchString = this.userEmail;
		try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
                String line = scanner.nextLine();

                if (line.contains(searchString)) {
                    String[] value = line.split("\t");
                    this.fullName = value[4];
                    this.MobileNum = value[3];
                    this.nID = value[2];
                    this.Email = value[0];
					this.userPassword = value[1];
                    this.lineNumber= lineNumber;
                }
            }
            scanner.close();
        } 
			catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        ImageIcon img1=new ImageIcon("./images/wallpaper.png");
        ImageIcon img3=new ImageIcon("./images/Back button.png");
        ImageIcon img2=new ImageIcon("./images/image 38.png");

        l.setBounds(0,0,1024,768);
        l.setIcon(img1);

        
        JLabel l1 =new JLabel("Profile Details");
        l1.setFont(new Font("Bell MT", Font.PLAIN, 48));
        l1.setForeground(Color.BLACK);
        l1.setBounds(380, 59, 410, 52);
        l.add(l1);

        //name
        JLabel l2 =new JLabel("Name");
        l2.setFont(new Font("Bell MT", Font.BOLD, 26));
        l2.setForeground(Color.BLACK);
        l2.setBounds(367, 200, 88, 48);
        l.add(l2);

        // full name textfield
		// t1 = new JTextField(); 
		// t1.setBounds(647, 191, 357, 51);
		// t1.setFont(new Font("Bell MT",Font.PLAIN,26));
		// t1.setForeground(Color.black);
        // t1.setBackground(new Color(0x488B8F));
		// t1.setText(fullName);
		// t1.setHorizontalAlignment(SwingConstants.CENTER);
		// t1.setBorder(null);
		// t1.setOpaque(false);
		// l2.add(t1);

        //mobile
        JLabel l3 =new JLabel("Mobile Number");
        l3.setFont(new Font("Bell MT", Font.BOLD, 26));
        l3.setForeground(Color.BLACK);
        l3.setBounds(367, 282, 218, 48);
        l.add(l3);


        JLabel l4 =new JLabel("Email");
        l4.setFont(new Font("Bell MT", Font.BOLD, 26));
        l4.setForeground(Color.BLACK);
        l4.setBounds(369, 360, 84, 48);
        l.add(l4);

        JLabel l5 =new JLabel("NID No");
        l5.setFont(new Font("Bell MT", Font.BOLD, 26));
        l5.setForeground(Color.BLACK);
        l5.setBounds(369, 432, 90, 48);
        l.add(l5);

        JLabel l6 =new JLabel("Enter Old Password");
        l6.setFont(new Font("Bell MT", Font.BOLD, 26));
        l6.setForeground(Color.BLACK);
        l6.setBounds(65, 593, 277, 48);
        l.add(l6);

        JLabel l7 =new JLabel("Enter New Password");
        l7.setFont(new Font("Bell MT", Font.BOLD, 26));
        l7.setForeground(Color.BLACK);
        l7.setBounds(422, 593, 272, 48);
        l.add(l7);

        JLabel l8 =new JLabel(":");
        l8.setFont(new Font("Bell MT", Font.BOLD, 24));
        l8.setForeground(Color.BLACK);
        l8.setBounds(587, 206, 38, 36);
        l.add(l8);

        JLabel l9 =new JLabel(":");
        l9.setFont(new Font("Bell MT", Font.BOLD, 24));
        l9.setForeground(Color.BLACK);
        l9.setBounds(587, 288, 38, 36);
        l.add(l9);

        JLabel l10 =new JLabel(":");
        l10.setFont(new Font("Bell MT", Font.BOLD, 24));
        l10.setForeground(Color.BLACK);
        l10.setBounds(587, 366, 38, 36);
        l.add(l10);

        JLabel l11 =new JLabel(":");
        l11.setFont(new Font("Bell MT", Font.BOLD, 24));
        l11.setForeground(Color.BLACK);
        l11.setBounds(587, 438, 38, 36);
        l.add(l11);

        //enter old pass
        t1 = new RoundedJTextField(19);
		t1.setBounds(53, 633, 301, 49);
		t1.setFont(new Font("Bell MT", Font.PLAIN, 24));
		t1.setForeground(Color.black);
        t1.setBackground(new Color(0x488B8F));
        t1.setBorder(null);
		t1.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
		t1.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		l.add(t1);

        //enter new pass
        t2 = new RoundedJTextField(19);
		t2.setBounds(404, 633, 301, 49);
		t2.setFont(new Font("Bell MT", Font.PLAIN, 24));
		t2.setForeground(Color.black);
        t2.setBackground(new Color(0x488B8F));
        t2.setBorder(null);
		t2.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
		t2.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		l.add(t2);

        //back BUTTON
        b1=new JButton();
        b1.setBounds(14,16,72,72);
        b1.setBackground(new Color(0x54BAB9));
        b1.setOpaque(false);
        b1.setFocusable(false);
        b1.setBorderPainted(false);
        b1.addActionListener(this);
        l.add(b1);
        bl2=new JLabel(img3);
        bl2.setBounds(14,16,72,72);
        l.add(bl2);

        JLabel I5 = new JLabel(img2);
        I5.setBounds(0, 111, 372, 372);
        l.add(I5);

        //change password
        b2=new JButton("Change Password");
        b2.setFont(new Font("Bell MT", Font.BOLD, 24));
        b2.setForeground(Color.BLACK);
        b2.setBounds(745, 633, 259, 49);
        b2.setBackground(new Color(0x54BAB9));
        b2.setOpaque(true);
        b2.setFocusable(false);
        b2.setBorderPainted(false);
        b2.addActionListener(this);
        l.add(b2);
        
        //label of name
        JLabel l12 =new JLabel(fullName);
        l12.setFont(new Font("Bell MT", Font.PLAIN, 26));
        l12.setForeground(Color.BLACK);
        l12.setBackground(new Color(0x488B8F));
        l12.setBounds(647, 199, 357, 51);
        l.add(l12);

        //label of mobile
        JLabel l13 =new JLabel(MobileNum);
        l13.setFont(new Font("Bell MT", Font.PLAIN, 26));
        l13.setForeground(Color.BLACK);
        l13.setBackground(new Color(0x488B8F));
        l13.setBounds(647, 280, 357, 51);
        l.add(l13);

        //label for email
        JLabel l14 =new JLabel(Email);
        l14.setFont(new Font("Bell MT", Font.PLAIN, 26));
        l14.setForeground(Color.BLACK);
        l14.setBackground(new Color(0x488B8F));
        l14.setBounds(647, 358, 357, 51);
        l.add(l14);

        //label for nid
        JLabel l15 =new JLabel(nID);
        l15.setFont(new Font("Bell MT", Font.PLAIN, 26));
        l15.setForeground(Color.BLACK);
        l15.setBackground(new Color(0x488B8F));
        l15.setBounds(647, 430, 357, 51);
        l.add(l15);

        this.add(l);
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2)
        {
            String oldPassword = t1.getText();
            String newPassword = t2.getText();
            
            if(oldPassword.isEmpty() || newPassword.isEmpty()){
                JOptionPane.showMessageDialog(null, "Full Fill Old Password And New Password Box");
            }
            else if(oldPassword.equals(this.userPassword))
            {
                try {
                    File file = new File(filePath);
                    Scanner scanner = new Scanner(file);

                    StringBuilder fileContent = new StringBuilder();
                    lineNumber = 0;
                    while (scanner.hasNextLine()) {
                        lineNumber++;
                        String line = scanner.nextLine();

                        if (line.contains(userEmail)) {
                            String[] values = line.split("\t");
                            values[1] = newPassword; 
                            line = String.join("\t", values);
                        }

                        fileContent.append(line).append("\n");
                    }

                    scanner.close();

                    FileWriter writer = new FileWriter(file);
                    writer.write(fileContent.toString());
                    writer.close();

                    JOptionPane.showMessageDialog(null, "Password Change Successful");
                    

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Your old password is wrong");
            }
            ProfileDetails f = new ProfileDetails(fullName);
            this.setVisible(false);
            f.setVisible(true);
        }
        //back button
        else if(ae.getSource()==b1){
            HomePage f = new HomePage(userEmail);
           this.setVisible(false);
           f.setVisible(true);
         }
    }
}