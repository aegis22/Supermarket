
import java.awt.event.ActionListener;

public interface SupermarketView {
	public static String RESULT = "Result";
	public static String CLEAN = "Clean";
		
	public void controller(ActionListener controller);
	public String getTextApples();
	public String getTextBread();
	public String getTextCheese();
	public String getTextDrink();
	public void setTextTotal(String s);
	public void error(String message);
	public void ok(String message);
	public void cleanContent();
	
}
