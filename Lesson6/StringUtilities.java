package lesson6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class StringUtilities 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("String Utility");
		frame.setSize(600, 300);
		frame.setLocation(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println(countLetter("Stanley"));
		System.out.println(reverseString("Stanley"));
		
		placeComponent(frame);
		frame.setVisible(true);
	}
	
	public static void placeComponent(JFrame frame)
	{
		frame.setLayout(null);
		
		JLabel jlblInput = new JLabel("Input");
		jlblInput.setBounds(300, 50, 80, 25);
		frame.add(jlblInput);
		
		JTextField jtxtfInput = new JTextField();
		jtxtfInput.setBounds(300, 70, 160, 25);
		frame.add(jtxtfInput);
		
		JLabel jlblOutput = new JLabel("Output");
		jlblOutput.setBounds(300, 90, 80, 25);
		frame.add(jlblOutput);
		
		JTextField jtxtfOutput = new JTextField();
		jtxtfOutput.setBounds(300, 110, 160, 25);
		frame.add(jtxtfOutput);
		
		//Button
		JButton jbtnCountLetter = new JButton("Count Letters");
		jbtnCountLetter.setBounds(100,50,150,25);
		frame.add(jbtnCountLetter);
		jbtnCountLetter.addActionListener(new ActionListener() { // Add event to the button using Anonymous class
			// Resolve using Anonymous class
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				jtxtfOutput.setText(""+countLetter(jtxtfInput.getText()));
			} 
		});
		
		JButton jbtnReverseLetter = new JButton("Reverse Letters");
		jbtnReverseLetter.setBounds(100,80,150,25);
		frame.add(jbtnReverseLetter);
		// Add event on the button using anonymous class
		jbtnReverseLetter.addActionListener(new ActionListener() { // Add event
			@Override
			public void actionPerformed(ActionEvent e)
			{
				jtxtfOutput.setText(reverseString(jtxtfInput.getText()));
			}
		});
		
		
		
		JButton jbtnRemoveLetter = new JButton("Remove Duplicates");
		jbtnRemoveLetter.setBounds(100,110,150,25);
		frame.add(jbtnRemoveLetter);
		jbtnRemoveLetter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				jtxtfOutput.setText(removeDuplicates(jtxtfInput.getText()));
			}
		});
		
	}
	
	
	
	// Count Letter
	public static int countLetter(String letter)
	{
		int count = 1;
		if(letter.length() == 1)
		{
			return count;
		}
		else
		{
			return count + countLetter(letter.substring(1));
		}
	}
	
	// Reverse Letter
	public static String reverseString(String letter)
	{
		if(letter.length() == 1)
		{
			return letter.substring(0, 1); // Base case
		}
		else
		{
			return reverseString(letter.substring(1)) + letter.substring(0, 1);
		}
	}
	
	//Remove Duplicates character
		public static String removeDuplicates(String s)
		{
			String s2 = "";
			
			int k = s.length();
			int[] repeatedIndex = new int[k*k];
			int countIdx = 0;
			
			// Initialize repeatedIndex to -1 values, because I don't want default initialization to 0
			for(int i = 0; i < repeatedIndex.length; i++)
			{
				repeatedIndex[i] = -1;
			}
			
			for(int i = 0; i < s.length(); i++)
			{
				int count = 0;
				
				for(int l = 0; l < repeatedIndex.length; l++) 
				{
					if(i == repeatedIndex[l]) // i compare to see if this index is repeated
					{
						count++;
					}
				}
				
				if(count == 0) // if index not repeated, now I take it and put the value
				{
					s2 += s.substring(i, i+1);
				}
				
				// Fill the repeatedIndex table
				// I check if the value in this index is found to all of the remain value of the index 
				for(int j = i+1; j < s.length(); j++)
				{
					if(s.substring(i, i+1).equals(s.substring(j, j+1)))
					{
						repeatedIndex[countIdx] = j;
						countIdx++;
					}
				}
				
				
			}
					
			return s2;
		}
}
