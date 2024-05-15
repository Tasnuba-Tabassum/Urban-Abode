package management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import gui.*;

public class ForgotPassword extends JFrame implements ActionListener {
    JButton changePasswordBtn, returnBtn;
    RoundedJTextField nameField, emailField, mobileField, newPasswordField;
    JLabel panel;
    JLabel l, nameLabel, emailLabel, mobileLabel, newPasswordLabel;

    public ForgotPassword() {
        this.setTitle("Forgot Password");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1024, 768);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        ImageIcon img3 = new ImageIcon("./images/Back button.png");


        // Background
        ImageIcon img1 = new ImageIcon("./images/wallpaper.png");
        
        JLabel l=new JLabel(img1);

        ImageIcon img4 = new ImageIcon("./images/ForgotPassword2.png");
        
        JLabel panel = new JLabel(img4);
        panel.setBounds(28, 261, 324, 328);


        // Labels

        JLabel big = new JLabel("FORGOT PASSWORD");
        big.setFont(new Font("Poppins", Font.PLAIN, 48));
        big.setForeground(Color.BLACK);
        big.setBounds(290, 67, 610, 52);
        l.add(big);


        nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Poppins", Font.PLAIN, 20));
        nameLabel.setForeground(Color.BLACK);
        nameLabel.setBounds(534, 282, 61, 30);
        l.add(nameLabel);

        emailLabel = new JLabel("Enter Your Email:");
        emailLabel.setFont(new Font("Poppins", Font.PLAIN, 20));
        emailLabel.setForeground(Color.BLACK);
        emailLabel.setBounds(433, 356, 162, 30);
        l.add(emailLabel);

        mobileLabel = new JLabel("Enter Mobile Number:");
        mobileLabel.setFont(new Font("Poppins", Font.PLAIN, 20));
        mobileLabel.setForeground(Color.BLACK);
        mobileLabel.setBounds(385, 436, 210, 30);
        l.add(mobileLabel);

        newPasswordLabel = new JLabel("New Password:");
        newPasswordLabel.setFont(new Font("Poppins", Font.PLAIN, 20));
        newPasswordLabel.setForeground(Color.BLACK);
        newPasswordLabel.setBounds(450, 517, 145, 30);
        l.add(newPasswordLabel);

        // TextFields
        nameField = new RoundedJTextField(15);
        nameField.setBounds(628, 272, 357, 51);
        nameField.setFont(new Font("Poppins", Font.PLAIN, 20));
        nameField.setForeground(Color.WHITE);
        nameField.setBackground(new Color(0x488B8F));
        nameField.setBorder(null);
        nameField.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        nameField.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        nameField.setHorizontalAlignment(RoundedJTextField.CENTER);
        l.add(nameField);

        emailField = new RoundedJTextField(15);
        emailField.setBounds(628, 345, 357, 51);
        emailField.setFont(new Font("Poppins", Font.PLAIN, 20));
        emailField.setForeground(Color.WHITE);
        emailField.setBackground(new Color(0x488B8F));
        emailField.setBorder(null);
        emailField.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        emailField.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        emailField.setHorizontalAlignment(SwingConstants.CENTER);
        l.add(emailField);

        mobileField = new RoundedJTextField(15);
        mobileField.setBounds(628, 425, 357, 51);
        mobileField.setFont(new Font("Poppins", Font.PLAIN, 20));
        mobileField.setForeground(Color.WHITE);
        mobileField.setBackground(new Color(0x488B8F));
        mobileField.setBorder(null);
        mobileField.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        mobileField.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        mobileField.setHorizontalAlignment(SwingConstants.CENTER);
        l.add(mobileField);

        newPasswordField = new RoundedJTextField(15);
        newPasswordField.setBounds(628, 504, 357, 51);
        newPasswordField.setFont(new Font("Poppins", Font.PLAIN, 20));
        newPasswordField.setForeground(Color.WHITE);
        newPasswordField.setBackground(new Color(0x488B8F));
        newPasswordField.setBorder(null);
        newPasswordField.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        newPasswordField.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        newPasswordField.setHorizontalAlignment(SwingConstants.CENTER);
        l.add(newPasswordField);

        // Buttons
        changePasswordBtn = new JButton("Change Password");
        changePasswordBtn.setFont(new Font("Poppins", Font.PLAIN, 24));
        changePasswordBtn.setForeground(Color.WHITE);
        changePasswordBtn.setFocusable(false);
        changePasswordBtn.setBackground(new Color(0x54BAB9));
        changePasswordBtn.setBounds(680, 602, 259, 49);
        changePasswordBtn.setBorderPainted(false);
        changePasswordBtn.addActionListener(this);
        l.add(changePasswordBtn);

       
        JButton b11 = new JButton();
        b11.setBounds(10, 8, 72, 72);
        b11.setBackground(Color.WHITE);
        b11.setOpaque(false);
        b11.setFocusable(false);
        b11.setBorderPainted(false);
        this.add(b11);
        JLabel bl1 = new JLabel(img3);
        bl1.setBounds(14, 13, 72, 72);
        l.add(bl1);
        // b11.addActionListener(this);
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Welcome a = new Welcome();
                a.setVisible(true);
            }
        });

        l.add(panel);
        this.add(l);
    }

    public void actionPerformed(ActionEvent ae) 
	{
        if (ae.getSource() == changePasswordBtn) 
		{
            String userName = nameField.getText();
            String userEmail = emailField.getText();
            String userMobile = mobileField.getText();
            String newPassword = newPasswordField.getText();

            boolean matchFound = checkSignUpData(userName, userEmail, userMobile);

            if (matchFound) 
			{

				try 
				{
					File file = new File("bin\\files\\Users.txt.txt");
					BufferedReader reader = new BufferedReader(new FileReader(file));
					StringBuilder stringBuilder = new StringBuilder();
					String line;
					while ((line = reader.readLine()) != null) 
					{
						String[] fields = line.split("\t");
						if (fields.length >= 5 && fields[4].equals(userName) && fields[0].equals(userEmail) && fields[3].equals(userMobile)) 
						{
							fields[1] = newPassword;
							line = String.join("\t", fields);
						}

						stringBuilder.append(line).append("\n");
					}
					reader.close();

	
					FileWriter writer = new FileWriter(file);
					writer.write(stringBuilder.toString());
					writer.close();

					JOptionPane.showMessageDialog(null, "Password Changed Successfully!");
					clearFields();
					
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			} 
			else 
			{
				JOptionPane.showMessageDialog(null, "Invalid information. Please try again.");
			}
        } 
		// else if (ae.getSource() == returnBtn) 
		// {
        //     Welcome welcomePage = new Welcome();
        //     this.setVisible(false);
        //     welcomePage.setVisible(true);
        // }
    }

    private void clearFields() 
	{
        nameField.setText("");
        emailField.setText("");
        mobileField.setText("");
        newPasswordField.setText("");
    }

    private boolean checkSignUpData(String userName, String userEmail, String userMobile) 
	{
    
    // Account account = new Account();
    
 
    boolean isMatch = false;
    try 
	{
       
        Scanner scanner = new Scanner(new File("bin\\files\\Users.txt.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split("\t");
            String fullName = values[4];
            String storedUserEmail = values[0];
            String storedMobileNum = values[3];
            
            if (userName.equals(fullName) && userEmail.equals(storedUserEmail) && userMobile.equals(storedMobileNum)) 
			{
                isMatch = true;
                break; 
            }
        }
        scanner.close();
    } 
	catch (IOException e) 
	{
        e.printStackTrace();
    }
    
    return isMatch;
}
}
