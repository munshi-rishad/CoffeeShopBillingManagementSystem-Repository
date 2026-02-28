import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register extends JFrame implements /*MouseListener,*/ ActionListener {
    JPanel panel;
    JLabel titleLabel, emailLabel, passwordLabel, nameLabel, confirmPassLabel, genderLabel;
    JTextField emailTF, nameTF;
    JPasswordField passwordTF, confirmPassTF;
    JRadioButton maleBtn, femaleBtn;
    JButton registerBtn, backBtn;
    ButtonGroup genderGroup;
    ImageIcon img;
    JLabel imgLabel;
    Color myColor, myColor1,myColor2;
    Font myFont, myFont1, myFont2, myFont3;
	
	private static String registeredEmail = null;
    private static String registeredPassword = null;

    public Register() {
        super("Registration Page");
        this.setBounds(600,200,800,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myColor = new Color(214, 227, 133);
        myColor1 = new Color(255, 146, 105);
        myColor2 = new Color(255, 241, 172);
        myFont = new Font("Cambria", Font.PLAIN, 20);
        myFont1 = new Font("Arial", Font.PLAIN, 14);
        myFont2 = new Font("Arial", Font.PLAIN, 13);
        myFont3 = new Font("Arial", Font.BOLD, 15);

        panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("02.png");
                Image image = backgroundImage.getImage();
                g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
                
            }
        };
        
        panel.setLayout(null);

        titleLabel = new JLabel("Registration Page");
        titleLabel.setBounds(520, 15, 300, 50);
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(myFont);
        panel.add(titleLabel);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(470, 50, 200, 40);
        emailLabel.setForeground(Color.BLACK);
        emailLabel.setFont(myFont1);
        panel.add(emailLabel);

        emailTF = new JTextField();
        emailTF.setBounds(470, 80, 250, 30);
        panel.add(emailTF);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(470, 110, 200, 30);
        nameLabel.setForeground(Color.BLACK);
        nameLabel.setFont(myFont1);
        panel.add(nameLabel);

        nameTF = new JTextField();
        nameTF.setBounds(470, 135, 250, 30);
        panel.add(nameTF);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(470, 165, 200, 30);
        passwordLabel.setForeground(Color.BLACK);
        passwordLabel.setFont(myFont1);
        panel.add(passwordLabel);

        passwordTF = new JPasswordField();
        passwordTF.setBounds(470, 190, 250, 30);
        panel.add(passwordTF);

        confirmPassLabel = new JLabel("Confirm Password:");
        confirmPassLabel.setBounds(470, 220, 200, 30);
        confirmPassLabel.setForeground(Color.BLACK);
        confirmPassLabel.setFont(myFont1);
        panel.add(confirmPassLabel);

        confirmPassTF = new JPasswordField();
        confirmPassTF.setBounds(470, 245, 250, 30);
        panel.add(confirmPassTF);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(470, 290, 200, 30);
        genderLabel.setForeground(Color.BLACK);
        genderLabel.setFont(myFont1);
        panel.add(genderLabel);

        maleBtn = new JRadioButton("Male");
        maleBtn.setBounds(530, 290, 70, 30);
        maleBtn.setBackground(myColor);
        maleBtn.setFont(myFont2);
        maleBtn.setForeground(Color.BLACK);
        panel.add(maleBtn);

        femaleBtn = new JRadioButton("Female");
        femaleBtn.setBounds(620, 290, 70, 30);
        femaleBtn.setBackground(myColor);
        femaleBtn.setFont(myFont2);
        femaleBtn.setForeground(Color.BLACK);
        panel.add(femaleBtn);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);

        registerBtn = new JButton("Create account");
        registerBtn.setBounds(470, 345, 250, 30);
        registerBtn.setBackground(myColor1);
        registerBtn.setForeground(Color.WHITE);
        registerBtn.setFont(myFont3);
        //registerBtn.addMouseListener(this);
        registerBtn.addActionListener(this);
        panel.add(registerBtn);

        backBtn = new JButton("Already have an account?");
        backBtn.setBounds(470, 390, 250, 30);
        backBtn.setBackground(myColor2);
        backBtn.setForeground(Color.BLACK);
        backBtn.setFont(myFont2);
        //backBtn.addMouseListener(this);
        backBtn.addActionListener(this);
        panel.add(backBtn);

        this.add(panel);
    }

    /*public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == registerBtn) {
            registerBtn.setBackground(Color.RED);
		    registerBtn.setForeground(Color.BLACK);
        } else {
            backBtn.setBackground(new Color (255,255,0));
		    backBtn.setForeground(Color.BLACK);
        }
    }
    public void mouseExited(MouseEvent me) {
        if(me.getSource() == registerBtn) {
            registerBtn.setBackground(new Color(255, 146, 105); 	
		    registerBtn.setForeground(Color.BLACK);
        } else {
            backBtn.setBackground(new Color(255, 241, 172));
		    backBtn.setForeground(Color.BLACK);
        } 
    }*/

    public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == registerBtn) {
                String email = emailTF.getText().trim();
                String name = nameTF.getText().trim();
                String password = new String(passwordTF.getPassword()).trim();
                String confirmPassword = new String(confirmPassTF.getPassword()).trim();
        
                if (email.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter your email.", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter your name.", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter your password.", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if (confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please confirm your password.", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if (genderGroup.getSelection() == null) {
                    JOptionPane.showMessageDialog(this, "Please select your gender.", "Warning", JOptionPane.WARNING_MESSAGE);
                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(this, "Passwords do not match. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    passwordTF.setText("");
                    confirmPassTF.setText("");
                } else {
                    registeredEmail = email;
                    registeredPassword = password;
                    JOptionPane.showMessageDialog(this, "Registration Successful!");
                    this.setVisible(false);
                    Login login=new Login();
                    login.setVisible(true);
                }
            } else if (ae.getSource() == backBtn) {
                this.setVisible(false);
                Login login=new Login();
                login.setVisible(true);
            }
    
	}

    public static String getRegisteredEmail() {
        return registeredEmail;
    }

    public static String getRegisteredPassword() {
        return registeredPassword;
    }
}
