import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tres_tres {

    private JFrame frame;
    private JTextField a1;
    private JTextField a2;
    private JTextField b1;
    private JTextField c1;
    private JTextField c2;
	private JTextField ResultadoY;
	private JTextField ResultadoX;
	private JTextField b2;
	private JTextField d1;
	private JTextField d2;
	private JTextField a3;
	private JTextField c3;
	private JTextField d3;
	private JTextField b3;
	private JTextField ResultadoZ;
	private JLabel ValorZ;
	private JButton Atras;
	private JLabel ValorZ_1;
	private JLabel ValorZ_2;
	private JLabel ValorZ_3;
	private JLabel ValorZ_4;
	private JLabel ValorZ_5;
	private JLabel ValorZ_6;
	private JLabel ValorZ_7;
	private JLabel ValorZ_8;
	private JLabel ValorZ_9;
	
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	tres_tres window = new tres_tres();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public tres_tres() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 269, 376);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        a1 = new JTextField();
        a1.setBounds(10, 11, 30, 30);
        frame.getContentPane().add(a1);
        a1.setColumns(10);

        a2 = new JTextField();
        a2.setBounds(10, 52, 30, 30);
        frame.getContentPane().add(a2);
        a2.setColumns(10);
        
        b1 = new JTextField();
        b1.setBounds(68, 11, 30, 30);
        frame.getContentPane().add(b1);
        b1.setColumns(10);
        
		b2 = new JTextField();
		b2.setColumns(10);
		b2.setBounds(68, 52, 30, 30);
		frame.getContentPane().add(b2);
        
        c1 = new JTextField();
        c1.setBounds(127, 11, 30, 30);
        frame.getContentPane().add(c1);
        c1.setColumns(10);
        
        c2 = new JTextField();
        c2.setColumns(10);
        c2.setBounds(127, 52, 30, 30);
        frame.getContentPane().add(c2);
		
		ResultadoY = new JTextField();
		ResultadoY.setColumns(10);
		ResultadoY.setBounds(30, 249, 30, 30);
		frame.getContentPane().add(ResultadoY);
		
		JLabel ValorX = new JLabel("x =");
		ValorX.setBounds(10, 205, 23, 32);
		frame.getContentPane().add(ValorX);
		
		JLabel ValorY = new JLabel("y =");
		ValorY.setBounds(10, 248, 23, 32);
		frame.getContentPane().add(ValorY);
		
		ResultadoX = new JTextField();
		ResultadoX.setColumns(10);
		ResultadoX.setBounds(30, 208, 30, 30);
		frame.getContentPane().add(ResultadoX);
		JButton SolucionBoton = new JButton("Solucion");
		SolucionBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SolucionBoton.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {		    	
		    	double a = Double.parseDouble(a1.getText());
		        double b = Double.parseDouble(b1.getText());
		        double c = Double.parseDouble(c1.getText());
		        double d = Double.parseDouble(d1.getText());
		        double e1 = Double.parseDouble(a2.getText());
		        double f = Double.parseDouble(b2.getText());
		        double g = Double.parseDouble(c2.getText());
		        double h = Double.parseDouble(d2.getText());
		        double i = Double.parseDouble(a3.getText());
		        double j = Double.parseDouble(b3.getText());
		        double k = Double.parseDouble(c3.getText());
		        double l = Double.parseDouble(d3.getText());

		        double determinantePrincipal = (a * f * k) + (b * g * i) + (c * e1 * j) - (c * f * i) - (b * e1 * k) - (a * g * j);
		        double determinanteX = (d * f * k) + (b * g * l) + (c * h * j) - (c * f * l) - (b * h * k) - (d * g * j);
		        double determinanteY = (a * h * k) + (d * g * i) + (c * e1 * l) - (c * h * i) - (d * e1 * k) - (a * g * l);
		        double determinanteZ = (a * f * l) + (b * h * i) + (d * e1 * j) - (d * f * i) - (b * e1 * l) - (a * h * j);

		        double valorX = determinanteX / determinantePrincipal;
		        double valorY = determinanteY / determinantePrincipal;
		        double valorZ = determinanteZ / determinantePrincipal;

		        ResultadoX.setText(String.valueOf(valorX));
		        ResultadoY.setText(String.valueOf(valorY));
		        ResultadoZ.setText(String.valueOf(valorZ));
			}
		});
		SolucionBoton.setBounds(10, 152, 99, 30);
		frame.getContentPane().add(SolucionBoton);
		
		d1 = new JTextField();
		d1.setColumns(10);
		d1.setBounds(187, 11, 30, 30);
		frame.getContentPane().add(d1);
		
		d2 = new JTextField();
		d2.setColumns(10);
		d2.setBounds(187, 52, 30, 30);
		frame.getContentPane().add(d2);
		
		a3 = new JTextField();
		a3.setColumns(10);
		a3.setBounds(10, 92, 30, 30);
		frame.getContentPane().add(a3);
		
		c3 = new JTextField();
		c3.setColumns(10);
		c3.setBounds(127, 93, 30, 30);
		frame.getContentPane().add(c3);
		
		d3 = new JTextField();
		d3.setColumns(10);
		d3.setBounds(187, 92, 30, 30);
		frame.getContentPane().add(d3);
		
		b3 = new JTextField();
		b3.setColumns(10);
		b3.setBounds(68, 93, 30, 30);
		frame.getContentPane().add(b3);
		
		ResultadoZ = new JTextField();
		ResultadoZ.setColumns(10);
		ResultadoZ.setBounds(30, 290, 30, 30);
		frame.getContentPane().add(ResultadoZ);
		
		ValorZ = new JLabel("z =");
		ValorZ.setBounds(10, 290, 23, 32);
		frame.getContentPane().add(ValorZ);
		
		Atras = new JButton("Atras");
		Atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menuecuaciones newframe1 = new Menuecuaciones();
				
				newframe1.setVisible(true);
				
				this.dispose();
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				
			}
		});
		Atras.setBounds(144, 296, 99, 30);
		frame.getContentPane().add(Atras);
		
		ValorZ_1 = new JLabel("z =");
		ValorZ_1.setBounds(165, 10, 23, 32);
		frame.getContentPane().add(ValorZ_1);
		
		ValorZ_2 = new JLabel("z =");
		ValorZ_2.setBounds(167, 51, 23, 32);
		frame.getContentPane().add(ValorZ_2);
		
		ValorZ_3 = new JLabel("z =");
		ValorZ_3.setBounds(167, 93, 23, 32);
		frame.getContentPane().add(ValorZ_3);
		
		ValorZ_4 = new JLabel("x +");
		ValorZ_4.setBounds(46, 10, 23, 32);
		frame.getContentPane().add(ValorZ_4);
		
		ValorZ_5 = new JLabel("y +");
		ValorZ_5.setBounds(103, 10, 23, 32);
		frame.getContentPane().add(ValorZ_5);
		
		ValorZ_6 = new JLabel("x +");
		ValorZ_6.setBounds(46, 51, 23, 32);
		frame.getContentPane().add(ValorZ_6);
		
		ValorZ_7 = new JLabel("x +");
		ValorZ_7.setBounds(47, 91, 23, 32);
		frame.getContentPane().add(ValorZ_7);
		
		ValorZ_8 = new JLabel("y +");
		ValorZ_8.setBounds(103, 51, 23, 32);
		frame.getContentPane().add(ValorZ_8);
		
		ValorZ_9 = new JLabel("y +");
		ValorZ_9.setBounds(103, 93, 23, 32);
		frame.getContentPane().add(ValorZ_9);
    }

	public void setVisible(boolean b) {
		
		frame.setVisible(true);
	}
}
    