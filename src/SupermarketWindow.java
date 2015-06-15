
import javax.swing.JFrame;

public class SupermarketWindow {
	public static void main(String[] args){
		SupermarketPanel panel = new SupermarketPanel();
		ControlSupermarket control = new ControlSupermarket(panel);
		panel.controller(control);
		
		JFrame ventana= new JFrame("Supermarket");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane(panel);
		ventana.pack();
		ventana.setVisible(true);
	}
}
