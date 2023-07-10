import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;


public class Menumatrices {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menumatrices window = new Menumatrices();
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
	public Menumatrices() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("2X2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			matrices2_2 newframe = new matrices2_2();
			
			newframe.setVisible(true);
			
			this.dispose();
				 
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(38, 98, 96, 113);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3X3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				matrices3_3 newframe = new matrices3_3();
				newframe.setVisible(true);
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(293, 98, 87, 113);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atras");
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
		frame.setVisible(true);
		
	}



}