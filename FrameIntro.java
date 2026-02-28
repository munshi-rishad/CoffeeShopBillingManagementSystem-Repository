import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameIntro extends JFrame implements MouseListener, ActionListener {
    JPanel panel;
    JLabel BaseLabel, SubLabel, HeadLabel, TypeLabel, BrewTypeLabel, SugarLabel, tpLabel;
    JButton exitBtn, PriceBtn, proceedBtn;
    JRadioButton r1,r2, r3;
    ButtonGroup bg1;
    JComboBox<String> combo1, combo2, combo3;
	Color myColor,myColor2,myColor3;
    Font myFont, myFont2, myFont3,myFont4,myFont5,myFont11,myFont22,myFont55;
    double tp;

    public FrameIntro() {
        super("Make My Coffee");
        this.setBounds(600,200,800,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

        myColor = new Color(51, 204, 255);
		myColor2= new Color(86,55,33);
		myColor3 = new Color(255, 241, 172);
		myFont11 = new Font("Arial", Font.PLAIN, 14);
        myFont = new Font("Cambria", Font.PLAIN, 20);
		myFont22 = new Font("Arial", Font.BOLD, 14);
		myFont55= new Font("Algerian",Font.BOLD,35);
        myFont2 = new Font("Aharoni", Font.BOLD, 35);
        myFont3 = new Font("Calibri Light ", Font.ITALIC, 25);
		myFont4 = new Font("Cambria", Font.PLAIN, 30);
		myFont5 = new Font("Arial Black", Font.PLAIN, 35);
	
		JPanel panel = new JPanel()
		{
			public void paintComponent(Graphics g) {
				Image backgroundImage = new ImageIcon("rafiq.png").getImage();
				super.paintComponent(g);
				g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
			}
		};
        panel.setLayout(null);
        panel.setOpaque(false); 
        panel.setBounds(0, 0, 800, 500); 

		HeadLabel = new JLabel("<html><u>Make My Coffee</u></html>");
		HeadLabel.setBounds(120, 5, 391, 59);
		HeadLabel.setForeground(Color.BLACK); 
		HeadLabel.setFont(myFont55);	
		panel.add(HeadLabel);	

        SubLabel = new JLabel("Slurp  Slurp ");
        SubLabel.setBounds(387, 45, 551, 41);
        SubLabel.setForeground( Color.BLACK); 
        SubLabel.setFont(myFont3);
        panel.add(SubLabel);

        BaseLabel = new JLabel("Base:");
        BaseLabel.setBounds(169, 103, 100, 30);
        BaseLabel.setForeground(Color.BLACK);
        BaseLabel.setFont(myFont11);
        panel.add(BaseLabel);

        TypeLabel = new JLabel("Type:");
        TypeLabel.setBounds(169, 152, 100, 30);
        TypeLabel.setForeground(Color.BLACK);
        TypeLabel.setFont( myFont11);
        panel.add(TypeLabel);

        BrewTypeLabel = new JLabel("Brew Type:");
        BrewTypeLabel.setBounds(169, 205, 100, 30);
        BrewTypeLabel.setForeground(Color.BLACK);
        BrewTypeLabel.setFont(myFont11);
        panel.add(BrewTypeLabel);
		
		SugarLabel = new JLabel("Sugar:");
        SugarLabel.setBounds(169, 245, 100, 30);
        SugarLabel.setForeground(Color.BLACK);
        SugarLabel.setFont(myFont11);
        panel.add(SugarLabel);


        tpLabel = new JLabel("Total:  0.00Tk");
        tpLabel.setBounds(470, 353, 195, 50);
        tpLabel.setForeground(Color.BLACK); 
        tpLabel.setFont(myFont4);

		tpLabel.setBackground(Color.WHITE);
        panel.add(tpLabel);

        exitBtn = new JButton("Back");
        exitBtn.setBounds(155, 395, 95, 30);
        exitBtn.setBackground(new Color(214, 227, 133));
		exitBtn.setFont(myFont22);		
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this); 
        panel.add(exitBtn); 
		 
		proceedBtn=new JButton("Proceed");
		proceedBtn.setBounds(270, 395, 95, 30);
		proceedBtn.setBackground(new Color(214, 227, 133)); 
		proceedBtn.setFont(myFont22);	
		proceedBtn.addMouseListener(this);
		proceedBtn.addActionListener(this); 
		panel.add(proceedBtn); 
		

        PriceBtn = new JButton("Price");
        PriceBtn.setBounds(200, 305, 150, 30);
		PriceBtn.setBackground(new Color(255, 241, 172));		
        PriceBtn.addActionListener(this); 
		PriceBtn.addMouseListener(this); 
        panel.add(PriceBtn);

        r1 = new JRadioButton("Yes");
        r1.setBounds(245, 253, 55, 20);
		r1.setBackground(new Color(255, 146, 105)); 		
        panel.add(r1);

        r3 = new JRadioButton("NO"); 
        r3.setBounds(317, 253, 55, 20);
		r3.setBackground(new Color(255, 146, 105)); 
		panel.add(r3);

        bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r3);

        String items1[] = {"Select","Water 0.00Tk", "Milk 15.00 Tk", "Vegan Milk 25.00 Tk"};
        combo1 = new JComboBox<>(items1);
        combo1.setBounds(245, 105, 125, 30);
		combo1.setSelectedIndex(0);  
        panel.add(combo1);

        String items2[] = {"Select","Hot","Cold","Iced"};
        combo2 = new JComboBox<>(items2);
        combo2.setBounds(245, 153, 125, 30);
		combo2.setSelectedIndex(0);  
        panel.add(combo2);

        String items3[] = {"Select","Espresso 25.00Tk", "Cappuccino 35.00Tk", "Americano 15.00Tk", "Latte 55.00Tk"};
        combo3 = new JComboBox<>(items3);
        combo3.setBounds(245, 207, 125, 30);
		combo3.setSelectedIndex(0);  
        panel.add(combo3);

        this.add(panel);
    }    
        
		public void mouseClicked(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseReleased(MouseEvent me){}
		public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == proceedBtn)
		{
			proceedBtn.setBackground(Color.GREEN);
			proceedBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			
			exitBtn.setForeground(Color.BLACK);
		} 
		else
		{
			PriceBtn.setBackground(new Color (255,255,0));
			PriceBtn.setForeground(Color.BLACK);
		}
		
	}
	public void mouseExited(MouseEvent me) 
	{
		if(me.getSource() == proceedBtn) 
		{
			proceedBtn.setBackground(new Color(214, 227, 133)); 	
			proceedBtn.setForeground(Color.BLACK); 
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(new Color(214, 227, 133)); 	
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			PriceBtn.setBackground(new Color (255, 241, 172));
			PriceBtn.setForeground(Color.BLACK);
		}
	}

 public void actionPerformed(ActionEvent e) {
    if (e.getSource() == PriceBtn) {
		if (combo1.getSelectedIndex() == 0) {
		JOptionPane.showMessageDialog(this, "Oops,Customoization Incomplete!", "Selection Error", JOptionPane.WARNING_MESSAGE);
		return;
		} 

		if (!r1.isSelected() && !r3.isSelected()) {
		JOptionPane.showMessageDialog(this, "Oops,Customoization Incomplete !", "Selection Error", JOptionPane.WARNING_MESSAGE);
		return;
		}   
		if (combo2.getSelectedIndex() == 0 || combo3.getSelectedIndex() == 0) {
		JOptionPane.showMessageDialog(this, "Oops,Customization Incomplete!", "Selection Error", JOptionPane.WARNING_MESSAGE);
		return; 
		}   
		updateTotal();
    }
		else if (e.getSource() == exitBtn) {
            this.setVisible(false);
            Login login=new Login();
            login.setVisible(true);
        } else if (e.getSource() == proceedBtn) {
			if (combo1.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(this, "Oops,Customoization Incomplete!", "Selection Error", JOptionPane.WARNING_MESSAGE);
				return;
				} 
		
				if (!r1.isSelected() && !r3.isSelected()) {
				JOptionPane.showMessageDialog(this, "Oops,Customoization Incomplete !", "Selection Error", JOptionPane.WARNING_MESSAGE);
				return;
				}   
				if (combo2.getSelectedIndex() == 0 || combo3.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(this, "Oops,Customization Incomplete!", "Selection Error", JOptionPane.WARNING_MESSAGE);
				return; 
				}   
				updateTotal();
            	PaymentMathod p = new PaymentMathod();
            	p.setVisible(true);
            	this.setVisible(false);
        }
    }

    private void updateTotal() {
        String selectedBase = (String) combo1.getSelectedItem();
        String selectedBrew = (String) combo3.getSelectedItem();

        double basePrice = 0.0;
        double brewPrice = 0.0;

		switch (selectedBase) {
		case "Water 5.00Tk":
		basePrice = 0.00 ;
		break;
		case "Milk 15.00 Tk":
		basePrice = 15.00;
		break; 
		case "Vegan Milk 25.00 Tk":
		basePrice = 25.00;
		break;
		}

		switch (selectedBrew) {
		case "Espresso 25.00Tk":
		brewPrice = 25.00;
		break;
	    case "Cappuccino 35.00Tk":
		brewPrice = 35.00;
		break;
		case "Americano 15.00Tk":
		brewPrice = 15.00;
		break;
		case "Latte 55.00Tk":
		brewPrice = 55.00;
		break;
        }

        tp = basePrice + brewPrice;
        tpLabel.setText("Total: " + tp + "Tk");
    }
}