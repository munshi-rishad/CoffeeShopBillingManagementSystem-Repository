import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentMathod extends JFrame implements ActionListener, MouseListener
{
	JPanel panel;
	JLabel payment,logoLabel,mobileLabel,pinLabel,titleLabel,cardNumberLabel,expiryDateLabel,cvvLabel,nameOnCardLabel,locationLabel;
	JTextField mobileField,cardNumberField,expiryDateField,nameOnCardField,locationField;
	JPasswordField pinField,cvvField;
	JRadioButton cash, bkash, card;
	ButtonGroup b1,b2;
	JButton  confirm, back;

	PaymentMathod()
	{
		super("Payment Mathod");
		this.setBounds(600,200,800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon i1=new ImageIcon("bkash.png");
		ImageIcon i2=new ImageIcon("card.png");
		ImageIcon i3=new ImageIcon("location.png");
		ImageIcon i4=new ImageIcon("back.png");
		Image backgroundImage=new ImageIcon("3.png").getImage();

		panel=new JPanel()
		{
            public void paintComponent(Graphics g) 
			{
                super.paintComponent(g);
                g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
            }
        };
        panel.setLayout(null);

		payment=new JLabel("PAYMENT OPTION",JLabel.CENTER);
		payment.setBounds(0, 8, 800, 70);
		payment.setForeground(new Color(255, 146, 105));
		payment.setBackground(Color.BLUE);
		payment.setFont(new Font("Cambria",Font.BOLD,40));
		payment.setOpaque(false);
		panel.add(payment);

		cash=new JRadioButton("Cash on Delivery");
		cash.setBounds(565,128,200,30);
		cash.setFont(new Font("Cambria", Font.BOLD, 14));
		cash.addActionListener(this);
		cash.setFocusable(false);
		cash.setOpaque(false);
		cash.setContentAreaFilled(false);
		cash.setBorderPainted(false);
		panel.add(cash);

		bkash=new JRadioButton("Bkash");
		bkash.setBounds(100,128,200,30);
		bkash.setFont(new Font("Cambria", Font.BOLD, 14));
		bkash.addActionListener(this);
		bkash.setFocusable(false);
		bkash.setOpaque(false);
		bkash.setContentAreaFilled(false);
		bkash.setBorderPainted(false);
		panel.add(bkash);

		card=new JRadioButton("Credit/Debit");
		card.setBounds(335,128,200,30);
		card.setFont(new Font("Cambria", Font.BOLD, 14));
		card.addActionListener(this);
		card.setFocusable(false);
		card.setOpaque(false);
		card.setContentAreaFilled(false);
		card.setBorderPainted(false);
		panel.add(card);

		b1=new ButtonGroup();
		b1.add(cash);
		b1.add(bkash);
		b1.add(card);
		

		/*bkash=new JButton();
		bkash.setBounds(150,200,200,40);
		bkash.setIcon(i1);
		bkash.setText("Bkash");
		bkash.setFocusable(false);
		bkash.setEnabled(false);
		bkash.addActionListener(this);
		panel.add(bkash);

		card=new JButton();
		card.setBounds(150,250,200,40);
		card.setIcon(i2);
		card.setText("Credit/Debit Card");
		card.setFocusable(false);
		card.setEnabled(false);
		panel.add(card);

		b2=new ButtonGroup();
		b2.add(bkash);
		b2.add(card);*/

		locationLabel=new JLabel("Set Location");
		locationLabel.setIcon(i3);
        locationLabel.setFont(new Font("Cambria", Font.BOLD, 17));
        locationLabel.setForeground(Color.BLACK);
        locationLabel.setBounds(130,182,350,30);
		locationLabel.setEnabled(false);
        panel.add(locationLabel);

		locationField=new JTextField();
		locationField.setBounds(36,220,330,40);
		locationField.setEnabled(false);
        panel.add(locationField);

		logoLabel=new JLabel("bKash Payment");
		logoLabel.setIcon(i1);
        logoLabel.setFont(new Font("Cambria", Font.BOLD, 17));
        logoLabel.setForeground(new Color(204,0,0));
        logoLabel.setBounds(100,275,350,30);
		logoLabel.setEnabled(false);
        panel.add(logoLabel);

        mobileLabel=new JLabel("Mobile Number:");
        mobileLabel.setBounds(50,323,120,25);
		mobileLabel.setFont(new Font("Arial", Font.BOLD, 12));
		mobileLabel.setEnabled(false);
        panel.add(mobileLabel);

        mobileField=new JTextField();
        mobileField.setBounds(180,323,140,25);
		mobileField.setEnabled(false);
        panel.add(mobileField);

        pinLabel=new JLabel("PIN:");
        pinLabel.setBounds(50,363,120,25);
		pinLabel.setFont(new Font("Arial", Font.BOLD, 12));
		pinLabel.setEnabled(false);
        panel.add(pinLabel);

        pinField=new JPasswordField();
        pinField.setBounds(180,363,140,25);
		pinField.setEnabled(false);
        panel.add(pinField);

		titleLabel=new JLabel("Credit Card Payment");
        titleLabel.setFont(new Font("Cambria", Font.BOLD, 17));
		titleLabel.setIcon(i2);
        titleLabel.setForeground(new Color(0,102,204));
        titleLabel.setBounds(480,182,400,35);
		titleLabel.setEnabled(false);
        panel.add(titleLabel);

        cardNumberLabel=new JLabel("Card Number:");
        cardNumberLabel.setBounds(425,230,120,25);
		cardNumberLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cardNumberLabel.setEnabled(false);
        panel.add(cardNumberLabel);

        cardNumberField=new JTextField();
        cardNumberField.setBounds(550,230,160,25);
		cardNumberField.setEnabled(false);
        panel.add(cardNumberField);

        expiryDateLabel=new JLabel("Expiry Date (MM/YY):");
        expiryDateLabel.setBounds(425,270,140,25);
		expiryDateLabel.setFont(new Font("Arial", Font.BOLD, 12));
		expiryDateLabel.setEnabled(false);
        panel.add(expiryDateLabel);

        expiryDateField=new JTextField();
        expiryDateField.setBounds(550,270,160,25);
		expiryDateField.setEnabled(false);
        panel.add(expiryDateField);

        cvvLabel=new JLabel("CVV:");
        cvvLabel.setBounds(425,310,120,25);
		cvvLabel.setFont(new Font("Arial", Font.BOLD, 12));
		cvvLabel.setEnabled(false);
        panel.add(cvvLabel);

        cvvField=new JPasswordField();
        cvvField.setBounds(550,310,160,25);
		cvvField.setEnabled(false);
        panel.add(cvvField);

        nameOnCardLabel=new JLabel("Name on Card:");
        nameOnCardLabel.setBounds(425,350,120,25);
		nameOnCardLabel.setFont(new Font("Arial", Font.BOLD, 12));
		nameOnCardLabel.setEnabled(false);
        panel.add(nameOnCardLabel);

        nameOnCardField=new JTextField();
        nameOnCardField.setBounds(550,350,160,25);
		nameOnCardField.setEnabled(false);
        panel.add(nameOnCardField);
		

		confirm=new JButton();
		confirm.setBounds(300,405,180,40);
		confirm.setText("Confirm!!");
		confirm.setFont(new Font("Arial", Font.BOLD, 18));
		confirm.setBackground(new Color(214, 227, 133));
		confirm.setForeground(Color.WHITE);
		confirm.setFocusable(false);
		confirm.setEnabled(false);
		confirm.addMouseListener(this);
		confirm.addActionListener(this);
		panel.add(confirm);

		back=new JButton();
		back.setBounds(0,0,25,25);
		back.setIcon(i4);
		back.setFont(new Font("Cambrial", Font.PLAIN, 10));
		back.setBackground(new Color(255, 146, 105));
		back.setForeground(Color.WHITE);
		back.setFocusable(false);
		back.addActionListener(this);
		panel.add(back);
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == confirm)
		{
			confirm.setBackground(Color.RED);
			confirm.setForeground(Color.BLACK);

		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==confirm)
		{
			confirm.setBackground(new Color(214, 227, 133)); 	
			confirm.setForeground(Color.BLACK);
		}
	}	

	public void enableBkashFields() 
	{
        logoLabel.setEnabled(true);
        mobileLabel.setEnabled(true);
        mobileField.setEnabled(true);
        pinLabel.setEnabled(true);
        pinField.setEnabled(true);
		locationLabel.setEnabled(true);
		locationField.setEnabled(true);
    }

	public void disableBkashFields() 
	{
        logoLabel.setEnabled(false);
        mobileLabel.setEnabled(false);
        mobileField.setEnabled(false);
        pinLabel.setEnabled(false);
        pinField.setEnabled(false);
    }

	private void clearBkashFields() 
	{
        mobileField.setText("");
        pinField.setText("");
	}	

	public void enableCardFields() 
	{
        titleLabel.setEnabled(true);
        cardNumberLabel.setEnabled(true);
        cardNumberField.setEnabled(true);
        expiryDateLabel.setEnabled(true);
        expiryDateField.setEnabled(true);
        cvvLabel.setEnabled(true);
        cvvField.setEnabled(true);
        nameOnCardLabel.setEnabled(true);
        nameOnCardField.setEnabled(true);
		locationLabel.setEnabled(true);
		locationField.setEnabled(true);
    }

	public void disableCardFields() 
	{
        titleLabel.setEnabled(false);
        cardNumberLabel.setEnabled(false);
        cardNumberField.setEnabled(false);
        expiryDateLabel.setEnabled(false);
        expiryDateField.setEnabled(false);
        cvvLabel.setEnabled(false);
        cvvField.setEnabled(false);
        nameOnCardLabel.setEnabled(false);
        nameOnCardField.setEnabled(false);
    }

	private void clearCardFields() 
	{
        cardNumberField.setText("");
        expiryDateField.setText("");
        cvvField.setText("");
        nameOnCardField.setText("");
	}	

	public void actionPerformed(ActionEvent e)
	{
			String mobileNumber=mobileField.getText();
        	String pin=new String(pinField.getPassword());
			String cardNumber=cardNumberField.getText();
        	String expiryDate=expiryDateField.getText();
        	String cvv=new String(cvvField.getPassword());
        	String nameOnCard=nameOnCardField.getText();
			String location=locationField.getText();

			if(e.getSource()==back)
			{
				this.setVisible(false); 
            	SwingUtilities.invokeLater(() -> {
				FrameIntro frame = new FrameIntro(); 
				frame.setVisible(true);});
			}
			else{}

			if(e.getSource()==cash)
			{
				confirm.setEnabled(true);
				disableBkashFields();
				disableCardFields();
				clearBkashFields();
				clearCardFields();
				locationLabel.setEnabled(true);
				locationField.setEnabled(true);
			}
		
			if(e.getSource()==bkash)
			{
				enableBkashFields();
				disableCardFields();
				clearCardFields();
				confirm.setEnabled(true);
			}
			else
			{
				disableBkashFields();
			}

			if(e.getSource()==card)
			{
				enableCardFields();
				disableBkashFields();
				clearBkashFields();
				confirm.setEnabled(true);

			}
			else
			{
				disableCardFields();
			}
		

			if(e.getSource()==confirm)
			{
            	if(bkash.isSelected()) 
				{
                	if(mobileNumber.isEmpty() || pin.isEmpty() || location.isEmpty()) 
					{
                    	JOptionPane.showMessageDialog(null, "Please fill in all the fields for Bkash payment and Location", "Error", JOptionPane.ERROR_MESSAGE);
						enableBkashFields();
                	} 
					else 
					{
                    	JOptionPane.showConfirmDialog(null, "Do you want to confirm order?", "Confirm!!", JOptionPane.OK_CANCEL_OPTION);
						System.exit(0);
                	}
            	} 
				else if(card.isSelected()) 
				{
                	if(cardNumber.isEmpty() || expiryDate.isEmpty() || cvv.isEmpty() || nameOnCard.isEmpty() || location.isEmpty()) 
					{
                    	JOptionPane.showMessageDialog(null, "Please fill in all the fields for Card payment and Location", "Error", JOptionPane.ERROR_MESSAGE);
						enableCardFields();
                	} 
					else 
					{
                    	JOptionPane.showConfirmDialog(null, "Do you want to confirm order?", "Confirm!!", JOptionPane.OK_CANCEL_OPTION);
						System.exit(0);
                	}
            	} 
				else if(cash.isSelected()) 
				{
					if(location.isEmpty()) 
					{
                    	JOptionPane.showMessageDialog(null, "Please fill in all the fields for Location", "Error", JOptionPane.ERROR_MESSAGE);
						enableCardFields();
                	}
					else
					{
                		JOptionPane.showConfirmDialog(null, "Do you want to confirm order?", "Confirm!!", JOptionPane.OK_CANCEL_OPTION);
						System.exit(0);
					}	
            	}
        	}
		

	}
	
}