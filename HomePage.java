import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomePage extends JFrame implements ActionListener{
   JButton b1,b2,b3,b4;
   JLabel l,l1,bl1,l2,l3,l4;
   String userEmail;
   int lineNumber;
   String fullName;

public HomePage(String userEmail){ 
    this.userEmail= userEmail;
    String filePath = "bin/files/Users.txt.txt";
        String searchString = this.userEmail;
		try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
                String line = scanner.nextLine();

                if (line.contains(searchString)) {
                    String[] value = line.split("\t");
                    this.fullName = value[4];
					this.lineNumber= lineNumber;
                }
            }
            scanner.close();
        } 
			catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//IMAGE SECTION   
    ImageIcon img1=new ImageIcon("wallpaper.png");
    ImageIcon img2=new ImageIcon("image 37new.png");
    ImageIcon img3=new ImageIcon("forsale.png ");
    ImageIcon img6=new ImageIcon("Back button.png");
    ImageIcon img4=new ImageIcon("image 43.png");
  
//BACKROUND LABEL
   l=new JLabel();
    l.setBounds(0,0,1024,768);
    l.setIcon(img1);

    //About us
    JButton b4=new JButton();
        b4.setBounds(380, 545, 263, 184);
        b4.setOpaque(false);
        b4.setFocusable(false);
        b4.setBorderPainted(false);
        b4.setBackground(new Color(0x54BAB9));
        b4.addActionListener(this);
        l.add(b4);
        JLabel bl4 = new JLabel(img4);
        bl4.setBounds(380, 545, 263, 184);
        l.add(bl4);

//TOP MIDDLE 1 ST LABEL
   l1=new JLabel();
    l1.setText("Hello " + fullName + "!");
    l1.setBounds(129, 59, 712, 50);
    l1.setFont(new Font("Bell MT", Font.BOLD, 44));
    l1.setForeground(Color.BLACK);
    l1.setHorizontalAlignment(SwingConstants.CENTER);
    l.add(l1);
//TOP MIDDLE 2nd LABEL
   l2=new JLabel();
    l2.setText("WELCOME TO URBAN ABODE");
    l2.setBounds(170,108,700,52);
    l2.setFont(new Font("Bell MT", Font.PLAIN, 44));
    l2.setForeground(Color.BLACK);
    l.add(l2);
//LEFT MIDDLE PROFILE IMAGE   
    l3=new JLabel(img2);
    l3.setBounds(140,210,244,259);
    l.add(l3);
//R8 MIDDLE BUY IMAGE   
    l4=new JLabel(img3);
    l4.setBounds(562,198,310,310);
    l.add(l4);
//PROFILE BUTTON 
    b2=new JButton("Profile");
    b2.setForeground(Color.BLACK);
    b2.setFont(new Font("Bell MT", Font.BOLD, 40));
    b2.setBounds(145,468,263,67);
    b2.setBackground(new Color(0x54BAB9));
    b2.setOpaque(true);
    b2.setFocusable(false);
    b2.setBorderPainted(false);
    l.add(b2);
    b2.addActionListener(this);
//BUY A FLAT BUTTON 
    b3=new JButton("Buy a Flat");
    b3.setForeground(Color.BLACK);
    b3.setFont(new Font("Bell MT", Font.BOLD, 40));
    b3.setBounds(586,468,263,67);
    b3.setBackground(new Color(0X54BAB9));
    b3.setOpaque(true);
    b3.setFocusable(false);
    b3.setBorderPainted(false);
    l.add(b3);
    b3.addActionListener(this);


//BACK BUTTON 
    b1=new JButton();
    b1.setBounds(10,8,72,72);
    b1.setBackground(Color.WHITE);
    b1.setOpaque(false);
    b1.setFocusable(false);
    b1.setBorderPainted(false);
    l.add(b1);
      bl1=new JLabel(img6);
      bl1.setBounds(10,8,72,72);
      l.add(bl1);
    b1.addActionListener(this);

this.setTitle("GENERAL INFORMATION PAGE");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
this.setSize(1024,768);
this.setLocationRelativeTo(null);
this.add(l);
this.setVisible(true);
}

public void actionPerformed(ActionEvent ae) 
		{

			if(ae.getSource()==b3) //area
			{
				Area d=new Area(userEmail);
				this.setVisible(false);
				d.setVisible(true);
			}
			else if(ae.getSource()==b2)//Profile
			{
					ProfileDetails b=new ProfileDetails(this.userEmail);
					this.setVisible(false);
					b.setVisible(true);
				}
                 //[back Button]go to login page   
                 else if(ae.getSource()==b1){
                    Welcome b=new Welcome();
                    this.setVisible(false);
                    b.setVisible(true);
               }
               //about us
               else if(ae.getSource()==b4){
                Description b=new Description(userEmail);
                this.setVisible(false);
                b.setVisible(true);
           }
            }
			}