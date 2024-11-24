package com.example.EjerciciosDeInterfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {
	int num1, num2;
	String signo;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CajaResultado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 10, 358, 390);
		contentPane.add(panel);
		panel.setLayout(null);
		
		CajaResultado = new JTextField();
		CajaResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		CajaResultado.setFont(new Font("Arial", Font.BOLD, 14));
		CajaResultado.setBounds(10, 10, 338, 42);
		panel.add(CajaResultado);
		CajaResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText("");
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(10, 76, 70, 42);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(CajaResultado.getText());
				signo="/";
				CajaResultado.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(90, 76, 70, 42);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(CajaResultado.getText());
				signo="*";
				CajaResultado.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBounds(170, 76, 70, 42);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(CajaResultado.getText());
				signo="-";
				CajaResultado.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_3.setBounds(278, 76, 70, 42);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+7);
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_4.setBounds(10, 128, 70, 42);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+8);
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(90, 128, 70, 42);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+9);
			}
		});
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2_1.setBounds(170, 128, 70, 42);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("+");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(CajaResultado.getText());
				signo="+";
				CajaResultado.setText("");
			}
		});
		btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_3_1.setBounds(278, 128, 70, 94);
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+4);
			}
		});
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_5.setBounds(10, 180, 70, 42);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+5);
			}
		});
		btnNewButton_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_2.setBounds(90, 180, 70, 42);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+6);
			}
		});
		btnNewButton_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2_2.setBounds(170, 180, 70, 42);
		panel.add(btnNewButton_2_2);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+1);
			}
		});
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_6.setBounds(10, 232, 70, 42);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("2");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+2);
			}
		});
		btnNewButton_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_3.setBounds(90, 232, 70, 42);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("3");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+3);
			}
		});
		btnNewButton_2_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2_3.setBounds(170, 232, 70, 42);
		panel.add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("=");
		btnNewButton_3_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Integer.parseInt(CajaResultado.getText());
				
				switch(signo) {
				case "+":
					CajaResultado.setText(Integer.toString(num1 + num2));
					break;
				case "-":
					CajaResultado.setText(Integer.toString(num1 - num2));
					break;
				case "*":
					CajaResultado.setText(Integer.toString(num1 * num2));
					break;
				case "/":
					CajaResultado.setText(Integer.toString(num1 / num2));
					break;
				default:
					CajaResultado.setText("ERROR");
				
				}
			}
		});
		btnNewButton_3_3.setBounds(278, 232, 70, 117);
		panel.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_3_1 = new JButton("0");
		btnNewButton_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaResultado.setText(CajaResultado.getText()+0);
			}
		});
		btnNewButton_3_3_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_3_3_1.setBounds(10, 284, 230, 65);
		panel.add(btnNewButton_3_3_1);
	}
}
