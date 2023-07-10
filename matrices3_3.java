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
public class matrices3_3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel res1;
	private JLabel res2;
	private JLabel res3;
	private JLabel res4;
	private JLabel res5;
	private JLabel res6;
	private JLabel res7;
	private JLabel res8;
	private JLabel res9;
	private JButton btnNewButton_3;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					matrices3_3 window = new matrices3_3();
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
	public matrices3_3() {
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
		textField_2.setBounds(123, 170, 34, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(35, 201, 34, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(79, 201, 34, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(123, 201, 34, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(35, 232, 34, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(79, 232, 34, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(123, 232, 34, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(277, 170, 34, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(365, 170, 34, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(321, 170, 34, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(277, 201, 34, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(321, 201, 34, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(365, 201, 34, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(277, 232, 34, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(321, 232, 34, 20);
		frame.getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(365, 232, 34, 20);
		frame.getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
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
				int num5;
				num5=Integer.parseInt(textField_4.getText());
				int num6;
				num6=Integer.parseInt(textField_5.getText());
				int num7;
				num7=Integer.parseInt(textField_6.getText());
				int num8;
				num8=Integer.parseInt(textField_7.getText());
				int num9;
				num9=Integer.parseInt(textField_8.getText());
				
				int resu1, resu2, resu3, resu4, resu5, resu6;
				
				resu1=num1*num5*num9;
				resu2=num4*num8*num3;
				resu3=num2*num6*num7;
				resu4=num3*num5*num7;
				resu5=num2*num4*num9;
				resu6=num6*num8*num1;
				
				det=resu1+resu2+resu3-resu4-resu5-resu6;
				
				
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
				int num10;
				num10=Integer.parseInt(textField_9.getText());
				int num11;
				num11=Integer.parseInt(textField_10.getText());
				int num12;
				num12=Integer.parseInt(textField_11.getText());
				int num13;
				num13=Integer.parseInt(textField_12.getText());
				int num14;
				num14=Integer.parseInt(textField_13.getText());
				int num15;
				num15=Integer.parseInt(textField_14.getText());
				int num16;
				num16=Integer.parseInt(textField_15.getText());
				int num17;
				num17=Integer.parseInt(textField_16.getText());
				int num18;
				num18=Integer.parseInt(textField_17.getText());
				
				int resu1, resu2, resu3, resu4, resu5, resu6;
				
				resu1=num10*num14*num18;
				resu2=num13*num17*num12;
				resu3=num11*num15*num16;
				resu4=num12*num14*num16;
				resu5=num11*num13*num18;
				resu6=num15*num17*num10;
				
				det2=resu1+resu2+resu3-resu4-resu5-resu6;
				
				
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
			        double num5 = Double.parseDouble(textField_4.getText());
			        double num6 = Double.parseDouble(textField_5.getText());
			        double num7 = Double.parseDouble(textField_6.getText());
			        double num8 = Double.parseDouble(textField_7.getText());
			        double num9 = Double.parseDouble(textField_8.getText());

			  
			        double det = num1 * (num5 * num9 - num6 * num8)
			                - num2 * (num4 * num9 - num6 * num7)
			                + num3 * (num4 * num8 - num5 * num7);
			        
			        if (det == 0) {
			            JOptionPane.showMessageDialog(frame, "La matriz no tiene inversa");
			            return;
			        }

			        double invDet = 1 / det;

			        double resu1 = (num5 * num9 - num6 * num8) * invDet;
			        double resu2 = -(num2 * num9 - num3 * num8) * invDet;
			        double resu3 = (num2 * num6 - num3 * num5) * invDet;
			        double resu4 = -(num4 * num9 - num6 * num7) * invDet;
			        double resu5 = (num1 * num9 - num3 * num7) * invDet;
			        double resu6 = -(num1 * num6 - num3 * num4) * invDet;
			        double resu7 = (num4 * num8 - num5 * num7) * invDet;
			        double resu8 = -(num1 * num8 - num2 * num7) * invDet;
			        double resu9 = (num1 * num5 - num2 * num4) * invDet;

			        res1.setText(String.format("%.2f", resu1));
			        res2.setText(String.format("%.2f", resu2));
			        res3.setText(String.format("%.2f", resu3));
			        res4.setText(String.format("%.2f", resu4));
			        res5.setText(String.format("%.2f", resu5));
			        res6.setText(String.format("%.2f", resu6));
			        res7.setText(String.format("%.2f", resu7));
			        res8.setText(String.format("%.2f", resu8));
			        res9.setText(String.format("%.2f", resu9));
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
			int num5;
			num5=Integer.parseInt(textField_4.getText());
			int num6;
			num6=Integer.parseInt(textField_5.getText());
			int num7;
			num7=Integer.parseInt(textField_6.getText());
			int num8;
			num8=Integer.parseInt(textField_7.getText());
			int num9;
			num9=Integer.parseInt(textField_8.getText());
			int num10;
			num10=Integer.parseInt(textField_9.getText());
			int num11;
			num11=Integer.parseInt(textField_10.getText());
			int num12;
			num12=Integer.parseInt(textField_11.getText());
			int num13;
			num13=Integer.parseInt(textField_12.getText());
			int num14;
			num14=Integer.parseInt(textField_13.getText());
			int num15;
			num15=Integer.parseInt(textField_14.getText());
			int num16;
			num16=Integer.parseInt(textField_15.getText());
			int num17;
			num17=Integer.parseInt(textField_16.getText());	
			int num18;
			num18=Integer.parseInt(textField_17.getText());
			
			int resu1, resu2, resu3, resu4, resu5, resu6, resu7, resu8, resu9;
			resu1=num1+num10;		
			resu2=num2+num11;
			resu3=num3+num12;
			resu4=num4+num13;
			resu5=num5+num14;
			resu6=num6+num15;
			resu7=num7+num16;
			resu8=num8+num17;
			resu9=num9+num18;

			res1.setText(""+resu1);
			res2.setText(""+resu2);
			res3.setText(""+resu3);
			res4.setText(""+resu4);
			res5.setText(""+resu5);
			res6.setText(""+resu6);
			res7.setText(""+resu7);
			res8.setText(""+resu8);
			res9.setText(""+resu9);

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
				int num5;
				num5=Integer.parseInt(textField_4.getText());
				int num6;
				num6=Integer.parseInt(textField_5.getText());
				int num7;
				num7=Integer.parseInt(textField_6.getText());
				int num8;
				num8=Integer.parseInt(textField_7.getText());
				int num9;
				num9=Integer.parseInt(textField_8.getText());
				int num10;
				num10=Integer.parseInt(textField_9.getText());
				int num11;
				num11=Integer.parseInt(textField_10.getText());
				int num12;
				num12=Integer.parseInt(textField_11.getText());
				int num13;
				num13=Integer.parseInt(textField_12.getText());
				int num14;
				num14=Integer.parseInt(textField_13.getText());
				int num15;
				num15=Integer.parseInt(textField_14.getText());
				int num16;
				num16=Integer.parseInt(textField_15.getText());
				int num17;
				num17=Integer.parseInt(textField_16.getText());	
				int num18;
				num18=Integer.parseInt(textField_17.getText());
				
				int resu1, resu2, resu3, resu4, resu5, resu6, resu7, resu8, resu9;
				resu1=num1-num10;		
				resu2=num2-num11;
				resu3=num3-num12;
				resu4=num4-num13;
				resu5=num5-num14;
				resu6=num6-num15;
				resu7=num7-num16;
				resu8=num8-num17;
				resu9=num9-num18;

				res1.setText(""+resu1);
				res2.setText(""+resu2);
				res3.setText(""+resu3);
				res4.setText(""+resu4);
				res5.setText(""+resu5);
				res6.setText(""+resu6);
				res7.setText(""+resu7);
				res8.setText(""+resu8);
				res9.setText(""+resu9);
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
		        double num5 = Double.parseDouble(textField_4.getText());
		        double num6 = Double.parseDouble(textField_5.getText());
		        double num7 = Double.parseDouble(textField_6.getText());
		        double num8 = Double.parseDouble(textField_7.getText());
		        double num9 = Double.parseDouble(textField_8.getText());

		        double num10 = Double.parseDouble(textField_9.getText());
		        double num11 = Double.parseDouble(textField_10.getText());
		        double num12 = Double.parseDouble(textField_11.getText());
		        double num13 = Double.parseDouble(textField_12.getText());
		        double num14 = Double.parseDouble(textField_13.getText());
		        double num15 = Double.parseDouble(textField_14.getText());
		        double num16 = Double.parseDouble(textField_15.getText());
		        double num17 = Double.parseDouble(textField_16.getText());
		        double num18 = Double.parseDouble(textField_17.getText());

		        double resu1 = num1 * num10 + num2 * num13 + num3 * num16;
		        double resu2 = num1 * num11 + num2 * num14 + num3 * num17;
		        double resu3 = num1 * num12 + num2 * num15 + num3 * num18;

		        double resu4 = num4 * num10 + num5 * num13 + num6 * num16;
		        double resu5 = num4 * num11 + num5 * num14 + num6 * num17;
		        double resu6 = num4 * num12 + num5 * num15 + num6 * num18;

		        double resu7 = num7 * num10 + num8 * num13 + num9 * num16;
		        double resu8 = num7 * num11 + num8 * num14 + num9 * num17;
		        double resu9 = num7 * num12 + num8 * num15 + num9 * num18;

		        res1.setText(String.format("%.2f", resu1));
		        res2.setText(String.format("%.2f", resu2));
		        res3.setText(String.format("%.2f", resu3));
		        res4.setText(String.format("%.2f", resu4));
		        res5.setText(String.format("%.2f", resu5));
		        res6.setText(String.format("%.2f", resu6));
		        res7.setText(String.format("%.2f", resu7));
		        res8.setText(String.format("%.2f", resu8));
		        res9.setText(String.format("%.2f", resu9));
			}
		});
		btnNewButton_6.setBounds(167, 231, 100, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_2_1 = new JButton("Inversa");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double num10 = Double.parseDouble(textField_9.getText());
			        double num11 = Double.parseDouble(textField_10.getText());
			        double num12 = Double.parseDouble(textField_11.getText());
			        double num13 = Double.parseDouble(textField_12.getText());
			        double num14 = Double.parseDouble(textField_13.getText());
			        double num15 = Double.parseDouble(textField_14.getText());
			        double num16 = Double.parseDouble(textField_15.getText());
			        double num17 = Double.parseDouble(textField_16.getText());
			        double num18 = Double.parseDouble(textField_17.getText());

			   
			        double det2 = num10 * (num14 * num18 - num15 * num17)
			                - num11 * (num13 * num18 - num15 * num16)
			                + num12 * (num13 * num17 - num14 * num16);
			        
			        if (det2 == 0) {
			            JOptionPane.showMessageDialog(frame, "La matriz no tiene inversa");
			            return;
			        }

			        double invDet2 = 1 / det2;

			        double resu1 = (num14 * num18 - num15 * num17) * invDet2;
			        double resu2 = -(num11 * num18 - num12 * num17) * invDet2;
			        double resu3 = (num11 * num15 - num12 * num14) * invDet2;
			        double resu4 = -(num13 * num18 - num15 * num16) * invDet2;
			        double resu5 = (num10 * num18 - num12 * num16) * invDet2;
			        double resu6 = -(num10 * num15 - num12 * num13) * invDet2;
			        double resu7 = (num13 * num17 - num14 * num16) * invDet2;
			        double resu8 = -(num10 * num17 - num11 * num16) * invDet2;
			        double resu9 = (num10 * num14 - num11 * num13) * invDet2;

			        res1.setText(String.format("%.2f", resu1));
			        res2.setText(String.format("%.2f", resu2));
			        res3.setText(String.format("%.2f", resu3));
			        res4.setText(String.format("%.2f", resu4));
			        res5.setText(String.format("%.2f", resu5));
			        res6.setText(String.format("%.2f", resu6));
			        res7.setText(String.format("%.2f", resu7));
			        res8.setText(String.format("%.2f", resu8));
			        res9.setText(String.format("%.2f", resu9));
			}
		});
		btnNewButton_2_1.setBounds(277, 314, 122, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Multiplicar por");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numescalar2;
				numescalar2=Integer.parseInt(textField_18.getText());
				int num10;
				num10=Integer.parseInt(textField_9.getText());
				int num11;
				num11=Integer.parseInt(textField_10.getText());
				int num12;
				num12=Integer.parseInt(textField_11.getText());
				int num13;
				num13=Integer.parseInt(textField_12.getText());
				int num14;
				num14=Integer.parseInt(textField_13.getText());
				int num15;
				num15=Integer.parseInt(textField_14.getText());
				int num16;
				num16=Integer.parseInt(textField_15.getText());
				int num17;
				num17=Integer.parseInt(textField_16.getText());
				int num18;
				num18=Integer.parseInt(textField_17.getText());
				
				int resu1, resu2, resu3, resu4, resu5, resu6, resu7, resu8, resu9;
				resu1=num10*numescalar2;		
				resu2=num11*numescalar2;
				resu3=num12*numescalar2;
				resu4=num13*numescalar2;
				resu5=num14*numescalar2;
				resu6=num15*numescalar2;
				resu7=num16*numescalar2;
				resu8=num17*numescalar2;
				resu9=num18*numescalar2;

				res1.setText(""+resu1);
				res2.setText(""+resu2);
				res3.setText(""+resu3);
				res4.setText(""+resu4);
				res5.setText(""+resu5);
				res6.setText(""+resu6);
				res7.setText(""+resu7);
				res8.setText(""+resu8);
				res9.setText(""+resu9);
				
			}
		});
		btnNewButton_2_2.setBounds(277, 348, 122, 23);
		frame.getContentPane().add(btnNewButton_2_2);
		
		textField_18 = new JTextField();
		textField_18.setBounds(402, 348, 22, 22);
		frame.getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		JButton btnNewButton_2_2_1 = new JButton("Multiplicar por");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int numescalar;
			numescalar=Integer.parseInt(textField_19.getText());
			int num1;
			num1=Integer.parseInt(textField.getText());
			int num2;
			num2=Integer.parseInt(textField_1.getText());
			int num3;
			num3=Integer.parseInt(textField_2.getText());
			int num4;
			num4=Integer.parseInt(textField_3.getText());
			int num5;
			num5=Integer.parseInt(textField_4.getText());
			int num6;
			num6=Integer.parseInt(textField_5.getText());
			int num7;
			num7=Integer.parseInt(textField_6.getText());
			int num8;
			num8=Integer.parseInt(textField_7.getText());
			int num9;
			num9=Integer.parseInt(textField_8.getText());
			
			int resu1, resu2, resu3, resu4, resu5, resu6, resu7, resu8, resu9;
			resu1=num1*numescalar;		
			resu2=num2*numescalar;
			resu3=num3*numescalar;
			resu4=num4*numescalar;
			resu5=num5*numescalar;
			resu6=num6*numescalar;
			resu7=num7*numescalar;
			resu8=num8*numescalar;
			resu9=num9*numescalar;

			res1.setText(""+resu1);
			res2.setText(""+resu2);
			res3.setText(""+resu3);
			res4.setText(""+resu4);
			res5.setText(""+resu5);
			res6.setText(""+resu6);
			res7.setText(""+resu7);
			res8.setText(""+resu8);
			res9.setText(""+resu9);
			
			}
		});
		btnNewButton_2_2_1.setBounds(35, 348, 122, 23);
		frame.getContentPane().add(btnNewButton_2_2_1);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(161, 348, 22, 22);
		frame.getContentPane().add(textField_19);
		
		JTextPane txtpnMatrizA = new JTextPane();
		txtpnMatrizA.setEditable(false);
		txtpnMatrizA.setText("       Matriz A");
		txtpnMatrizA.setBounds(57, 139, 87, 20);
		frame.getContentPane().add(txtpnMatrizA);
		
		JTextPane txtpnMatrizB = new JTextPane();
		txtpnMatrizB.setEditable(false);
		txtpnMatrizB.setText("       Matriz B");
		txtpnMatrizB.setBounds(294, 139, 87, 20);
		frame.getContentPane().add(txtpnMatrizB);
		
		JButton btnNewButton_2_2_1_1 = new JButton("Division AxB");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
		        double num2 = Double.parseDouble(textField_1.getText());
		        double num3 = Double.parseDouble(textField_2.getText());
		        double num4 = Double.parseDouble(textField_3.getText());
		        double num5 = Double.parseDouble(textField_4.getText());
		        double num6 = Double.parseDouble(textField_5.getText());
		        double num7 = Double.parseDouble(textField_6.getText());
		        double num8 = Double.parseDouble(textField_7.getText());
		        double num9 = Double.parseDouble(textField_8.getText());
		        double num10 = Double.parseDouble(textField_9.getText());
		        double num11 = Double.parseDouble(textField_10.getText());
		        double num12 = Double.parseDouble(textField_11.getText());
		        double num13 = Double.parseDouble(textField_12.getText());
		        double num14 = Double.parseDouble(textField_13.getText());
		        double num15 = Double.parseDouble(textField_14.getText());
		        double num16 = Double.parseDouble(textField_15.getText());
		        double num17 = Double.parseDouble(textField_16.getText());
		        double num18 = Double.parseDouble(textField_17.getText());

		  
		        double det = num1 * (num5 * num9 - num6 * num8)
		                - num2 * (num4 * num9 - num6 * num7)
		                + num3 * (num4 * num8 - num5 * num7);
		        
		        if (det == 0) {
		            JOptionPane.showMessageDialog(frame, "La matriz no tiene inversa");
		            return;
		        }

		        double invDet = 1 / det;

		        double resu1 = (num5 * num9 - num6 * num8) * invDet;
		        double resu2 = -(num2 * num9 - num3 * num8) * invDet;
		        double resu3 = (num2 * num6 - num3 * num5) * invDet;
		        double resu4 = -(num4 * num9 - num6 * num7) * invDet;
		        double resu5 = (num1 * num9 - num3 * num7) * invDet;
		        double resu6 = -(num1 * num6 - num3 * num4) * invDet;
		        double resu7 = (num4 * num8 - num5 * num7) * invDet;
		        double resu8 = -(num1 * num8 - num2 * num7) * invDet;
		        double resu9 = (num1 * num5 - num2 * num4) * invDet;


		        double div1 = resu1 * num10 + resu2 * num13 + resu3 * num16;
		        double div2 = resu1 * num11 + resu2 * num14 + resu3 * num17;
		        double div3 = resu1 * num12 + resu2 * num15 + resu3 * num18;

		        double div4 = resu4 * num10 + resu5 * num13 + resu6 * num16;
		        double div5 = resu4 * num11 + resu5 * num14 + resu6 * num17;
		        double div6 = resu4 * num12 + resu5 * num15 + resu6 * num18;

		        double div7 = resu7 * num10 + resu8 * num13 + resu9 * num16;
		        double div8 = resu7 * num11 + resu8 * num14 + resu9 * num17;
		        double div9 = resu7 * num12 + resu8 * num15 + resu9 * num18;

		        
		        
		        res1.setText(String.format("%.2f", div1));
		        res2.setText(String.format("%.2f", div2));
		        res3.setText(String.format("%.2f", div3));
		        res4.setText(String.format("%.2f", div4));
		        res5.setText(String.format("%.2f", div5));
		        res6.setText(String.format("%.2f", div6));
		        res7.setText(String.format("%.2f", div7));
		        res8.setText(String.format("%.2f", div8));
		        res9.setText(String.format("%.2f", div9));	
				
			}
		});
		btnNewButton_2_2_1_1.setBounds(35, 382, 122, 23);
		frame.getContentPane().add(btnNewButton_2_2_1_1);
		
		
		res1 = new JLabel("");
		res1.setBounds(137, 33, 34, 20);
		frame.getContentPane().add(res1);
		
	    res2 = new JLabel("");
		res2.setBounds(193, 33, 34, 20);
		frame.getContentPane().add(res2);
		
	    res3 = new JLabel("");
		res3.setBounds(247, 33, 34, 20);
		frame.getContentPane().add(res3);
		
		res4 = new JLabel("");
		res4.setBounds(137, 64, 34, 20);
		frame.getContentPane().add(res4);
		
		res5 = new JLabel("");
		res5.setBounds(193, 64, 34, 20);
		frame.getContentPane().add(res5);
		
		res6 = new JLabel("");
		res6.setBounds(247, 64, 34, 20);
		frame.getContentPane().add(res6);
		
		res7 = new JLabel("");
		res7.setBounds(137, 95, 34, 20);
		frame.getContentPane().add(res7);
		
		res8 = new JLabel("");
		res8.setBounds(193, 95, 34, 20);
		frame.getContentPane().add(res8);
		
		res9 = new JLabel("");
		res9.setBounds(247, 95, 34, 20);
		frame.getContentPane().add(res9);
		
		
		JButton btnNewButton_2_2_1_1_1 = new JButton("Division BxA");
		btnNewButton_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textField.getText());
		        double num2 = Double.parseDouble(textField_1.getText());
		        double num3 = Double.parseDouble(textField_2.getText());
		        double num4 = Double.parseDouble(textField_3.getText());
		        double num5 = Double.parseDouble(textField_4.getText());
		        double num6 = Double.parseDouble(textField_5.getText());
		        double num7 = Double.parseDouble(textField_6.getText());
		        double num8 = Double.parseDouble(textField_7.getText());
		        double num9 = Double.parseDouble(textField_8.getText());
		        double num10 = Double.parseDouble(textField_9.getText());
		        double num11 = Double.parseDouble(textField_10.getText());
		        double num12 = Double.parseDouble(textField_11.getText());
		        double num13 = Double.parseDouble(textField_12.getText());
		        double num14 = Double.parseDouble(textField_13.getText());
		        double num15 = Double.parseDouble(textField_14.getText());
		        double num16 = Double.parseDouble(textField_15.getText());
		        double num17 = Double.parseDouble(textField_16.getText());
		        double num18 = Double.parseDouble(textField_17.getText());

		   
		        double det2 = num10 * (num14 * num18 - num15 * num17)
		                - num11 * (num13 * num18 - num15 * num16)
		                + num12 * (num13 * num17 - num14 * num16);
		        
		        if (det2 == 0) {
		            JOptionPane.showMessageDialog(frame, "La matriz no tiene inversa");
		            return;
		        }

		        double invDet2 = 1 / det2;

		        double resu1 = (num14 * num18 - num15 * num17) * invDet2;
		        double resu2 = -(num11 * num18 - num12 * num17) * invDet2;
		        double resu3 = (num11 * num15 - num12 * num14) * invDet2;
		        double resu4 = -(num13 * num18 - num15 * num16) * invDet2;
		        double resu5 = (num10 * num18 - num12 * num16) * invDet2;
		        double resu6 = -(num10 * num15 - num12 * num13) * invDet2;
		        double resu7 = (num13 * num17 - num14 * num16) * invDet2;
		        double resu8 = -(num10 * num17 - num11 * num16) * invDet2;
		        double resu9 = (num10 * num14 - num11 * num13) * invDet2;


		        double div1 = num1 * resu1 + num2 * resu4 + num3 * resu7;
		        double div2 = num1 * resu2 + num2 * resu5 + num3 * resu8;
		        double div3 = num1 * resu3 + num2 * resu6 + num3 * resu9;

		        double div4 = num4 * resu1 + num5 * resu4 + num6 * resu7;
		        double div5 = num4 * resu2 + num5 * resu5 + num6 * resu8;
		        double div6 = num4 * resu3 + num5 * resu6 + num6 * resu9;

		        double div7 = num7 * resu1 + num8 * resu4 + num9 * resu7;
		        double div8 = num7 * resu2 + num8 * resu5 + num9 * resu8;
		        double div9 = num7 * resu3 + num8 * resu6 + num9 * resu9;

		        
		        
		        res1.setText(String.format("%.2f", div1));
		        res2.setText(String.format("%.2f", div2));
		        res3.setText(String.format("%.2f", div3));
		        res4.setText(String.format("%.2f", div4));
		        res5.setText(String.format("%.2f", div5));
		        res6.setText(String.format("%.2f", div6));
		        res7.setText(String.format("%.2f", div7));
		        res8.setText(String.format("%.2f", div8));
		        res9.setText(String.format("%.2f", div9));	

			}
		});
		btnNewButton_2_2_1_1_1.setBounds(277, 382, 122, 23);
		frame.getContentPane().add(btnNewButton_2_2_1_1_1);
		
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
	        		this.dipose();
	        	}

				private void dipose() {
					// TODO Auto-generated method stub
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
	        textField_6.setText("");
	        textField_7.setText("");
	        textField_12.setText("");
	        textField_13.setText("");
	        textField_14.setText("");
	        textField_15.setText("");
	        textField_16.setText("");
	        textField_17.setText("");
	        textField_18.setText("");
	        textField_19.setText("");



	        res1.setText("");
	        res2.setText("");
	        res3.setText("");
	        res4.setText("");
	        res5.setText("");
	        res6.setText("");
	        res7.setText("");
	        res8.setText("");
	        res9.setText("");
	}

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			frame.setVisible(true);
		}
}