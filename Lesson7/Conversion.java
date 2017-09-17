package lesson7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Conversion 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("String Utility");
		frame.setSize(900, 500);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		placeComponent(frame);
		frame.setVisible(true);
	}
	
	public static void placeComponent(JFrame frame)
	{
		frame.setLayout(null);
		
		JLabel jlblMile = new JLabel("Mile:");
		jlblMile.setBounds(100, 50, 80, 25);
		frame.add(jlblMile);
		
		JTextField jtxtfMile = new JTextField();
		jtxtfMile.setBounds(200, 50, 100, 25);
		frame.add(jtxtfMile);
		
		JLabel jlblKilometer = new JLabel("Kilometer:");
		jlblKilometer.setBounds(400, 50, 80, 25);
		frame.add(jlblKilometer);
		
		JTextField jtxtfKilometer = new JTextField();
		jtxtfKilometer.setBounds(500, 50, 100, 25);
		frame.add(jtxtfKilometer);
		
		JLabel jlblPound = new JLabel("Pound:");
		jlblPound.setBounds(100, 100, 80, 25);
		frame.add(jlblPound);
		
		JTextField jtxtfPound = new JTextField();
		jtxtfPound.setBounds(200, 100, 100, 25);
		frame.add(jtxtfPound);
		
		JLabel jlblKilogram = new JLabel("Kilogram:");
		jlblKilogram.setBounds(400, 100, 80, 25);
		frame.add(jlblKilogram);
		
		JTextField jtxtfKilogram = new JTextField();
		jtxtfKilogram.setBounds(500, 100, 100, 25);
		frame.add(jtxtfKilogram);
		
		JLabel jlblGallon = new JLabel("Gallon:");
		jlblGallon.setBounds(100, 150, 80, 25);
		frame.add(jlblGallon);
		
		JTextField jtxtfGallon = new JTextField();
		jtxtfGallon.setBounds(200, 150, 100, 25);
		frame.add(jtxtfGallon);
		
		JLabel jlblLiters = new JLabel("Liters:");
		jlblLiters.setBounds(400, 150, 80, 25);
		frame.add(jlblLiters);
		
		JTextField jtxtfLiters = new JTextField();
		jtxtfLiters.setBounds(500, 150, 100, 25);
		frame.add(jtxtfLiters);
		
		JLabel jlblFahrenheit = new JLabel("Fahrenheit:");
		jlblFahrenheit.setBounds(100, 200, 80, 25);
		frame.add(jlblFahrenheit);
		
		JTextField jtxtfFahrenheit = new JTextField();
		jtxtfFahrenheit.setBounds(200, 200, 100, 25);
		frame.add(jtxtfFahrenheit);
		
		JLabel jlblCentigrade = new JLabel("Centigrade:");
		jlblCentigrade.setBounds(400, 200, 80, 25);
		frame.add(jlblCentigrade);
		
		JTextField jtxtfCentigrade = new JTextField();
		jtxtfCentigrade.setBounds(500, 200, 100, 25);
		frame.add(jtxtfCentigrade);
		
		
		//Button
		JButton jbtnRemoveLetter = new JButton("Convert");
		jbtnRemoveLetter.setBounds(300,250,80,25);
		frame.add(jbtnRemoveLetter);
		jbtnRemoveLetter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(jtxtfMile.getText() != null || jtxtfMile.getText().equals(""))
				{
					double r = 0;
					r = Double.parseDouble(jtxtfMile.getText())*1.60934;
					jtxtfKilometer.setText(String.valueOf(r));
				}
				
				if(jtxtfPound.getText() != null || jtxtfPound.getText().equals(""))
				{
					double r = 0;
					r = Double.parseDouble(jtxtfPound.getText())*0.45359237;
					jtxtfKilogram.setText(String.valueOf(r));
					
				}
				
				if(jtxtfGallon.getText() != null || jtxtfGallon.getText().equals(""))
				{
					double r = 0;
					r = Double.parseDouble(jtxtfGallon.getText())*3.7854118;
					jtxtfLiters.setText(String.valueOf(r));
					
				}
				
				if(jtxtfFahrenheit.getText() != null || jtxtfFahrenheit.getText().equals(""))
				{
					double r = 0;
					r = (Double.parseDouble(jtxtfFahrenheit.getText()) - 32 )/1.8;
					jtxtfCentigrade.setText(String.valueOf(r));
					
				}
				
			}
		});
	}
	
	
}
