import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calcu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel resultado1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcu window = new Calcu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 439, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(25, 168, 238, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(25, 276, 238, 57);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		resultado1 = new JLabel();
		resultado1.setForeground(new Color(255, 255, 255));
		resultado1.setBackground(new Color(255, 255, 255));
		resultado1.setBounds(6,5,410,90);
		frame.getContentPane().add(resultado1);
		
		JButton btnNewButton_1 = new JButton("Vectores");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(53, 100, 75, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Vectores newframe = new Vectores();
				
				newframe.setVisible(true);
				
				this.dispose();
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				
			}
		});
			
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Matrices");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(171, 100, 73, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menumatrices newframe = new Menumatrices();
				
				newframe.setVisible(true);
				
				this.dispose();
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				
			}
				
			
		});
		
		JButton btnNewButton_3 = new JButton("Ecuaciones");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(274, 100, 85, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menuecuaciones newframe = new Menuecuaciones();
				
				newframe.setVisible(true);
				
				this.dispose();
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				
			}
		});
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("X");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				int num2;
				
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				
				 int resultado=num1*num2;
				 
				 resultado1.setText(""+resultado);
				 resultado1.setVisible(false);
				 
			}
		});
		btnNewButton_4.setBounds(357, 134, 51, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("/");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				int num2;
				
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				
				 int resultado=num1/num2;
				 
				 resultado1.setText(""+resultado);
				 resultado1.setVisible(false);
				 
			}
		});
		btnNewButton_5.setBounds(296, 134, 51, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				int num2;
				
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				
				 int resultado=num1+num2;
				 
				 resultado1.setText(""+resultado);
				 
				 resultado1.setVisible(false); 
				 
				 
				 
			}
		});
		btnNewButton_6.setBounds(296, 168, 51, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("=");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setBounds(357, 253, 51, 23);
		frame.getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				 resultado1.setVisible(true); 
			}
		});
	
		
		JButton btnNewButton_8 = new JButton("-");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				int num2;
				
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				
				 int resultado=num1-num2;
				 
				 resultado1.setText(""+resultado);
				 
				 resultado1.setVisible(false);
				 
				 
			}
		});
		btnNewButton_8.setBounds(357, 168, 51, 23);
		
		frame.getContentPane().add(btnNewButton_8);
		JButton btnNewButton_9 = new JButton("CE");
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 textField.setText(null);
				 textField_1.setText(null);
				 
			}
		});
		
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				int num2;
				
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				
				 int resultado=num1-num2;
				 
				 resultado1.setText(""+resultado);
				 
				 
			}
		});
		btnNewButton_9.setBounds(296, 253, 51, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("x^");
		btnNewButton_10.setBackground(new Color(255, 255, 255));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1;
				double num2;
				
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				
				 double resultado=Math.pow(num1, num2);
				 
				 resultado1.setText(""+resultado);
				 resultado1.setVisible(false);
			}
		});
		btnNewButton_10.setBounds(296, 202, 51, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("√ ");
		btnNewButton_11.setBackground(new Color(255, 255, 255));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1;
				double num2;
				
				num1=Integer.parseInt(textField.getText());
				num2=Integer.parseInt(textField_1.getText());
				
				 double resultado=Math.pow(num2, 1/num1);
				 
				 resultado1.setText(""+resultado);
				 resultado1.setVisible(false);
			}
		});
		btnNewButton_11.setBounds(357, 202, 51, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JLabel lblNewLabel = new JLabel("      Potencias / Raices / Numero 1");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(63, 131, 181, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("                      Numero 2");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(53, 236, 191, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				frame.setVisible(false);
				
				
				
				
			}

			
		});
	
		btnNewButton.setBounds(296, 290, 112, 28);
		frame.getContentPane().add(btnNewButton);
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		 
		frame.setVisible(true);
	}
}
