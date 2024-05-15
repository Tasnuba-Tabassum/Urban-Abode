import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class ForgotPassword extends JFrame implements ActionListener {
    JButton changePasswordBtn, returnBtn;
    RoundedJTextField nameField, emailField, mobileField, newPasswordField;
    JPanel panel;
    JLabel backgroundLabel, nameLabel, emailLabel, mobileLabel, newPasswordLabel;

    public ForgotPassword() {
        this.setTitle("Forgot Password");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1024, 768);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        // Background
        ImageIcon backgroundImg = new ImageIcon("wallpaper.png");
        backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, 1024, 768);
        backgroundLabel.setIcon(backgroundImg);

        // Panel
        panel = new JPanel();
        panel.setBackground(new Color(0xA7C6BF));
        panel.setBounds(0, 0, 1024, 768);
        panel.setLayout(null);

        // Labels
        nameLabel = new JLabel("Enter Your Name");
        nameLabel.setFont(new Font("Poppins", Font.PLAIN, 22));
        nameLabel.setForeground(Color.BLACK);
        nameLabel.setBounds(493, 117, 195, 30);
        panel.add(nameLabel);

        emailLabel = new JLabel("Enter Your Email");
        emailLabel.setFont(new Font("Poppins", Font.PLAIN, 22));
        emailLabel.setForeground(Color.BLACK);
        emailLabel.setBounds(493, 208, 196, 30);
        panel.add(emailLabel);

        mobileLabel = new JLabel("Enter Your Mobile Number");
        mobileLabel.setFont(new Font("Poppins", Font.PLAIN, 22));
        mobileLabel.setForeground(Color.BLACK);
        mobileLabel.setBounds(493, 302, 358, 32);
        panel.add(mobileLabel);

        newPasswordLabel = new JLabel("Enter New Password");
        newPasswordLabel.setFont(new Font("Poppins", Font.PLAIN, 22));
        newPasswordLabel.setForeground(Color.BLACK);
        newPasswordLabel.setBounds(493, 394, 253, 32);
        panel.add(newPasswordLabel);

        // TextFields
        nameField = new RoundedJTextField(19);
        nameField.setBounds(490, 149, 441, 49);
        nameField.setFont(new Font("Poppins", Font.PLAIN, 22));
        nameField.setForeground(Color.black);
        nameField.setBackground(new Color(0x488B8F));
        nameField.setBorder(null);
        nameField.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        nameField.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        nameField.setHorizontalAlignment(RoundedJTextField.CENTER);
        panel.add(nameField);

        emailField = new RoundedJTextField(19);
        emailField.setBounds(490, 238, 441, 49);
        emailField.setFont(new Font("Poppins", Font.PLAIN, 22));
        emailField.setForeground(Color.black);
        emailField.setBackground(new Color(0x488B8F));
        emailField.setBorder(null);
        emailField.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        emailField.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        emailField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(emailField);

        mobileField = new RoundedJTextField(19);
        mobileField.setBounds(489, 334, 441, 49);
        mobileField.setFont(new Font("Poppins", Font.PLAIN, 22));
        mobileField.setForeground(Color.black);
        mobileField.setBackground(new Color(0x488B8F));
        mobileField.setBorder(null);
        mobileField.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        mobileField.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        mobileField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(mobileField);

        newPasswordField = new RoundedJTextField(19);
        newPasswordField.setBounds(489, 426, 441, 49);
        newPasswordField.setFont(new Font("Poppins", Font.PLAIN, 22));
        newPasswordField.setForeground(Color.black);
        newPasswordField.setBackground(new Color(0x488B8F));
        newPasswordField.setBorder(null);
        newPasswordField.setAlignmentX(RoundedJTextField.CENTER_ALIGNMENT);
        newPasswordField.setAlignmentY(RoundedJTextField.CENTER_ALIGNMENT);
        newPasswordField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(newPasswordField);

        // Buttons
        changePasswordBtn = new JButton("Change Password");
        changePasswordBtn.setFont(new Font("Poppins", Font.PLAIN, 23));
        changePasswordBtn.setForeground(new Color(0xDEE8E5));
        changePasswordBtn.setFocusable(false);
        changePasswordBtn.setBackground(new Color(0x54BAB9));
        changePasswordBtn.setBounds(493, 515, 245, 63);
        changePasswordBtn.setBorderPainted(false);
        changePasswordBtn.addActionListener(this);
        panel.add(changePasswordBtn);

        returnBtn = new JButton("Previous");
        returnBtn.setFont(new Font("Poppins", Font.PLAIN, 23));
        returnBtn.setForeground(new Color(0xDEE8E5));
        returnBtn.setFocusable(false);
        returnBtn.setBackground(new Color(0x54BAB9));
        returnBtn.setBounds(781, 654, 149, 63);
        returnBtn.setBorderPainted(false);
        returnBtn.addActionListener(this);
        panel.add(returnBtn);

        backgroundLabel.add(panel);
        this.add(backgroundLabel);
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
		else if (ae.getSource() == returnBtn) 
		{
            Welcome welcomePage = new Welcome();
            this.setVisible(false);
            welcomePage.setVisible(true);
        }
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
    
    Account account = new Account();
    
 
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
