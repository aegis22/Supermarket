
import javax.swing.JFrame;

public class SupermarketWindow {
	public static void main(String[] args){
		SupermarketPanel panel = new SupermarketPanel();
		ControlSupermarket control = new ControlSupermarket(panel);
		panel.controller(control);
		
		JFrame window = new JFrame("Supermarket");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(panel);
		window.pack();
		window.setVisible(true);
	}
}
