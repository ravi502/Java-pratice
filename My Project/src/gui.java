import javax.swing.JOptionPane;

public class gui {
public static void main(String args[])
{
	String x,y;
	x=JOptionPane.showInputDialog("Enter first number");
	y=JOptionPane.showInputDialog("Enter Second number");
	
	int a = Integer.parseInt(x);
	int b = Integer.parseInt(y);
	int sum = a+b;
	JOptionPane.showMessageDialog(null,"Total is "+sum,"Output",JOptionPane.PLAIN_MESSAGE);
}

}
