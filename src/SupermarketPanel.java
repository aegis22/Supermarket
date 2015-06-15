
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class SupermarketPanel extends JPanel implements SupermarketView {	
	private static final long serialVersionUID = 1L;
	
	private JTextField textApples, textBread, textCheese, textDrink, textTotal;
	private JTextArea info;
	private JButton buttonResult, buttonClean;
	private JLabel southLabel;

	public SupermarketPanel () {
			
		// North Panel
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(6,2));
		JLabel appleLabel = new JLabel("Apples");
		textApples = new JTextField(10);
		JLabel breadLabel = new JLabel("Bread");
		textBread = new JTextField(10);
		JLabel cheeseLabel = new JLabel("Cheese (g)");
		textCheese = new JTextField(10);
		JLabel drinkLabel = new JLabel("Fizzy Drink");
		textDrink = new JTextField(10);
		buttonResult = new JButton("Total");
		buttonClean = new JButton("Clean");
		textTotal = new JTextField(10);
		textTotal.setEditable(false);
		northPanel.add(appleLabel);
		northPanel.add(textApples);
		northPanel.add(breadLabel);
		northPanel.add(textBread);
		northPanel.add(cheeseLabel);
		northPanel.add(textCheese);
		northPanel.add(drinkLabel);
		northPanel.add(textDrink);
		northPanel.add(buttonResult);
		northPanel.add(buttonClean);
		northPanel.add(textTotal);
			
		// Central panel
		JPanel centralPanel = new JPanel();
		info = new JTextArea(6,40);
		info.setText("Please introduce the quantity of products.\n" +
					 "Pulse the button \"Total\" to calculate total price.\n" +
					 "Pulse the button \"clean\" to clean numbers.");
		info.setEditable(false);
		centralPanel.add(new JScrollPane(info));
				
		// South panel
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(3,1));
		southLabel = new JLabel("");
		southLabel.setForeground(Color.red);
		southPanel.add(southLabel);
			
		// Main panel
		setLayout(new BorderLayout());
		add(northPanel, BorderLayout.NORTH);
		add(centralPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
	}
		

	public void controller(ActionListener controller) {
		buttonResult.addActionListener(controller);
		buttonClean.addActionListener(controller);
		
		buttonResult.setActionCommand(RESULT);
		buttonClean.setActionCommand(CLEAN);
	}


	public String getTextApples() {
		return textApples.getText();
	}

	public String getTextBread() {
		return textBread.getText();
	}

	public String getTextCheese() {
		return textCheese.getText();
	}
	
	public String getTextDrink() {
		return textDrink.getText();
	}

	public void setTextTotal(String S) {
		textTotal.setText(S);
	}

	public void error(String message) {
		southLabel.setForeground(Color.red);
		southLabel.setText(message);
	}


	public void ok(String message) {
		southLabel.setForeground(Color.blue);
		southLabel.setText(message);
	}
		
	public void cleanContent() {
		textApples.setText("");
		textBread.setText("");
		textCheese.setText("");
		textDrink.setText("");
		textTotal.setText("");
	}
		

}
