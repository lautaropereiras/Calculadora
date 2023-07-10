import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;


public class Vectores 
{

	private JFrame frame;
	private JTextField IngresarTamaño1;
	private JTextArea ImprimirVector1;
	private JTextField IngresarTamaño2;
	private JTextArea Resultado;
	private int[] vector;
	private int[] vector1;


	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Vectores window = new Vectores();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
		);
	}

	public Vectores() 
	{
		initialize();
	}

	private void initialize() 
	{
		frame = new JFrame();
		
		frame.setBounds(100, 100, 525, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		JLabel TextoTamanoVector1 = new JLabel("Tamaño vector 1:");
		TextoTamanoVector1.setBackground(new Color(255, 0, 255));
		TextoTamanoVector1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		TextoTamanoVector1.setBounds(80, 22, 124, 14);
		frame.getContentPane().add(TextoTamanoVector1);
		
		IngresarTamaño1 = new JTextField();
		IngresarTamaño1.setBounds(179, 47, 26, 20);
		frame.getContentPane().add(IngresarTamaño1);
		IngresarTamaño1.setColumns(10);
		
		JButton BotonGenerarVector1 = new JButton("Crear");
		BotonGenerarVector1.setBackground(new Color(255, 255, 255));
		BotonGenerarVector1.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		BotonGenerarVector1.addActionListener(new ActionListener() 
		
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				int tamano = Integer.parseInt(IngresarTamaño1.getText()); 
				vector = new int[tamano]; 
			
				for (int i = 0; i < tamano; i++) 
				{
				    String inputValue = JOptionPane.showInputDialog("Ingrese el valor de la posicion " + i + ":");
				    int value = Integer.parseInt(inputValue);
				    vector[i] = value;
				}
				String vectorText = "";
				for (int i = 0; i < tamano; i++) 
				{
				    vectorText += i + ") " + vector[i] + "\n";
				}
				ImprimirVector1.setText(vectorText);
			}
		});
		BotonGenerarVector1.setBounds(80, 47, 89, 23);
		frame.getContentPane().add(BotonGenerarVector1);
		
		ImprimirVector1 = new JTextArea();
		ImprimirVector1.setEditable(false);
		ImprimirVector1.setBounds(80, 78, 125, 69);
		frame.getContentPane().add(ImprimirVector1);
		
		JTextArea ImprimirVector2 = new JTextArea();
		ImprimirVector2.setEditable(false);
		ImprimirVector2.setBounds(342, 78, 125, 69);
		frame.getContentPane().add(ImprimirVector2);
		
		IngresarTamaño2 = new JTextField();
		IngresarTamaño2.setColumns(10);
		IngresarTamaño2.setBounds(441, 45, 26, 22);
		frame.getContentPane().add(IngresarTamaño2);
		
		JLabel lblTamaoVector = new JLabel("Tamaño vector 2:");
		lblTamaoVector.setBackground(new Color(255, 0, 255));
		lblTamaoVector.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblTamaoVector.setBounds(342, 22, 124, 14);
		frame.getContentPane().add(lblTamaoVector);
		
		JButton BotonGenerarVector2 = new JButton("Crear");
		BotonGenerarVector2.setBackground(new Color(255, 255, 255));
		BotonGenerarVector2.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		BotonGenerarVector2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int tamano = Integer.parseInt(IngresarTamaño2.getText()); 
				vector1 = new int[tamano]; 
			
				for (int i = 0; i < tamano; i++) 
				{
				    String inputValue = JOptionPane.showInputDialog("Ingrese el valor de la posicion " + i + ":");
				    int value = Integer.parseInt(inputValue);
				    vector1[i] = value;
				}
				String vectorText = "";
				for (int i = 0; i < tamano; i++) 
				{
				    vectorText += i + ") " + vector1[i] + "\n";
				}
				ImprimirVector2.setText(vectorText);
			}
		});
		BotonGenerarVector2.setBounds(342, 44, 89, 23);
		frame.getContentPane().add(BotonGenerarVector2);
		
		JButton BotonSumar = new JButton("Suma");
		BotonSumar.setBackground(new Color(255, 255, 255));
		BotonSumar.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		BotonSumar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (vector != null && vector1 != null) 
				{
	            
		            if (vector.length != vector1.length) 
		            {
		                JOptionPane.showMessageDialog(frame, "Los vectores tienen que tener el mismo largo", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            
		            int[] resultado = new int[vector.length];
		            
		            for (int i = 0; i < vector.length; i++) 
		            {
		                resultado[i] = vector[i] + vector1[i];
		            }
		            
		            String resultadoText = "";
		            for (int i = 0; i < resultado.length; i++) 
		            {
		                resultadoText += i + ") " + resultado[i] + "\n";
		            }
		            Resultado.setText(resultadoText);
		        } 
				else 
		        {
		            JOptionPane.showMessageDialog(frame, "Se deben generar los vectores", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		BotonSumar.setBounds(10, 228, 89, 37);
		frame.getContentPane().add(BotonSumar);
		
		JButton BotonRestar = new JButton("Resta");
		BotonRestar.setBackground(new Color(255, 255, 255));
		BotonRestar.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		BotonRestar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (vector != null && vector1 != null) 
				{
		            
		            if (vector.length != vector1.length) 
		            {
		                JOptionPane.showMessageDialog(frame, "Los vectores tienen que tener el mismo largo", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            
		            int[] resultado = new int[vector.length];
		            
		            for (int i = 0; i < vector.length; i++) 
		            {
		                resultado[i] = vector[i] - vector1[i];
		            }
		            
		            String resultadoText = "";
		            for (int i = 0; i < resultado.length; i++) 
		            {
		                resultadoText += i + ") " + resultado[i] + "\n";
		            }
		            Resultado.setText(resultadoText);
		        } 
				else 
		        {
		            JOptionPane.showMessageDialog(frame, "Se deben generar los vectores", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
			}
		});
		BotonRestar.setBounds(109, 228, 89, 37);
		frame.getContentPane().add(BotonRestar);
		
		JButton BotonMultiplicarPorEscalar = new JButton("Multiplicacion");
		BotonMultiplicarPorEscalar.setBackground(new Color(255, 255, 255));
		BotonMultiplicarPorEscalar.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		BotonMultiplicarPorEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String escalarInput = JOptionPane.showInputDialog("Ingrese su escalar:");
				int escalar = Integer.parseInt(escalarInput);

				int[] resultado = new int[vector.length];

				for (int i = 0; i < vector.length; i++) 
				{
				    resultado[i] = vector[i] * escalar;
				}

				String resultadoText = "";
				for (int i = 0; i < resultado.length; i++) 
				{
				    resultadoText += i + ") " + resultado[i] + "\n";
				}

				Resultado.setText(resultadoText);
				
			}
		});
		BotonMultiplicarPorEscalar.setBounds(208, 228, 89, 37);
		frame.getContentPane().add(BotonMultiplicarPorEscalar);
		
		JButton BotoneEscalar = new JButton("Prod. Escalar");
		BotoneEscalar.setBackground(new Color(255, 255, 255));
		BotoneEscalar.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		BotoneEscalar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (vector != null && vector1 != null) 
				{
				    if (vector.length != vector1.length) 
				    {
				        JOptionPane.showMessageDialog(frame, "Los vectores tienen que tener el mismo largo", "Error", JOptionPane.ERROR_MESSAGE);
				        return;
				    }
				    
				    int productoEscalar = 0;
				    
				    for (int i = 0; i < vector.length; i++) 
				    {
				        productoEscalar += vector[i] * vector1[i];
				    }
				    
				    Resultado.setText(String.valueOf(productoEscalar));
				} 
				else 
				{
				    JOptionPane.showMessageDialog(frame, "Se deben generar los vectores", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		BotoneEscalar.setBounds(307, 228, 89, 37);
		frame.getContentPane().add(BotoneEscalar);
		
		JButton BotonVectorial = new JButton("Prod. Vectorial");
		BotonVectorial.setBackground(new Color(255, 255, 255));
		BotonVectorial.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		BotonVectorial.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (vector != null && vector1 != null) 
				{
				    if (vector.length != 3 || vector1.length != 3) 
				    {
				        JOptionPane.showMessageDialog(frame, "Los vectores tienen que tener 3 dimensiones", "Error", JOptionPane.ERROR_MESSAGE);
				        return;
				    }
				    
				    int[] vector2 = new int[3];
				    
				    vector2[0] = (vector[1] * vector1[2]) - (vector[2] * vector1[1]);
				    vector2[1] = (vector[2] * vector1[0]) - (vector[0] * vector1[2]);
				    vector2[2] = (vector[0] * vector1[1]) - (vector[1] * vector1[0]);
				    
				    
				    String vectorText = "";
				    for (int i = 0; i < vector2.length; i++) 
				    {
				        vectorText += i + ")  " + vector2[i] + "\n";
				    }
				    
				    Resultado.setText(vectorText);
				} 
				else 
				{
				    JOptionPane.showMessageDialog(frame, "Se deben generar los vectores", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		BotonVectorial.setBounds(402, 228, 89, 37);
		frame.getContentPane().add(BotonVectorial);
		
		Resultado = new JTextArea();
		Resultado.setEditable(false);
		Resultado.setBounds(80, 158, 385, 59);
		frame.getContentPane().add(Resultado);
		
		JLabel TextoResultado = new JLabel("Resultado:");
		TextoResultado.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		TextoResultado.setBounds(10, 183, 71, 14);
		frame.getContentPane().add(TextoResultado);
		
		JLabel lblNewLabel = new JLabel("Menu Vectores");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblNewLabel.setBounds(222, 107, 99, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calcu newframe = new Calcu();
				
				newframe.setVisible(true);
				
				this.dispose();
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(0, 0, 115, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
	}

	
}
