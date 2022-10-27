package TA20._Maven.TA20._Maven;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Ejercicio9 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JToggleButton tglbtnNewToggleButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9 frame = new Ejercicio9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon autobus = new ImageIcon("src/images/autobus_verde.png");
		ImageIcon fondo = new ImageIcon("src/images/azul.png");
		
		
		tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(21, 30, 580, 410);
		
		ImageIcon I = new ImageIcon(autobus.getImage().getScaledInstance(tglbtnNewToggleButton.getWidth(), tglbtnNewToggleButton.getHeight(), Image.SCALE_DEFAULT));
		
		tglbtnNewToggleButton.setIcon(fondo);
		tglbtnNewToggleButton.setSelectedIcon(autobus);
		
		
		
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_4.setBounds(461, 11, 140, 99);
		tglbtnNewToggleButton_4.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5.setBounds(462, 231, 140, 99);
		tglbtnNewToggleButton_5.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_11.setBounds(461, 341, 140, 99);
		tglbtnNewToggleButton_11.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_11);
		
		JToggleButton tglbtnNewToggleButton_5_1 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_1.setBounds(312, 231, 140, 99);
		tglbtnNewToggleButton_5_1.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_1);
		
		JToggleButton tglbtnNewToggleButton_5_2 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_2.setBounds(311, 341, 140, 99);
		tglbtnNewToggleButton_5_2.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_2);
		
		JToggleButton tglbtnNewToggleButton_5_3 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_3.setBounds(311, 121, 140, 99);
		tglbtnNewToggleButton_5_3.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_3);
		
		JToggleButton tglbtnNewToggleButton_5_4 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_4.setBounds(311, 11, 140, 99);
		tglbtnNewToggleButton_5_4.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_4);
		
		JToggleButton tglbtnNewToggleButton_5_5 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_5.setBounds(161, 11, 140, 99);
		tglbtnNewToggleButton_5_5.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_5);
		
		JToggleButton tglbtnNewToggleButton_5_6 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_6.setBounds(11, 11, 140, 99);
		tglbtnNewToggleButton_5_6.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_6);
		
		JToggleButton tglbtnNewToggleButton_5_7 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_7.setBounds(11, 121, 140, 99);
		tglbtnNewToggleButton_5_7.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_7);
		
		JToggleButton tglbtnNewToggleButton_5_8 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_8.setBounds(161, 121, 140, 99);
		tglbtnNewToggleButton_5_8.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_8);
		
		JToggleButton tglbtnNewToggleButton_5_9 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_9.setBounds(161, 231, 140, 99);
		tglbtnNewToggleButton_5_9.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_9);
		
		JToggleButton tglbtnNewToggleButton_5_10 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_10.setBounds(161, 341, 140, 99);
		tglbtnNewToggleButton_5_10.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_10);
		
		JToggleButton tglbtnNewToggleButton_5_11 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_11.setBounds(11, 231, 140, 99);
		tglbtnNewToggleButton_5_11.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_11);
		
		JToggleButton tglbtnNewToggleButton_5_12 = new JToggleButton("New toggle button");
		tglbtnNewToggleButton_5_12.setBounds(11, 341, 140, 99);
		tglbtnNewToggleButton_5_12.setIcon(fondo);
		contentPane.add(tglbtnNewToggleButton_5_12);
	}
}
