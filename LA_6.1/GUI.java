import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
	public static void main(String[] args) {
		new Frame("Admission Counter");
	}
}

class Frame implements ActionListener {
	JFrame GUI;
	JLabel cse,csbs,result;
	JTextField cseCount,csbsCount;
	JButton btn;
	Frame(String s) {
		GUI=new JFrame(s);
		GUI.getContentPane().setBackground(Color.CYAN);
		
		cse=new JLabel("Enter the count of CSE Students");
		cseCount=new JTextField(20);
		csbs=new JLabel("Enter the count of CSBS Students");
		csbsCount=new JTextField(20);
		btn=new JButton("Submit");
		btn.addActionListener(this);
		result=new JLabel();

		result.setOpaque(true);
		result.setBackground(Color.RED);

		cse.setForeground(Color.BLUE);
		csbs.setForeground(Color.BLUE);
		cseCount.setForeground(Color.BLACK);
		csbsCount.setForeground(Color.BLACK);
		GUI.add(cse);
		GUI.add(cseCount);
		GUI.add(csbs);
		GUI.add(csbsCount);
		GUI.add(btn);
		GUI.add(result);
		GUI.setLayout(new FlowLayout());
		GUI.setSize(500,500);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		String field1,field2;
		
		field1=cseCount.getText();
		field2=csbsCount.getText();
		
		if (field1.isEmpty() || field2.isEmpty())
		{
			result.setText("Count(s) cannot be empty");
		}
		else
		{
			try
			{
				int n1=Integer.parseInt(field1);
				int n2=Integer.parseInt(field2);
				if (n1<0 || n2<0)
				{
					result.setText("Count cannot be negative");
				}
				else
				{
					int n3=n1+n2;
					String field3=Integer.toString(n3);
					result.setText("Total Students : "+field3);
					cseCount.setEditable(false);
					csbsCount.setEditable(false);
				}
			}
			catch(Exception e)
			{
				result.setText("Count should be a whole number");
			}
		}
	}
}
