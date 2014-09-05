import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CalculatorMain implements ActionListener{

	public JFrame frame;
	public JPanel tjp,vjp,ijp,cjp;
	public Button numb[],cb[];
	public TextArea ta;
	GridBagLayout gb4tjp;
	GridBagConstraints gbc;
	public CalculatorMain(){
		frame =new JFrame("EasyCalculator");
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
		gbc.fill=GridBagConstraints.HORIZONTAL;
		addComponent(vjp,0,0,20,2);
		addComponent(ijp,3,0,12,12);
		addComponent(cjp,3,12,8,12);
		//ÑÕÉ«
		vjp.setBackground(Color.blue);
		ijp.setBackground(Color.YELLOW);
		cjp.setBackground(Color.green);
		
		//¼üÅÌÇø+++++++++++++++
		numb = new Button[12];
		ijp.setLayout(new GridLayout(4,3));
		for(int i=1;i<10;i++){
			numb[i]=new Button(String.valueOf(i));
			numb[i].addActionListener(this);
			ijp.add(numb[i]);
		}
		numb[10]=new Button(".");
		numb[10].addActionListener(this);
		ijp.add(numb[10]);
		numb[0]=new Button("0");
		numb[0].addActionListener(this);
		ijp.add(numb[0]);
		numb[11]=new Button("CL");
		numb[11].addActionListener(this);
		ijp.add(numb[11]);
		//-------------------
		
		//ÏÔÊ¾±à¼­++++++++++++++
		ta = new TextArea(1,10);
		vjp.add(ta);
		
		//--------------------
		
		//¿ØÖÆ+++++++++++++
		cjp.setLayout(new GridLayout(4,2));
		cb = new Button[8];
		cb[0] = new Button("+");
		cb[1] = new Button("-");
		cb[2] = new Button("*");
		cb[3] = new Button("/");
		cb[4] = new Button("(");
		cb[5] = new Button(")");
		cb[6] = new Button("CE");
		cb[7] = new Button("=");
		
		for(int i=0;i<8;i++){
			cb[i].addActionListener(this);
			cjp.add(cb[i]);
		}
		
		//---------------
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);				
			}
		});
		frame.setSize(300,400);
		frame.setVisible(true);
	}
	//ºá£¬×Ý£¬¿í£¬¸ß
	public void addComponent(Component c,int x,int y,int w,int h){
		gbc.gridy=x;
		gbc.gridx=y;
		
		gbc.gridheight=h;
		gbc.gridwidth=w;
		gb4tjp.setConstraints(c,gbc);
		tjp.add(c);
		
	}
	public static void main(String[] args) {
		CalculatorMain cal= new CalculatorMain();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<12;i++){
			if(e.getSource()==numb[i]){
				System.out.println(i);
				if(i==10){               //"."
					
				}
				if(i==11){               //"CL"
					
				}
			}
		}
	}
}
