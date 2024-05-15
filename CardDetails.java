import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CardDetails extends JFrame implements ActionListener {
    JButton b1, b2, b11;
    JTextField t1, t2, t3, t4;
    JPanel p1;
    JLabel l1, l2, bl1, bl2, Im;
    String userEmail;
    int lineNumber;
    String userPassword;
    String PaymentDone = "1";
    String filePath = "bin/files/Users.txt.txt";

    public CardDetails(String userEmail) {
        this.userEmail = userEmail;
        this.setTitle("Payment Completion");// sets the title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        this.setResizable(false);// prevent from being rezised
        this.setSize(1024, 768);// sets the x-dimension & y-dimension of application
        this.setVisible(true);// makes frame visible
        this.setLocationRelativeTo(null);

        JLabel l = new JLabel();

        ImageIcon img1 = new ImageIcon("./images/wallpaper.png");
        ImageIcon img2 = new ImageIcon("./images/paymentbox.png");
        ImageIcon img3 = new ImageIcon("./images/Back button.png");
        // ImageIcon img4=new ImageIcon("./images/cardpay.png");

        l.setBounds(0, 0, 1024, 768);
        l.setIcon(img1);

        JLabel l1 = new JLabel("Card Details");
        l1.setFont(new Font("Bell MT", Font.BOLD, 48));
        l1.setForeground(Color.BLACK);
        l1.setBounds(377, 81, 816, 60);
        l.add(l1);

        JLabel l2 = new JLabel("Name on Card");
        l2.setFont(new Font("Bell MT", Font.BOLD, 24));
        l2.setForeground(Color.BLACK);
        l2.setBounds(93, 215, 183, 31);
        l.add(l2);

        JLabel l3 = new JLabel("Card Number");
        l3.setFont(new Font("Bell MT", Font.BOLD, 24));
        l3.setForeground(Color.BLACK);
        l3.setBounds(93, 309, 213, 31);
        l.add(l3);

        JLabel l4 = new JLabel("Valid Till(Year)");
        l4.setFont(new Font("Bell MT", Font.BOLD, 24));
        l4.setForeground(Color.BLACK);
        l4.setBounds(93, 404, 217, 31);
        l.add(l4);

        JLabel l5 = new JLabel("Password");
        l5.setFont(new Font("Bell MT", Font.BOLD, 24));
        l5.setForeground(Color.BLACK);
        l5.setBounds(93, 499, 200, 31);
        l.add(l5);

        // name
        t1 = new RoundedJTextField(19);
        t1.setBounds(86, 240, 441, 49);
        t1.setFont(new Font("Bell MT", Font.BOLD, 22));
        t1.setForeground(Color.WHITE);
        t1.setBackground(new Color(0x488B8F));
        t1.setBorder(null);
        t1.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        t1.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        t1.setHorizontalAlignment(RoundedJTextField.CENTER);
        l.add(t1);

        // Number
        t2 = new RoundedJTextField(19);
        t2.setBounds(83, 335, 441, 49);
        t2.setFont(new Font("Bell MT", Font.BOLD, 22));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(0x488B8F));
        t2.setBorder(null);
        t2.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        t2.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        t2.setHorizontalAlignment(RoundedJTextField.CENTER);
        l.add(t2);

        // Year
        t3 = new RoundedJTextField(19);
        t3.setBounds(83, 430, 441, 49);
        t3.setFont(new Font("Bell MT", Font.BOLD, 22));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(0x488B8F));
        t3.setBorder(null);
        t3.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        t3.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        t3.setHorizontalAlignment(RoundedJTextField.CENTER);
        l.add(t3);

        // pin
        t4 = new RoundedJTextField(19);
        t4.setBounds(83, 525, 441, 49);
        t4.setFont(new Font("Bell MT", Font.BOLD, 22));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(0x488B8F));
        t4.setBorder(null);
        t4.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        t4.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        t4.setHorizontalAlignment(RoundedJTextField.CENTER);
        l.add(t4);

        b1 = new JButton("Confirm Payment");
        b1.setFont(new Font("Bell MT", Font.BOLD, 32));
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.setBackground(new Color(0x54BAB9));
        b1.setBounds(89, 620, 423, 69);
        b1.setBorderPainted(false);
        // b1.addActionListener(this);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
            String number = t2.getText();
            String year = t3.getText();
            String userPassword = t4.getText();
            Account createAccount = new Account();
            
            if (name.isEmpty() || number.isEmpty() || userPassword.isEmpty() || year.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Full Fill All Box");
            } else if (createAccount.getAccount(userEmail, userPassword)) {
                System.out.println("Clicked");
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
                            values[5] = PaymentDone;
                            line = String.join("\t", values);
                        }

                        fileContent.append(line).append("\n");
                    }

                    scanner.close();

                    FileWriter writer = new FileWriter(file);
                    writer.write(fileContent.toString());
                    writer.close();

                    JOptionPane.showMessageDialog(null, "Payment Successful!\nThanks for purchasing from us.");

                    HomePage f = new HomePage(userEmail);
                    setVisible(false);
                    f.setVisible(true);

                } catch (FileNotFoundException a) {
                    a.printStackTrace();
                } catch (IOException b) {
                    b.printStackTrace();
                }
            }
            }
        });
        l.add(b1);
        bl1 = new JLabel(img2);
        bl1.setBounds(89, 620, 423, 69);
        l.add(bl1);

        // BACK BUTTON
        JButton b11 = new JButton();
        b11.setBounds(10, 8, 72, 72);
        b11.setBackground(Color.WHITE);
        b11.setOpaque(false);
        b11.setFocusable(false);
        b11.setBorderPainted(false);
        // b11.addActionListener(this);
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Area o = new Area(userEmail);
                o.setVisible(true);
            }
        });
        l.add(b11);
        bl1 = new JLabel(img3);
        bl1.setBounds(14, 13, 72, 72);
        l.add(bl1);

        JLabel Im = new JLabel(new ImageIcon("./images/cardpay.png"));
        Im.setBounds(524, 157, 500, 500);
        l.add(Im);

        this.add(l);

    }

    public void actionPerformed(ActionEvent ae) {
        // if (ae.getSource() == b1) {
        //     String name = t1.getText();
        //     String number = t2.getText();
        //     String year = t3.getText();
        //     String pin = t4.getText();
        //     Account createAccount = new Account();

        //     if (name.isEmpty() || number.isEmpty() || year.isEmpty() || pin.isEmpty()) {
        //         JOptionPane.showMessageDialog(null, "Full Fill All Box");
        //     }

        //     else if (createAccount.getAccount(userEmail, userPassword)) {
        //         try {
        //             File file = new File(filePath);
        //             Scanner scanner = new Scanner(file);

        //             StringBuilder fileContent = new StringBuilder();
        //             lineNumber = 0;
        //             while (scanner.hasNextLine()) {
        //                 lineNumber++;
        //                 String line = scanner.nextLine();

        //                 if (line.contains(userEmail)) {
        //                     String[] values = line.split("\t");
        //                     values[5] = PaymentDone;
        //                     line = String.join("\t", values);
        //                 }

        //                 fileContent.append(line).append("\n");
        //             }

        //             scanner.close();

        //             FileWriter writer = new FileWriter(file);
        //             writer.write(fileContent.toString());
        //             writer.close();

        //             JOptionPane.showMessageDialog(null, "Payment Successful!\nThanks for purchasing from us.");

        //             HomePage f = new HomePage(this.userEmail);
        //             this.setVisible(false);
        //             f.setVisible(true);

        //         } catch (FileNotFoundException e) {
        //             e.printStackTrace();
        //         } catch (IOException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // } 
        // else if (ae.getSource() == b11) {
        //     Area f = new Area(userEmail);
        //     this.setVisible(false);
        //     f.setVisible(true);

        // }

    }
}
