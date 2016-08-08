/* Calculator */
import java.awt.*;
import java.awt.event.*;
class Calculator extends WindowAdapter implements ActionListener
{
	static double n1,n2,result=0;
	static StringBuffer operator=new StringBuffer("");
	Frame f;
	TextField tf;
	Button b[][]=new Button[5][4];
	Calculator(String s,String arr[][])
	{
		f=new Frame(s);
		f.setSize(218,291);
		f.setBackground(Color.LIGHT_GRAY);
		f.setVisible(true);
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		tf=new TextField();
		tf.setBounds(7,37,202,40);
		f.add(tf);
		int y=81;
		for(int i=0;i<5;i++)
		{
			int x=9;
			for(int j=0;j<4;j++)
			{
				b[i][j]=new Button(String.valueOf(arr[i][j]));
				b[i][j].setBounds(x,y,50,40);
				b[i][j].addActionListener(this);
				x+=50;
				f.add(b[i][j]);
			}
			System.out.println();
			y+=40;
		}
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
			
			if(ae.getSource()==b[0][0])
			{
					tf.setText(tf.getText()+"1");
			}
			else if(ae.getSource()==b[0][1])
			{
				tf.setText(tf.getText()+"2");
			}
			else if(ae.getSource()==b[0][2])
			{
				tf.setText(tf.getText()+"3");
			}
			else if(ae.getSource()==b[0][3])
			{
				n1=Double.parseDouble(tf.getText());
				tf.setText("");
				operator.insert(0,"+");
			}
			
			else if(ae.getSource()==b[1][0])
			{
					tf.setText(tf.getText()+"4");
			}
			else if(ae.getSource()==b[1][1])
			{
				tf.setText(tf.getText()+"5");
			}
			else if(ae.getSource()==b[1][2])
			{
				tf.setText(tf.getText()+"6");
			}
			else if(ae.getSource()==b[1][3])
			{
				n1=Double.parseDouble(tf.getText());
				tf.setText("");
				operator.insert(0,"-");
			}
			
			else if(ae.getSource()==b[2][0])
			{
					tf.setText(tf.getText()+"7");
			}
			else if(ae.getSource()==b[2][1])
			{
				tf.setText(tf.getText()+"8");
			}
			else if(ae.getSource()==b[2][2])
			{
				tf.setText(tf.getText()+"9");
			}
			else if(ae.getSource()==b[2][3])
			{
				n1=Double.parseDouble(tf.getText());
				tf.setText("");
				operator.insert(0,"/");
			}
			
			else if(ae.getSource()==b[3][0])
			{
				tf.setText("");
			}
			else if(ae.getSource()==b[3][1])
			{
				tf.setText(tf.getText()+"0");
			}
			else if(ae.getSource()==b[3][2])
			{
				n2=Double.parseDouble(tf.getText());
				if(operator.charAt(0)=='+')
				{
					result= n1 + n2;
				}
				if(operator.charAt(0)=='-')
				{
					result= n1 - n2;
				}
				if(operator.charAt(0)=='/')
				{
					result= n1 / n2;
				}
				if(operator.charAt(0)=='*')
				{
					result= n1 * n2;
				}
				if(operator.charAt(0)=='%')
				{
					result= (n1/100)* n2;
				}
				tf.setText(String.valueOf(result));
			}
			else if(ae.getSource()==b[3][3])
			{
				n1=Double.parseDouble(tf.getText());
				tf.setText("");
				operator.insert(0,"*");
			}
			else if(ae.getSource()==b[4][0])
			{
				n1=Double.parseDouble(tf.getText());
				tf.setText(String.valueOf(Math.sqrt(n1)));
			}
			else if(ae.getSource()==b[4][1])
			{
				tf.setText(tf.getText()+".");
			}
			else if(ae.getSource()==b[4][2])
			{
				n1=Double.parseDouble(tf.getText());
				tf.setText("");
				operator.insert(0,"%");
			}
			else if(ae.getSource()==b[4][3])
			{
				String temp="";
				String splited[]= tf.getText().split("");
				for(int i=0;i<splited.length-1;i++)
				{
					temp+=splited[i];
				}
				tf.setText(temp);
			}
	}
	
	public static void main(String[] args)
	{
		new Calculator("Calculator", new String[][]{{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","/"},{"c","0","=","*"},{"sqrt",".","%","ce"}});
	}
}