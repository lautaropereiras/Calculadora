import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class dos_dos {

    private JFrame frame;
    private JTextField A;
    private JTextField D;
    private JTextField B;
    private JTextField C;
    private JTextField F;
	private JTextField ResultadoY;
	private JTextField ResultadoX;
	private JTextField Eigual;
	private JButton Atras;
	private JLabel YIgual;
	private JLabel YIgual_1;
	
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	dos_dos window = new dos_dos();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public dos_dos() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 232, 369);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        A = new JTextField();
        A.setBounds(10, 11, 30, 30);
        frame.getContentPane().add(A);
        A.setColumns(10);

        D = new JTextField();
        D.setBounds(10, 52, 30, 30);
        frame.getContentPane().add(D);
        D.setColumns(10);
        
        B = new JTextField();
        B.setBounds(63, 11, 30, 30);
        frame.getContentPane().add(B);
        B.setColumns(10);
        
		Eigual = new JTextField();
		Eigual.setColumns(10);
		Eigual.setBounds(63, 52, 30, 30);
		frame.getContentPane().add(Eigual);
        
        C = new JTextField();
        C.setBounds(126, 11, 30, 30);
        frame.getContentPane().add(C);
        C.setColumns(10);
        
        F = new JTextField();
        F.setColumns(10);
        F.setBounds(126, 52, 30, 30);
        frame.getContentPane().add(F);
		
		ResultadoY = new JTextField();
		ResultadoY.setColumns(10);
		ResultadoY.setBounds(30, 200, 30, 30);
		frame.getContentPane().add(ResultadoY);
		
		JLabel ValorX = new JLabel("x =");
		ValorX.setBounds(10, 159, 23, 32);
		frame.getContentPane().add(ValorX);
		
		JLabel ValorY = new JLabel("y =");
		ValorY.setBounds(10, 195, 23, 32);
		frame.getContentPane().add(ValorY);
		
		ResultadoX = new JTextField();
		ResultadoX.setColumns(10);
		ResultadoX.setBounds(30, 160, 30, 30);
		frame.getContentPane().add(ResultadoX);
		JButton SolucionBoton = new JButton("Solucion");
		SolucionBoton.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {		    	
		    	double a = Double.parseDouble(A.getText());
		    	double b = Double.parseDouble(B.getText());
		    	double c = Double.parseDouble(C.getText());
		    	double d = Double.parseDouble(D.getText());
		    	double E = Double.parseDouble(Eigual.getText());
		    	double f = Double.parseDouble(F.getText());

	                double determinante = a * E - b * d;

	                if (determinante != 0) {
	                    double x = (c * E - b * f) / determinante;
	                    double y = (a * f - c * d) / determinante;

	                    ResultadoX.setText(Double.toString(x));
	                    ResultadoY.setText(Double.toString(y));
	                } else {
	                    ResultadoX.setText("N/A");
	                    ResultadoY.setText("N/A");
	                }
		    }
		});
		SolucionBoton.setBounds(10, 118, 99, 30);
		frame.getContentPane().add(SolucionBoton);
		
		Atras = new JButton("Atras");
		Atras.setBounds(107, 289, 99, 30);
		 Atras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Menuecuaciones newframe2 = new Menuecuaciones();
					
					newframe2.setVisible(true);
					
					this.dispose();
					
					
				}

				private void dispose() {
					// TODO Auto-generated method stub
					frame.setVisible(false);
					
				}
			});
		frame.getContentPane().add(Atras);
		
		YIgual = new JLabel("y =");
		YIgual.setBounds(103, 10, 23, 32);
		frame.getContentPane().add(YIgual);
		
		JLabel XMas = new JLabel("x +");
		XMas.setBounds(42, 19, 23, 14);
		frame.getContentPane().add(XMas);
		
		JLabel XMas_1 = new JLabel("x +");
		XMas_1.setBounds(42, 60, 23, 14);
		frame.getContentPane().add(XMas_1);
		
		YIgual_1 = new JLabel("y =");
		YIgual_1.setBounds(103, 51, 23, 32);
		frame.getContentPane().add(YIgual_1);
    }

	public void setVisible(boolean e) {
		// TODO Auto-generated method stub
		
		frame.setVisible(true);
	}
    }