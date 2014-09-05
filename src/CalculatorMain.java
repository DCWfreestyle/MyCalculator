import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorMain {

	public JFrame frame;
	public JPanel tjp,vjp,ijp,cjp;
	GridBagLayout gb4tjp;
	GridBagConstraints gbc;
	public CalculatorMain(){
		frame =new JFrame("Swing Frame");
		Container c = frame.getContentPane();
		tjp= new JPanel();
		vjp= new JPanel();
		ijp= new JPanel();
		cjp= new JPanel();
		c.add(tjp);
		gb4tjp=new GridBagLayout();
		gbc = new GridBagConstraints();
		tjp.setLayout(gb4tjp);
		tjp.setBackground(Color.WHITE);
		addComponent(vjp,0,0,2,1);
		addComponent(ijp,3,0,6,6);
		addComponent(cjp,3,6,6,4);
		//ÑÕÉ«
		vjp.setBackground(Color.blue);
		ijp.setBackground(Color.YELLOW);
		cjp.setBackground(Color.green);
		
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);				
			}
		});
		frame.setSize(300,400);
		frame.setVisible(true);
	}
	public void addComponent(Component c,int row,int col,int nrow,int ncol){
		gbc.gridx=col;
		gbc.gridy=row;
		gbc.gridheight=ncol;
		gbc.gridwidth=nrow;
		gb4tjp.setConstraints(c,gbc);
		tjp.add(c);
		
	}
	public static void main(String[] args) {
		CalculatorMain cal= new CalculatorMain();
	}

}
