import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class Information extends JFrame implements ActionListener{
     JButton b1,b2;
     JLabel t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32;
     JTextField t33,t34;
     JPanel p1;
     JLabel b;

          int lineNumber;

		String Email;
          String password = "admin";


          String filePath = "bin/files/Users.txt.txt";
          Path path = Paths.get("bin/files/Users.txt.txt");

		String[] Name = {"__","__","__","__","__","__","__","__"};
		String[] Mobile = {"__","__","__","__","__","__","__","__"};
		String[] Password = {"__","__","__","__","__","__","__","__"};
		String[] userEmail = {"__","__","__","__","__","__","__","__"};
     

     public Information(String Email)
     {

          this.Email = Email;
          try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            for (int lineNumber = 0 ; scanner.hasNextLine() ; lineNumber++) {
                String line = scanner.nextLine();
				String[] value = line.split("\t");

                    this.Mobile[lineNumber] = value[3];
                    this.Name[lineNumber] = value[4];
                    this.Password[lineNumber] = value[1];
                    this.userEmail[lineNumber] = value[0];
                    this.lineNumber = lineNumber;
                
            }
            scanner.close();
        } 
			catch (FileNotFoundException e) {
            e.printStackTrace();
        }


         this.setTitle("House Rental Mnagement System");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setSize(1024,768);
         this.setVisible(true);
         this.setLocationRelativeTo(null);
     




         JLabel l= new JLabel();
        // l.setBackground(new Color(222,232,230));

         JLabel l1=new JLabel("User Information");
         l1.setFont(new Font("Bell MT",Font.PLAIN,45));
         l1.setForeground(Color.BLACK);
         l1.setBounds(309,21,405,60);
         l1.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(l1);

         JLabel l2=new JLabel("Name");
         l2.setFont(new Font("Bell MT",Font.PLAIN,20));
         l2.setForeground(Color.BLACK);
         l2.setBounds(104,113,109,23);
         l2.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(l2);

         JLabel l3=new JLabel("Mobile Number");
         l3.setFont(new Font("Bell MT",Font.PLAIN,20));
         l3.setForeground(Color.BLACK);
         l3.setBounds(330,113,143,23);
         l3.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(l3);

         JLabel l4=new JLabel("Password");
         l4.setFont(new Font("Bell MT",Font.PLAIN,20));
         l4.setForeground(Color.BLACK);
         l4.setBounds(578,113,109,23);
         l4.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(l4);

         JLabel l5=new JLabel("Email");
         l5.setFont(new Font("Bell MT",Font.PLAIN,20));
         l5.setForeground(Color.BLACK);
         l5.setBounds(817,113,109,23);
         l5.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(l5);

         JLabel l6=new JLabel("1");
         l6.setFont(new Font("Bell MT",Font.PLAIN,20));
         l6.setForeground(Color.BLACK);
         l6.setBounds(9,140,35,23);
         l.add(l6);

         JLabel l7=new JLabel("2");
         l7.setFont(new Font("Bell MT",Font.PLAIN,20));
         l7.setForeground(Color.BLACK);
         l7.setBounds(9,202,35,23);
         l.add(l7);

         JLabel l8=new JLabel("3");
         l8.setFont(new Font("Bell MT",Font.PLAIN,20));
         l8.setForeground(Color.BLACK);
         l8.setBounds(9,258,35,23);
         l.add(l8);

         JLabel l9=new JLabel("4");
         l9.setFont(new Font("Bell MT",Font.PLAIN,20));
         l9.setForeground(Color.BLACK);
         l9.setBounds(9,313,35,23);
         l.add(l9);

         JLabel l10=new JLabel("5");
         l10.setFont(new Font("Bell MT",Font.PLAIN,20));
         l10.setForeground(Color.BLACK);
         l10.setBounds(9,363,35,23);
         l.add(l10);

         JLabel l11=new JLabel("6");
         l11.setFont(new Font("Bell MT",Font.PLAIN,20));
         l11.setForeground(Color.BLACK);
         l11.setBounds(9,420,35,23);
         l.add(l11);

         JLabel l12=new JLabel("7");
         l12.setFont(new Font("Bell MT",Font.PLAIN,20));
         l12.setForeground(Color.BLACK);
         l12.setBounds(9,484,35,23);
         l.add(l12);

         JLabel l13=new JLabel("8");
         l13.setFont(new Font("Bell MT",Font.PLAIN,20));
         l13.setForeground(Color.BLACK);
         l13.setBounds(9,541,35,23);
         l.add(l13);

         t1=new JLabel(Name[0]);
         t1.setBounds(44,136,(int) 217.81,45);
         t1.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t1.setBackground(new Color(217,217,217));
         t1.setForeground(Color.black);
         t1.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t1);

         t2=new JLabel(Name[1]);
         t2.setBounds(44,191,(int) 217.81,45);
         t2.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t2.setBackground(new Color(217,217,217));
         t2.setForeground(Color.black);
         t2.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t2);

         t3=new JLabel(Name[2]);
         t3.setBounds(44,247,(int) 217.81,45);
         t3.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t3.setBackground(new Color(217,217,217));
         t3.setForeground(Color.black);
         t3.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t3);

         t4=new JLabel(Name[3]);
         t4.setBounds(44,302,(int) 217.81,45);
         t4.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t4.setBackground(new Color(217,217,217));
         t4.setForeground(Color.black);
         t4.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t4);

         t5=new JLabel(Name[4]);
         t5.setBounds(44,359,(int) 217.81,45);
         t5.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t5.setBackground(new Color(217,217,217));
         t5.setForeground(Color.black);
         t5.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t5);

         t6=new JLabel(Name[5]);
         t6.setBounds(44,416,(int) 217.81,45);
         t6.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t6.setBackground(new Color(217,217,217));
         t6.setForeground(Color.black);
         t6.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t6);

         t7=new JLabel(Name[6]);
         t7.setBounds(44,473,(int) 217.81,45);
         t7.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t7.setBackground(new Color(217,217,217));
         t7.setForeground(Color.black);
         t7.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t7);

         t8=new JLabel(Name[7]);
         t8.setBounds(44,530,(int) 217.81,45);
         t8.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t8.setBackground(new Color(217,217,217));
         t8.setForeground(Color.black);
         t8.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t8);

         t9=new JLabel(Mobile[0]);
         t9.setBounds((int) 283.06,136,(int) 217.81,45);
         t9.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t9.setBackground(new Color(217,217,217));
         t9.setForeground(Color.black);
         t9.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t9);

         t10=new JLabel(Mobile[1]);
         t10.setBounds((int) 283.06,191,(int) 217.81,45);
         t10.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t10.setBackground(new Color(217,217,217));
         t10.setForeground(Color.black);
         t10.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t10);

         t11=new JLabel(Mobile[2]);
         t11.setBounds((int) 283.06,247,(int) 217.81,45);
         t11.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t11.setBackground(new Color(217,217,217));
         t11.setForeground(Color.black);
         t11.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t11);

         t12=new JLabel(Mobile[3]);
         t12.setBounds((int) 283.06,302,(int) 217.81,45);
         t12.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t12.setBackground(new Color(217,217,217));
         t12.setForeground(Color.black);
         t12.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t12);

         t13=new JLabel(Mobile[4]);
         t13.setBounds((int) 283.06,359,(int) 217.81,45);
         t13.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t13.setBackground(new Color(217,217,217));
         t13.setForeground(Color.black);
         t13.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t13);

         t14=new JLabel(Mobile[5]);
         t14.setBounds((int) 283.06,416,(int) 217.81,45);
         t14.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t14.setBackground(new Color(217,217,217));
         t14.setForeground(Color.black);
         t14.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t14);

         t15=new JLabel(Mobile[6]);
         t15.setBounds((int) 283.06,473,(int) 217.81,45);
         t15.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t15.setBackground(new Color(217,217,217));
         t15.setForeground(Color.black);
         t15.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t15);

         t16=new JLabel(Mobile[7]);
         t16.setBounds((int) 283.06,530,(int) 217.81,45);
         t16.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t16.setBackground(new Color(217,217,217));
         t16.setForeground(Color.black);
         t16.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t16);

         t17=new JLabel(Password[0]);
         t17.setBounds((int) 522.13,136,(int) 217.81,45);
         t17.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t17.setBackground(new Color(217,217,217));
         t17.setForeground(Color.black);
         t17.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t17);

         t18=new JLabel(Password[1]);
         t18.setBounds((int) 522.13,191,(int) 217.81,45);
         t18.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t18.setBackground(new Color(217,217,217));
         t18.setForeground(Color.black);
         t18.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t18);

         t19=new JLabel(Password[2]);
         t19.setBounds((int) 522.13,247,(int) 217.81,45);
         t19.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t19.setBackground(new Color(217,217,217));
         t19.setForeground(Color.black);
         t19.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t19);

         t20=new JLabel(Password[3]);
         t20.setBounds((int) 522.13,302,(int) 217.81,45);
         t20.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t20.setBackground(new Color(217,217,217));
         t20.setForeground(Color.black);
         t20.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t20);

         t21=new JLabel(Password[4]);
         t21.setBounds((int) 522.13,359,(int) 217.81,45);
         t21.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t21.setBackground(new Color(217,217,217));
         t21.setForeground(Color.black);
         t21.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t21);

         t22=new JLabel(Password[5]);
         t22.setBounds((int) 522.13,416,(int) 217.81,45);
         t22.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t22.setBackground(new Color(217,217,217));
         t22.setForeground(Color.black);
         t22.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t22);

         t23=new JLabel(Password[6]);
         t23.setBounds((int) 522.13,473,(int) 217.81,45);
         t23.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t23.setBackground(new Color(217,217,217));
         t23.setForeground(Color.black);
         t23.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t23);

         t24=new JLabel(Password[7]);
         t24.setBounds((int) 522.13,530,(int) 217.81,45);
         t24.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t24.setBackground(new Color(217,217,217));
         t24.setForeground(Color.black);
         t24.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t24);

         t25=new JLabel(userEmail[0]);
         t25.setBounds((int) 761.19,136,(int) 217.81,45);
         t25.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t25.setBackground(new Color(217,217,217));
         t25.setForeground(Color.black);
         t25.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t25);

         t26=new JLabel(userEmail[1]);
         t26.setBounds((int) 761.19,191,(int) 217.81,45);
         t26.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t26.setBackground(new Color(217,217,217));
         t26.setForeground(Color.black);
         t26.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t26);

         t27=new JLabel(userEmail[2]);
         t27.setBounds((int) 761.19,247,(int) 217.81,45);
         t27.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t27.setBackground(new Color(217,217,217));
         t27.setForeground(Color.black);
         t27.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t27);

         t28=new JLabel(userEmail[3]);
         t28.setBounds((int) 761.19,302,(int) 217.81,45);
         t28.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t28.setBackground(new Color(217,217,217));
         t28.setForeground(Color.black);
         t28.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t28);

         t29=new JLabel(userEmail[4]);
         t29.setBounds((int) 761.19,359,(int) 217.81,45);
         t29.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t29.setBackground(new Color(217,217,217));
         t29.setForeground(Color.black);
         t29.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t29);

         t30=new JLabel(userEmail[5]);
         t30.setBounds((int) 761.19,416,(int) 217.81,45);
         t30.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t30.setBackground(new Color(217,217,217));
         t30.setForeground(Color.black);
         t30.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t30);

         t31=new JLabel(userEmail[6]);
         t31.setBounds((int) 761.19,473,(int) 217.81,45);
         t31.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t31.setBackground(new Color(217,217,217));
         t31.setForeground(Color.black);
         t31.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t31);

         t32=new JLabel(userEmail[7]);
         t32.setBounds((int) 761.19,530,(int) 217.81,45);
         t32.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t32.setBackground(new Color(217,217,217));
         t32.setForeground(Color.black);
         t32.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t32);

         JLabel l14=new JLabel("User Serial");
         l14.setFont(new Font("Bell MT",Font.PLAIN,20));
         l14.setForeground(Color.BLACK);
         l14.setBounds(86,619,109,23);
         l14.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(l14);

         JLabel l15=new JLabel("Admin Password");
         l15.setFont(new Font("Bell MT",Font.PLAIN,20));
         l15.setForeground(Color.BLACK);
         l15.setBounds(277,619,195,23);
         l15.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(l15);

         
         //user serial
         t33=new JTextField();
         t33.setBounds(73,642,136,61);
         t33.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t33.setBackground(new Color(0x54BAB9));
         t33.setForeground(Color.black);
         t33.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t33);

         //admin pass
         t34=new JTextField();
         t34.setBounds(273,642,204,61);
         t34.setFont(new Font ("Bell MT",Font.PLAIN,20));
         t34.setBackground(new Color(0x54BAB9));
         t34.setForeground(Color.black);
         t34.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(t34);

         

         b1=new JButton("Remove");
         b1.setFont(new Font("Bell MT",Font.PLAIN,20));
         b1.setForeground(Color.BLACK);
         b1.setFocusable(false);
         b1.setBackground(new Color(0x54BAB9));
         b1.setBounds(541,642,173,61);
         b1.setBorderPainted(false);
         b1.addActionListener(this);
         l.add(b1);

         b2=new JButton("Add User");
         b2.setFont(new Font("Bell MT",Font.PLAIN,20));
         b2.setForeground(Color.BLACK);
         b2.setFocusable(false);
         b2.setBackground(new Color(0x54BAB9));
         b2.setBounds(778,642,173,61);
         b2.setBorderPainted(false);
         b2.addActionListener(this);
         l.add(b2);

         b=new JLabel(new ImageIcon("./images/INFO.png"));
         b.setBounds(44,136,937,439);
         b.setForeground(Color.black);
         b.setHorizontalAlignment(SwingConstants.CENTER);
         l.add(b);


         JLabel I1=new JLabel (new ImageIcon("./images/Background.png"));
         I1.setBounds(0,0,1024,768);
         l.add(I1);

         p1=new JPanel();
         p1.setBackground(new Color(222,232,230));
         p1.setBounds(0,0,1024,768);
         l.add(p1);
          this.add(l);

          
     }


     public void actionPerformed(ActionEvent ae) {

               if(ae.getSource()==b1)
			{
				String userSerial = t33.getText();
				String num = t33.getText();
				String adminPassword = t34.getText();

				int LineNumber = Integer.parseInt(userSerial);
				LineNumber -= 1;

				if(num.isEmpty() || adminPassword.isEmpty()){
					JOptionPane.showMessageDialog(null,"Full Fill User Serial and Admin Password");
				}

				else if(adminPassword.equals(this.password))
				{
					try {
					List<String> lines = Files.readAllLines(path);
					lines.remove(LineNumber);
					Files.write(path, lines);
					JOptionPane.showMessageDialog(null,"User Remove Successful");
					} catch (IOException e) {
					JOptionPane.showMessageDialog(null,"ERROR");
					}

					Information f = new Information(Email);
					this.setVisible(false);
					f.setVisible(true);
				}
				else{JOptionPane.showMessageDialog(null,"User Password is Wrong");}


			}
               else if(ae.getSource()==b2)
               {
                    Admin f = new Admin(Email);
				this.setVisible(false);
				f.setVisible(true);
               }

         
     }
    }