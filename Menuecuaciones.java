import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class Menuecuaciones {

    private JFrame frame1;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Menuecuaciones window = new Menuecuaciones();
                    window.frame1.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Menuecuaciones() {
        initialize();
    }

    private void initialize() {
        frame1 = new JFrame();
        frame1.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
        frame1.setBounds(100, 100, 450, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.getContentPane().setLayout(null);
        
        Label presentacion = new Label("Has elegido hacer sistemas de ecuaciones. Elija si quiere hacer 2x2 o 3x3");
        presentacion.setBounds(0, 0, 434, 23);
        presentacion.setFont(new Font("Dialog", Font.PLAIN, 12));
        frame1.getContentPane().add(presentacion);
        
        JButton Atras = new JButton("Atras");
        Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calcu frame = new Calcu();
				
				frame.setVisible(true);
				
				this.dispose();
			}
			private void dispose() {
				// TODO Auto-generated method stub
				frame1.setVisible(false);
				
			}
        });

			
		
        Atras.setBounds(317, 221, 107, 29);
        frame1.getContentPane().add(Atras);
        
        Button Sistema2x2 = new Button("Sistema 2x2");
        Sistema2x2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dos_dos newframe2 = new dos_dos();
				
				newframe2.setVisible(true);
				
				this.dispose();
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame1.setVisible(false);
				
			}
		});
        Sistema2x2.setBounds(10, 55, 182, 139);
        frame1.getContentPane().add(Sistema2x2);
        
        Button Sistema3x3 = new Button("Sistema 3x3");
        Sistema3x3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tres_tres newframe1 = new tres_tres();
				
				newframe1.setVisible(true);
				
				this.dispose();
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame1.setVisible(false);
				
			}
		});
        
        Sistema3x3.setBounds(242, 55, 182, 139);
        frame1.getContentPane().add(Sistema3x3);
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
		frame1.setVisible(true);
	}
	
}