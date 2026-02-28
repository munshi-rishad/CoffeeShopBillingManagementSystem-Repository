import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JPanel panel;
    JLabel emailLabel, passwordLabel;
    JTextField emailTF;
    JPasswordField passwordTF;
    JButton loginBtn, registerBtn;

    public Login() {
        super("Login");
        this.setBounds(600,200,800,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font myFont1 = new Font("Arial", Font.PLAIN, 14);
        Font myFont2 = new Font("Arial", Font.BOLD, 14);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("08.png");
                Image img = imageIcon.getImage();
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                
            }
        };
        panel.setLayout(null);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(230, 150, 100, 30);
        emailLabel.setForeground(Color.BLACK);
        emailLabel.setFont(myFont1);
        panel.add(emailLabel);

        emailTF = new JTextField();
        emailTF.setBounds(300, 150, 200, 30);
        panel.add(emailTF);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(230, 200, 100, 30);
        passwordLabel.setForeground(Color.BLACK);
        passwordLabel.setFont(myFont1);
        panel.add(passwordLabel);

        passwordTF = new JPasswordField();
        passwordTF.setBounds(300, 200, 200, 30);
        panel.add(passwordTF);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(300, 260, 90, 30);
        loginBtn.setBackground(new Color(255, 146, 105));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFont(myFont2);
        loginBtn.addActionListener(this);
        panel.add(loginBtn);

        registerBtn = new JButton("Register");
        registerBtn.setBounds(400, 260, 100, 30);
        registerBtn.setBackground(new Color(255, 146, 105));
        registerBtn.setForeground(Color.WHITE);
        registerBtn.setFont(myFont2);
        registerBtn.addActionListener(this);
        panel.add(registerBtn);

        this.add(panel);
		Exception();
    }
	public void Exception() {
		int a = 1;
        int b = 0;

       
        try {
			int result = b/a ;
            
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
	}
	
    public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == loginBtn) {
                String email = emailTF.getText();
                String password = new String(passwordTF.getPassword());

                String registeredEmail = Register.getRegisteredEmail(); 
                String registeredPassword = Register.getRegisteredPassword(); 

                if(email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Enter your email and password!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!email.equals(registeredEmail)) {
                    JOptionPane.showMessageDialog(this, "Incorrect Email!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals(registeredPassword)) {
                    JOptionPane.showMessageDialog(this, "Incorrect Password!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Login Successful!");
				    this.setVisible(false); 
            	    SwingUtilities.invokeLater(() -> {
				    FrameIntro frame = new FrameIntro(); 
				    frame.setVisible(true);});
                }
            
            
            } else if (ae.getSource() == registerBtn) {
                this.setVisible(false);
                Register register = new Register();
                register.setVisible(true);
            }
        
    }
}
