import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;

@SuppressWarnings("unused")
public class matrices2_2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_10;
	
	private JLabel res1;
	private JLabel res2;
	private JLabel res3;
	private JLabel res4;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton_3;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matrices2_2 window = new matrices2_2();
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
	public matrices2_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(35, 170, 34, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 170, 34, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(35, 201, 34, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(79, 201, 34, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(304, 170, 34, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(347, 170, 34, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(347, 201, 34, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(304, 201, 34, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("Determinante");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int det;
				int num1;
				num1=Integer.parseInt(textField.getText());
				int num2;
				num2=Integer.parseInt(textField_1.getText());
				int num3;
				num3=Integer.parseInt(textField_2.getText());
				int num4;
				num4=Integer.parseInt(textField_3.getText());
				
				int resu1, resu2;
				
				resu1=num1*num4;
				resu2=num2*num3;
				
				det=resu1-resu2;
				
				
				res1.setText(""+det);
		
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setBounds(35, 280, 122, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Determinante");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int det2;
				int num9;
				num9=Integer.parseInt(textField_8.getText());
				int num10;
				num10=Integer.parseInt(textField_9.getText());
				int num11;
				num11=Integer.parseInt(textField_10.getText());
				int num12;
				num12=Integer.parseInt(textField_11.getText());
				
				int resu1, resu2;
				
				resu1=num9*num12;
				resu2=num10*num11;
				
				det2=resu1-resu2;
				
				
				res1.setText(""+det2);
				
			}
		});
		btnNewButton_1.setBounds(277, 280, 122, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Inversa");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    double num1 = Double.parseDouble(textField.getText());
			        double num2 = Double.parseDouble(textField_1.getText());
			        double num3 = Double.parseDouble(textField_2.getText());
			        double num4 = Double.parseDouble(textField_3.getText());
			        
			    	double resu1=num1*num4;
					double resu2=num2*num3;
					
					double det=resu1-resu2;
			        
			        if (det == 0) {
			            JOptionPane.showMessageDialog(frame, "La matriz no tiene inversa");
			            return;
			        }

			        double invDet = 1 / det;

			        double inv = num4 * invDet;
			        double inv2 = -num2 * invDet;
			        double inv3 = -num3 * invDet;
			        double inv4 = num1  * invDet;

			        res1.setText(String.format("%.2f", inv));
			        res2.setText(String.format("%.2f", inv2));
			        res3.setText(String.format("%.2f", inv3));
			        res4.setText(String.format("%.2f", inv4));
						
				
			}
		});
		
		btnNewButton_2.setBounds(35, 314, 122, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("A + B");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		int num1;
			num1=Integer.parseInt(textField.getText());
			int num2;
			num2=Integer.parseInt(textField_1.getText());
			int num3;
			num3=Integer.parseInt(textField_2.getText());
			int num4;
			num4=Integer.parseInt(textField_3.getText());
		
			int num9;
			num9=Integer.parseInt(textField_8.getText());
			int num10;
			num10=Integer.parseInt(textField_9.getText());
			int num11;
			num11=Integer.parseInt(textField_10.getText());
			int num12;
			num12=Integer.parseInt(textField_11.getText());
			
			
			
			int resu1, resu2, resu3, resu4;
			resu1=num1+num9;		
			resu2=num2+num10;
			resu3=num3+num11;
			resu4=num4+num12;
			

			res1.setText(""+resu1);
			res2.setText(""+resu2);
			res3.setText(""+resu3);
			res4.setText(""+resu4);
		

			}
		});
		btnNewButton_4.setBounds(167, 169, 100, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("A - B");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				num1=Integer.parseInt(textField.getText());
				int num2;
				num2=Integer.parseInt(textField_1.getText());
				int num3;
				num3=Integer.parseInt(textField_2.getText());
				int num4;
				num4=Integer.parseInt(textField_3.getText());
			
				int num9;
				num9=Integer.parseInt(textField_8.getText());
				int num10;
				num10=Integer.parseInt(textField_9.getText());
				int num11;
				num11=Integer.parseInt(textField_10.getText());
				int num12;
				num12=Integer.parseInt(textField_11.getText());
				
				
				
				int resu1, resu2, resu3, resu4;
				resu1=num1-num9;		
				resu2=num2-num10;
				resu3=num3-num11;
				resu4=num4-num12;
				

				res1.setText(""+resu1);
				res2.setText(""+resu2);
				res3.setText(""+resu3);
				res4.setText(""+resu4);
			}
		});
		btnNewButton_5.setBounds(167, 200, 100, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("A * B");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
		        double num2 = Double.parseDouble(textField_1.getText());
		        double num3 = Double.parseDouble(textField_2.getText());
		        double num4 = Double.parseDouble(textField_3.getText());
		        
		        double num9 = Double.parseDouble(textField_8.getText());
		        double num10 = Double.parseDouble(textField_9.getText());
		        double num11 = Double.parseDouble(textField_10.getText());
		        double num12 = Double.parseDouble(textField_11.getText());
		       

		        double resu1 = num1 * num9 + num2 * num11;
		        double resu2 = num1 * num10 + num2 * num12 ;
		        
		        
		        double resu3 = num3 * num9 + num4 * num11;
		        double resu4 = num3 * num10 + num4 * num12;

		        res1.setText(String.format("%.2f", resu1));
		        res2.setText(String.format("%.2f", resu2));
		        res3.setText(String.format("%.2f", resu3));
		        res4.setText(String.format("%.2f", resu4));
			}
		});
		btnNewButton_6.setBounds(167, 231, 100, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_2_1 = new JButton("Inversa");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num9 = Double.parseDouble(textField_8.getText());
		        double num10 = Double.parseDouble(textField_9.getText());
		        double num11 = Double.parseDouble(textField_10.getText());
		        double num12 = Double.parseDouble(textField_11.getText());
		        
		    	double resu1=num9*num12;
				double resu2=num10*num11;
				
				double det2=resu1-resu2;
		        
		        if (det2 == 0) {
		            JOptionPane.showMessageDialog(frame, "La matriz no tiene inversa");
		            return;
		        }

		        double invDet2 = 1 / det2;

		        double inv = num12 * invDet2;
		        double inv2 = -num10 * invDet2;
		        double inv3 = -num11 * invDet2;
		        double inv4 = num9  * invDet2;

		        res1.setText(String.format("%.2f", inv));
		        res2.setText(String.format("%.2f", inv2));
		        res3.setText(String.format("%.2f", inv3));
		        res4.setText(String.format("%.2f", inv4));
				
				
				
			}
		});
		btnNewButton_2_1.setBounds(277, 314, 122, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Multiplicar por");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numescalar2;
				numescalar2=Integer.parseInt(textField_5.getText());
				
				int num9;
				num9=Integer.parseInt(textField_8.getText());
				int num10;
				num10=Integer.parseInt(textField_9.getText());
				int num11;
				num11=Integer.parseInt(textField_10.getText());
				int num12;
				num12=Integer.parseInt(textField_11.getText());
				
				
				int resu1, resu2, resu3, resu4;
				resu1=num9*numescalar2;		
				resu2=num10*numescalar2;
				resu3=num11*numescalar2;
				resu4=num12*numescalar2;
				

				res1.setText(""+resu1);
				res2.setText(""+resu2);
				res3.setText(""+resu3);
				res4.setText(""+resu4);
				
				
			}
		});
		btnNewButton_2_2.setBounds(277, 348, 122, 23);
		frame.getContentPane().add(btnNewButton_2_2);
		
	
		
		JButton btnNewButton_2_2_1 = new JButton("Multiplicar por");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numescalar1;
				numescalar1=Integer.parseInt(textField_4.getText());
				
				int num1;
				num1=Integer.parseInt(textField.getText());
				int num2;
				num2=Integer.parseInt(textField_1.getText());
				int num3;
				num3=Integer.parseInt(textField_2.getText());
				int num4;
				num4=Integer.parseInt(textField_3.getText());
				
				
				int resu1, resu2, resu3, resu4;
				resu1=num1*numescalar1;		
				resu2=num2*numescalar1;
				resu3=num3*numescalar1;
				resu4=num4*numescalar1;
				

				res1.setText(""+resu1);
				res2.setText(""+resu2);
				res3.setText(""+resu3);
				res4.setText(""+resu4);
				
			
			}
		});
		btnNewButton_2_2_1.setBounds(35, 348, 122, 23);
		frame.getContentPane().add(btnNewButton_2_2_1);
		

		
		JTextPane txtpnMatrizA = new JTextPane();
		txtpnMatrizA.setEditable(false);
		txtpnMatrizA.setText("       Matriz A");
		txtpnMatrizA.setBounds(35, 139, 87, 20);
		frame.getContentPane().add(txtpnMatrizA);
		
		JTextPane txtpnMatrizB = new JTextPane();
		txtpnMatrizB.setEditable(false);
		txtpnMatrizB.setText("       Matriz B");
		txtpnMatrizB.setBounds(304, 139, 87, 20);
		frame.getContentPane().add(txtpnMatrizB);
		
		JButton btnNewButton_2_2_1_1 = new JButton("Division AxB");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    double num1 = Double.parseDouble(textField.getText());
		        double num2 = Double.parseDouble(textField_1.getText());
		        double num3 = Double.parseDouble(textField_2.getText());
		        double num4 = Double.parseDouble(textField_3.getText());
		    	double num9 = Double.parseDouble(textField_8.getText());
		        double num10 = Double.parseDouble(textField_9.getText());
		        double num11 = Double.parseDouble(textField_10.getText());
		        double num12 = Double.parseDouble(textField_11.getText());
		    	double resu1=num1*num4;
				double resu2=num2*num3;
				
				double det=resu1-resu2;
		        
		        if (det == 0) {
		            JOptionPane.showMessageDialog(frame, "La matriz no tiene inversa");
		            return;
		        }

		        double invDet = 1 / det;

		        double inv = num4 * invDet;
		        double inv2 = -num2 * invDet;
		        double inv3 = -num3 * invDet;
		        double inv4 = num1  * invDet;
		        
		        double div1 = inv * num9 + inv2 * num11;
		        double div2 = inv * num10 + inv2 * num12;
		        double div3 = inv3 * num9 + inv4 * num11;
		        double div4 = inv3 * num10 + inv4 * num12;


		        res1.setText(String.format("%.2f", div1));
		        res2.setText(String.format("%.2f", div2));
		        res3.setText(String.format("%.2f", div3));
		        res4.setText(String.format("%.2f", div4));
			
				
			}
		});
		btnNewButton_2_2_1_1.setBounds(35, 382, 122, 23);
		frame.getContentPane().add(btnNewButton_2_2_1_1);
		
		JButton btnNewButton_2_2_1_2 = new JButton("Division BxA");
		btnNewButton_2_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double num1 = Double.parseDouble(textField.getText());
			        double num2 = Double.parseDouble(textField_1.getText());
			        double num3 = Double.parseDouble(textField_2.getText());
			        double num4 = Double.parseDouble(textField_3.getText());
			    	double num9 = Double.parseDouble(textField_8.getText());
			        double num10 = Double.parseDouble(textField_9.getText());
			        double num11 = Double.parseDouble(textField_10.getText());
			        double num12 = Double.parseDouble(textField_11.getText());
			    	
					
					double resu1=num9*num12;
					double resu2=num10*num11;
					
					double det2=resu1-resu2;
			        
			        if (det2 == 0) {
			            JOptionPane.showMessageDialog(frame, "La matriz no tiene inversa");
			            return;
			        }

			        double invDet2 = 1 / det2;

			        double inv = num12 * invDet2;
			        double inv2 = -num10 * invDet2;
			        double inv3 = -num11 * invDet2;
			        double inv4 = num9  * invDet2;
			        
			        double div1 = inv * num1 + inv2 * num3;
			        double div2 = inv * num2 + inv2 * num4;
			        double div3 = inv3 * num1 + inv4 * num3;
			        double div4 = inv3 * num2 + inv4 * num4;


			        res1.setText(String.format("%.2f", div1));
			        res2.setText(String.format("%.2f", div2));
			        res3.setText(String.format("%.2f", div3));
			        res4.setText(String.format("%.2f", div4));
				
				
				
			}
		});
		btnNewButton_2_2_1_2.setBounds(277, 382, 122, 23);
		frame.getContentPane().add(btnNewButton_2_2_1_2);
		
		

		
		
		
		
		
		res1 = new JLabel("");
		res1.setBounds(161, 33, 51, 20);
		frame.getContentPane().add(res1);
		
	    res2 = new JLabel("");
		res2.setBounds(233, 33, 51, 20);
		frame.getContentPane().add(res2);
		
	    res3 = new JLabel("");
		res3.setBounds(161, 64, 51, 20);
		frame.getContentPane().add(res3);
		
		res4 = new JLabel("");
		res4.setBounds(233, 64, 51, 20);
		frame.getContentPane().add(res4);
		
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(163, 349, 24, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(409, 349, 24, 20);
		frame.getContentPane().add(textField_5);
		
		
		 JButton resetButton = new JButton("Reiniciar");
	        resetButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                resetFields();
	            }
	        });
	        resetButton.setBounds(167, 382, 100, 23);
	        frame.getContentPane().add(resetButton);
	        
	        btnNewButton_3 = new JButton("Atras");
	        btnNewButton_3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	            	Menumatrices newframe = new Menumatrices();
	            	newframe.setVisible(true);
					this.dispose();
	            
	            }

				private void dispose() {
					frame.setVisible(false);

				}
	        });
	        btnNewButton_3.setBounds(10, 11, 100, 23);
	        frame.getContentPane().add(btnNewButton_3);
	    }

	  
	    private void resetFields() {
	        textField.setText("");
	        textField_1.setText("");
	        textField_2.setText("");
	        textField_3.setText("");
	        textField_8.setText("");
	        textField_9.setText("");
	        textField_11.setText("");
	        textField_10.setText("");
	        textField_4.setText("");
	        textField_5.setText("");
	        res1.setText("");
	        res2.setText("");
	        res3.setText("");
	        res4.setText("");
	    
}

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			frame.setVisible(true);
		}
}