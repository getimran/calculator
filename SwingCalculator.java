/*Calculator in Swing */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SwingCalculator implements ActionListener
{
	double n1,n2,result;
	static StringBuffer operator=new StringBuffer("");
	JFrame jf;
	JPanel jp2;
	JButton jb[]=new JButton[20];
	String str[]={"1","2","3","+","4","5","6","-","7","8","9","*","sqrt","0","=","/","c","ce",".","%"};
	JTextField tf;
	SwingCalculator(String s)
	{
		jf=new JFrame(s);
		jp2= new JPanel();
		tf=new JTextField(22);
		tf.setBounds(7,7,245,40);
		jp2.setLayout(new GridLayout(5,4,6,6));
		jp2.setBorder(BorderFactory.createEmptyBorder(53,6,6,6));
		for(int i=0;i<jb.length;i++)
		{
			jb[i]=new JButton(str[i]);
			jp2.add(jb[i]);
			jb[i].addActionListener(this);
		}
		jf.add(tf);
		jf.add(jp2,BorderLayout.CENTER);
		jf.setSize(274,330);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
			if(ae.getSource()==jb[0])
			{
					tf.setText(tf.getText()+"1");
			}
			else if(ae.getSource()==jb[1])
			{
				tf.setText(tf.getText()+"2");
			}
			else if(ae.getSource()==jb[2])
			{
				tf.setText(tf.getText()+"3");
			}
			else if(ae.getSource()==jb[3])
			{
				if(!(tf.getText().equals("")))
				{
					n1=Double.parseDouble(tf.getText());
					tf.setText("");
					operator.insert(0,"+");
				}
			}
			else if(ae.getSource()==jb[4])
			{
					tf.setText(tf.getText()+"4");
			}
			else if(ae.getSource()==jb[5])
			{
				tf.setText(tf.getText()+"5");
			}
			else if(ae.getSource()==jb[6])
			{
				tf.setText(tf.getText()+"6");
			}
			else if(ae.getSource()==jb[7])
			{
				if(!(tf.getText().equals("")))
				{
					n1=Double.parseDouble(tf.getText());
					tf.setText("");
					operator.insert(0,"-");
				}
			}
			else if(ae.getSource()==jb[8])
			{
					tf.setText(tf.getText()+"7");
			}
			else if(ae.getSource()==jb[9])
			{
				tf.setText(tf.getText()+"8");
			}
			else if(ae.getSource()==jb[10])
			{
				tf.setText(tf.getText()+"9");
			}
			else if(ae.getSource()==jb[11])
			{
				if(!(tf.getText().equals("")))
				{
					n1=Double.parseDouble(tf.getText());
					tf.setText("");
					operator.insert(0,"*");
				}
			}
			else if(ae.getSource()==jb[12])
			{
				n1=Double.parseDouble(tf.getText());
				tf.setText(String.valueOf(Math.sqrt(n1)));	
			}
			else if(ae.getSource()==jb[13])
			{
				tf.setText(tf.getText()+"0");
			}
			else if(ae.getSource()==jb[14])
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
			else if(ae.getSource()==jb[15])
			{
				if(!(tf.getText().equals("")))
				{
					n1=Double.parseDouble(tf.getText());
					tf.setText("");
					operator.insert(0,"/");
				}
			}
			else if(ae.getSource()==jb[16])
			{
				tf.setText("");
			}
			else if(ae.getSource()==jb[17])
			{
			
				String temp="";
				String splited[]= tf.getText().split("");
				for(int i=0;i<splited.length-1;i++)
				{
					temp+=splited[i];
				}
				tf.setText(temp);
			}
			else if(ae.getSource()==jb[18])
			{
				if(tf.getText().indexOf(".")==-1)
					tf.setText(tf.getText()+".");
			}
			else if(ae.getSource()==jb[19])
			{
				if(!(tf.getText().equals("")))
				{
					n1=Double.parseDouble(tf.getText());
					tf.setText("");
					operator.insert(0,"%");
				}
			}
	}
	public static void main(String[] args)
	{
		new SwingCalculator("Calculator");
	}
}
		
		
		