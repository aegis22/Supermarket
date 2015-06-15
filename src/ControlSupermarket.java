import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControlSupermarket implements ActionListener{
	private SupermarketView window;
	private Supermarket supermarket;
		
	public ControlSupermarket(SupermarketView view){
		window = view;
		supermarket = new Supermarket();
	}
		
		
	public void actionPerformed(ActionEvent event){
		String command = event.getActionCommand();
		
		if(command.equals("Result")) {
			try {
				int numberProducts[] = new int[4];
				numberProducts[0] = Integer.parseInt(window.getTextApples());
				numberProducts[1] = Integer.parseInt(window.getTextBread());
				numberProducts[2] = Integer.parseInt(window.getTextCheese());
				numberProducts[3] = Integer.parseInt(window.getTextDrink());
				window.setTextTotal(supermarket.calculateTotal(numberProducts));
				window.ok("Your price");
			} catch (NumberFormatException e) {
				window.error("Must have numbers in fields");
			}			
		}else if(command.equals("Clean")){
			window.cleanContent();
			window.ok("Window cleaned");	
		}
	
	}	

}
